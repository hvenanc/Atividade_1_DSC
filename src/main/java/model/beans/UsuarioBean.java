package model.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.List;

import jakarta.ejb.EJB;
import jakarta.ejb.Local;
import jakarta.ejb.Stateless;
import model.entities.Usuario;
import repository.UsuarioRepository;


@Local
@Stateless
public class UsuarioBean {
	
	@EJB
	private UsuarioRepository usuarioRepository;

	public boolean validaSenha(Usuario usuario) {

		String senha = usuario.getSenha();
		return senha.length() >= 8 || senha.length() <= 16;

	}

	public boolean validaCep(Usuario usuario) {

		String cep = usuario.getCep();
		return cep.length() == 8;
	}

	public boolean validaData(Usuario usuario) {

		String data = usuario.getDataNasc();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try {
            sdf.parse(data);
            return true;
        } catch (ParseException e) {
            return false;
        }
	}
	
	public boolean validaCPF(String CPF) {
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		        if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
		                CPF.equals("22222222222") || CPF.equals("33333333333") ||
		                CPF.equals("44444444444") || CPF.equals("55555555555") ||
		                CPF.equals("66666666666") || CPF.equals("77777777777") ||
		                CPF.equals("88888888888") || CPF.equals("99999999999") ||
		                (CPF.length() != 11))
		            return (false);

		        char dig10, dig11;
		        int sm, i, r, num, peso;


		        try {
		// Calculo do 1o. Digito Verificador
		            sm = 0;
		            peso = 10;
		            for (i = 0; i < 9; i++) {

		                num = (int) (CPF.charAt(i) - 48);
		                sm = sm + (num * peso);
		                peso = peso - 1;
		            }

		            r = 11 - (sm % 11);
		            if ((r == 10) || (r == 11))
		                dig10 = '0';
		            else dig10 = (char) (r + 48);

		// Calculo do 2o. Digito Verificador
		            sm = 0;
		            peso = 11;
		            for (i = 0; i < 10; i++) {
		                num = (int) (CPF.charAt(i) - 48);
		                sm = sm + (num * peso);
		                peso = peso - 1;
		            }

		            r = 11 - (sm % 11);
		            if ((r == 10) || (r == 11))
		                dig11 = '0';
		            else dig11 = (char) (r + 48);

		// Verifica se os digitos calculados conferem com os digitos informados.
		            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
		                return (true);
		            else return (false);
		        } catch (InputMismatchException erro) {
		            return (false);
		        }
		    }
	
	public void adcionarUsuario(Usuario usuario) {
		
		if(usuario != null && usuario.getNomeUsuario() != null && usuario.getEmail() != null && 
				validaCPF(usuario.getCpf()) && validaCep(usuario) && validaSenha(usuario) && validaData(usuario)) {
			this.usuarioRepository.cadastrarUsuario(usuario);
		}
		
	}
	
	public List <Usuario> getUsuarios() {
		return this.usuarioRepository.getUsuarios();
	}
	
	

}

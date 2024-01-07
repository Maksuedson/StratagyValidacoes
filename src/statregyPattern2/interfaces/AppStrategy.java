package statregyPattern2.interfaces;

import java.util.ArrayList;
import java.util.List;

import statregyPattern2.Usuario;

public class AppStrategy {

	public static void main(String[] args) {

		Usuario usuario = new Usuario("Matheus", 18);
		
		List<ICadastro> validacoes = new ArrayList<>();
		validacoes.add(new NaoPodeSerMenorQueTres());
		validacoes.add(new NaoPodeSerMaiorQueSessenta());
		validacoes.add(new NaoPodeSerMaiorQueQuinze());
		validacoes.add(new IdadeNaoPodeSerMenorQueDezoito());
		 
		validacoes.forEach(validacao -> validacao.validar(usuario));
		
		cadastrar(usuario);
	}
	
	static void cadastrar(Usuario usuario){
	
		System.out.println("O usuário " + usuario + "cadastrado");
	}

}

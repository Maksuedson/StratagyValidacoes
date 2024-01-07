package statregyPattern2.interfaces;

import statregyPattern2.Usuario;

public class IdadeNaoPodeSerMenorQueDezoito implements ICadastro{

	@Override
	public void validar(Usuario usuario) {
		if (usuario.getIdade() < 18) {
			throw new RuntimeException("Idade não pode ter menor que 18");
		}	
	}

}

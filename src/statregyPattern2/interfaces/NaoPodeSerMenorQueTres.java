package statregyPattern2.interfaces;

import statregyPattern2.Usuario;

public class NaoPodeSerMenorQueTres implements ICadastro{

	@Override
	public void validar(Usuario usuario) {
		if (usuario.getNome().length() < 3) {
			throw new RuntimeException("Nome não pode ter menos que 3 caracteres");
		}		
	}

}

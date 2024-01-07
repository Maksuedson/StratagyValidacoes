package statregyPattern2.interfaces;

import statregyPattern2.Usuario;

public class NaoPodeSerMaiorQueQuinze implements ICadastro{

	@Override
	public void validar(Usuario usuario) {
		if (usuario.getNome().length() > 15) {
			throw new RuntimeException("Nome não pode ter maior que 15 caracteres");
		}		
	}

}

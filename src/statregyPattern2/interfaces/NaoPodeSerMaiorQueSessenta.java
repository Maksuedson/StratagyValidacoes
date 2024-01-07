package statregyPattern2.interfaces;

import statregyPattern2.Usuario;

public class NaoPodeSerMaiorQueSessenta implements ICadastro{

	@Override
	public void validar(Usuario usuario) {
		if (usuario.getIdade() > 60) {
			throw new RuntimeException("Idade não pode ter maior que 60");
		}		
	}

}

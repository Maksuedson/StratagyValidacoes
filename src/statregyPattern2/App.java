package statregyPattern2;

public class App {

	public static void main(String[] args) {

		Usuario usuario = new Usuario("Matheus", 20);
		
		if (usuario.getNome().length() < 3) {
			throw new RuntimeException("Nome não pode ter menos que 3 caracteres");
		}
		
		if (usuario.getNome().length() > 15) {
			throw new RuntimeException("Nome não pode ter maior que 15 caracteres");
		}
		
		if (usuario.getIdade() < 18) {
			throw new RuntimeException("Idade não pode ter menor que 18");
		}
		
		if (usuario.getIdade() > 60) {
			throw new RuntimeException("Idade não pode ter maior que 60");
		}
		
		cadastrar(usuario);
	}
	
	static void cadastrar(Usuario usuario){
	
		System.out.println("O usuário " + usuario + "cadastrado");
	}

}

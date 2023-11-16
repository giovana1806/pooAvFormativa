package prova;

public class Principal {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		Usuario usuario1 = new Usuario(9, "giovana", 131989, "permitido", "gi_betareli");
		
		System.out.println(usuario1.getId());
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getPassword());
		System.out.println(usuario1.getPermissao());
		System.out.println(usuario1.getUsuario());

	}

}

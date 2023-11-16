package prova;

public class PrincipalPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Maria");
		Fisica fisica = new Fisica("Mariana", "123-4567-8910/2", "123.456.789-10");
		
		System.out.println("---------PESSOA-----------");
		System.out.println(pessoa.getNome());
		System.out.println("---------PESSOA FISICA-----------");
		System.out.println(fisica.getNome());
		System.out.println(fisica.getCpf());
		System.out.println(fisica.getRg());
	}
}

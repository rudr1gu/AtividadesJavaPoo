public class App {
	
	public static void main (String[] args) {
		
		//Criei duas instancias e atribui nome a elas.
		Pessoa jPessoa = new Pessoa("José");
		Pessoa mPessoa = new Pessoa("Maria");
		
		//atribui idade e nome a instancias utilizando o método setter
		//porem um novo nome só podera ser atribuido se a idade for maior que 18
		jPessoa.setIdade(7);
		jPessoa.setNome("Josué");
		
		mPessoa.setIdade(22);
		mPessoa.setNome("Mariana");
		
		//verificando se o método esta funcionando.
		System.out.println(jPessoa.getNome());
		System.out.print(mPessoa.getNome());

	}

}

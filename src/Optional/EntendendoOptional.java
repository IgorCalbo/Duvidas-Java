package Optional;

import java.util.Optional;

public class EntendendoOptional {

	public static void main(String[] args) {

		// optional � como se fosse uma caixa, pode ter algo l� dentro ou n�o
		Optional <Gato> gatoOpcional = buscaGatoPorNome("Fred");
			
		// primeiro jeito de fazer, n�o recomendado
		if (gatoOpcional.isPresent()) {
			System.out.println(gatoOpcional.get().getIdade());
		}
		else {
			System.out.println("N�o encontramos esse gato na caixa");
		}
		
		// segundo jeito
		Gato meuGato = gatoOpcional.orElse(new Gato("Chico",4));
		System.out.println(meuGato.getNome());
		
	}

	private static Optional<Gato> buscaGatoPorNome (String nome) {
		Gato gato = new Gato(nome, 3); // instanciando aqui, pois n�o tem integra��o com o banco de dados
		return Optional.ofNullable(gato);
	}
	
}

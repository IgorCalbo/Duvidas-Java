package Valores;
import java.util.Arrays;

public class exercicioValores {

	public static void main(String[] args) {

		int[] valores = {10,3,7,11,19,5,0};
		
		Arrays.sort(valores);
		System.out.println(valores[0]);
		
		int menorNumero = valores[0];
		int maiorNumero = valores[0];
		
		for (int x = 0; x < valores.length; x++) {
			if (valores[x] < menorNumero)
				menorNumero = valores[x];
			if (valores[x] > maiorNumero)
				maiorNumero = valores[x];
		}
		
		System.out.println("O menor valor é: " + menorNumero);
		System.out.println("O maior valor é: " + maiorNumero);
		
	}

}

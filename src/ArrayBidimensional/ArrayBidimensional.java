package ArrayBidimensional;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		// mesma coisa que -> int[][] matriz = new int [3][3];
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; 
		// poderia ser {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, o importante é definir qtd linhas e colunas;
		
		System.out.println("matriz com um for dentro do outro");
		for (int linha = 0; linha < matriz.length; linha++) { // matriz.length = 3 linhas
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) { // matriz[linha].lenght = cada linha tem 3 colunas
				matriz[linha][coluna] = linha * coluna;
				System.out.print(matriz[linha][coluna] + "\t");
			}
			System.out.println();
		}
		
		// fazendo com foreach
		System.out.println();
		System.out.println("matriz com foreach");
		System.out.println();
		for (int[] cadaLinha : matriz) {
			for (int coluna : cadaLinha) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
		
	}
	
}

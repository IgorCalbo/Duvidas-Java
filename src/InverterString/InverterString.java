package InverterString;

public class InverterString {

	public static void main(String[] args) {
		
		String ola = "Olá Mundo!";
		
		Inversor inv = new Inversor();
		
		// método 1 - usando StringBuilder
		System.out.println("método 1: " + new StringBuilder(ola).reverse().toString());
		System.out.println();
		
		// método 2 - usando StringBuilder mas fazendo o reverse na mão
		System.out.println("método 2: " + inv.Inverte1(ola));
		System.out.println();
		
		// método 3 - não usando StringBuilder
		System.out.println("método 3: " + inv.Inverte2(ola));
		System.out.println();
	}
	
}

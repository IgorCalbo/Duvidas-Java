package InverterString;

public class InverterString {

	public static void main(String[] args) {
		
		String ola = "Ol� Mundo!";
		
		Inversor inv = new Inversor();
		
		// m�todo 1 - usando StringBuilder
		System.out.println("m�todo 1: " + new StringBuilder(ola).reverse().toString());
		System.out.println();
		
		// m�todo 2 - usando StringBuilder mas fazendo o reverse na m�o
		System.out.println("m�todo 2: " + inv.Inverte1(ola));
		System.out.println();
		
		// m�todo 3 - n�o usando StringBuilder
		System.out.println("m�todo 3: " + inv.Inverte2(ola));
		System.out.println();
	}
	
}

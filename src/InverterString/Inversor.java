package InverterString;

public class Inversor {

	// StringBuilder - String dinamica
	public String Inverte1(String palavra) {
		int tamanhoPalavra = palavra.length();
		StringBuilder x = new StringBuilder(tamanhoPalavra);

		for (int i = (tamanhoPalavra - 1); i >= 0; i--) {
			x.append(palavra.charAt(i));
		}

		return x.toString();
	}

	public String Inverte2(String palavra) {
		char[] letrasPalavra = palavra.toCharArray();
		int primeira = 0;
		int ultima = letrasPalavra.length - 1;
		char temporaria;
		while (ultima > primeira) {
			temporaria = letrasPalavra[primeira];
			letrasPalavra[primeira] = letrasPalavra[ultima];
			letrasPalavra[ultima] = temporaria;
			ultima--;
			primeira++;
		}

		return new String(letrasPalavra);
	}

}

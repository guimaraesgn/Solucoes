package situacoes;

public class situacao2 {

	public static void main(String[] args) {
		new modelo().velocidade();

	}
}

class modelo implements Bvelocidade {
	public static final String Memoria = null;

	public modelo() {
		System.out.println("Modelo Nissan 350z");
	}
}

interface Bvelocidade extends Alimite {
	public default void velocidade() {
		System.out.println("Velocidade: 260km por hora.");
	}
}

interface Alimite {
	public default void llimte() {
		System.out.println("Limite de 100km por hora.");
	}
}

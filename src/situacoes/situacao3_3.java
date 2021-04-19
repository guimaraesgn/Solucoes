package situacoes;

public class situacao3_3 {
public static void main(String[] args) {

	}


	interface Computador extends Memoria {
		public default void Bvelocidade() {
			System.out.println("Velocidade: 260km por hora.");
		}
	}

	interface Memoria {
		public default void mmemoria() {
			System.out.println("Limite de 100km por hora.");
		}
	}

class model implements Computador {
	public model() {
		System.out.println("Modelo Nissan 350z");
	}
}
}
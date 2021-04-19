package situacoes;

public class situacao1 {

	public static void main(String[] args) {
		new modelo().carro();
		new modelo().velocidade();
		new estrada().iestrada();
		new modelo().llimte();
		
	}
	static class estrada{
		public void iestrada(){
			System.out.println("Estrada do Rio de Janeiro");
		}
				
	}
static class modelo extends estrada implements velocidade, ilimite{

	public void carro() {
		System.out.println("Modelo: Nissan 350z");
		
	}
	
				
		 
		 
	}
interface velocidade{
		default void velocidade() {
		System.out.println("Velocidade: 260km por hora.");
	}
}
interface ilimite{
		default void llimte() {
		System.out.println("Limite de 100km por hora.");
	}
}
}



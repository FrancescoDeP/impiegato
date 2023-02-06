package modificatoreStatic;

public class Contatore {
	
	public static int contatore;
	
	public Contatore() {
		contatore++;
	}
	
	public static int incrementaContatore() {
		return ++contatore;
	}
	
	public static int decrementaContatore() {
		return --contatore;
	}
	
	public static int resetContatore() {
		return contatore = 0;
	}
	
	public static int getContatore() {
		return contatore;
	}
	
	
	public static void main(String[] args) {
		
		Contatore c = new Contatore();
		Contatore c1 = new Contatore();
		Contatore c2 = new Contatore();
		
		System.out.println(Contatore.getContatore());
		System.out.println(Contatore.decrementaContatore());
		System.out.println(Contatore.incrementaContatore());
		System.out.println(Contatore.getContatore());
		System.out.println(Contatore.resetContatore());
	}

}

package impiegato;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Impiegato i1 = new Impiegato("Francesco", "De Pompeis", 2000, 28, 1230.50);
		Impiegato i2 = new Impiegato("Marco", "Esposito", 250, 10, 1000.20);
		Impiegato i3 = new Impiegato("Sara", "Verdi", 800, 40, 1560.30);
		Impiegato i4 = new Impiegato("Giovanni", "Rossi", 250, 10, 1100.70);

		System.out.println("FrancescoDeP");
		//resto ferie
		System.out.println(i1.restoFerie(10));
		System.out.println(i2.restoFerie(10));
		System.out.println(i3.restoFerie(41));
		System.out.println("-----------------------------");
		
		//anzianità
		i1.diffAnzianita(i2);
		i3.diffAnzianita(i2);
		i2.diffAnzianita(i4);
		System.out.println("-----------------------------");
		
		//aumento paga
		System.out.println(i2.aumentoPaga());
		System.out.println(i1.aumentoPaga());
		System.out.println(i3.aumentoPaga());
		System.out.println("------------------------------");
		
		//chi guadagna di più
		i1.chiGuadagnaDiPiu(i2, i3);
		System.out.println("-------------------------------");
		
		//quanti dipendenti lavorano in azienda
		System.out.println(Impiegato.getPersonale());

	}

}

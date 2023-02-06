package impiegato;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Impiegato i1 = new Impiegato("Francesco", "De Pompeis", 6, 28, 1230.50);
		Impiegato i2 = new Impiegato("Marco", "Esposito", 1, 10, 1000.20);
		Impiegato i3 = new Impiegato("Sara", "Verdi", 2, 40, 1560.30);
		Impiegato i4 = new Impiegato("Giovanni", "Rossi", 1, 10, 1100.70);

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
		System.out.println("Marco Esposito guadagna: " + i2.aumentoPaga());
		System.out.println("Francesco De Pompeis guadagnava: " + i1.getSalario()+ ". Ora guadagna: "+ i1.aumentoPaga());
		System.out.println("Sara Verdi guadagnava: " + i3.getSalario() + ". Ora guadagna: " + i3.aumentoPaga());
		System.out.println("------------------------------");
		
		//chi guadagna di più
		i1.chiGuadagnaDiPiu(i2, i3);
		System.out.println("-------------------------------");
		
		//quanti dipendenti lavorano in azienda
		System.out.println("Numero totale impiegati: " + Impiegato.getPersonale());

	}

}

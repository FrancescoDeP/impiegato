package impiegato;

public class Impiegato {
	
	private String nome;
	private String cognome;
	private int anzianita;
	private int ferie;
	private double salario;
	private static int personale;
	
	public Impiegato() {
		
	}
	
	public Impiegato(String nome, String cognome, int anzianita, int ferie, double salario) {
		this.nome = nome;
		this.cognome = cognome;
		this.anzianita = anzianita;
		this.ferie = ferie;
		this.salario = salario;
		personale++;
	}
	
	public int restoFerie(int ferie) {
		if(this.ferie - ferie < 0) {
			System.out.print("Hai richiesto un eccesso di ferie, ne hai solamente: ");
			return this.ferie;
		}else if(this.ferie - ferie == 0) {
			System.out.println("Hai terminato i giorni di ferie, non puoi chiederne altri");
		}
		return this.ferie - ferie;
	}
	
	public void diffAnzianita(Impiegato i) {
		if(this.anzianita < i.anzianita) {
			System.out.println(i.nome + " " + i.cognome + " Lavora da più tempo");
			return;
		}else if(this.anzianita > i.anzianita) {
			System.out.println(this.nome + " " + this.cognome + " Lavora da più tempo");
		}else {
			System.out.println(this.nome + " " + this.cognome + " e " + i.nome + " " + i.cognome + " Lavorano dallo stesso giorno");
		}
	}
	
	public double aumentoPaga() {
		if(this.anzianita >= 2) {
			return this.salario + this.salario * 10 / 100;
		}else if(this.anzianita >= 5) {
			return this.salario + this.salario * 15 / 100;
		}
		return this.salario;
	}
	
	public void chiGuadagnaDiPiu(Impiegato i1, Impiegato i2) {
		if((this.salario > i1.salario) && (this.salario > i2.salario)) {
			System.out.println(this.nome + " " + this.cognome + " guadagna più di tutti");
		}else if((i1.salario > this.salario) && (i1.salario > i2.salario)) {
			System.out.println(i1.nome + " " + i1.cognome + " guadagna più di tutti");
		}else {
			System.out.println(i2.nome + " " + i2.cognome + " guadagna più di tutti: " + i2.salario);
		}
	}
	
	public static int getPersonale() {
		return personale;
	}

	public static void setPersonale(int personale) {
		Impiegato.personale = personale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getAnzianita() {
		return anzianita;
	}

	public void setAnzianita(int anzianita) {
		this.anzianita = anzianita;
	}

	public int getFerie() {
		return ferie;
	}

	public void setFerie(int ferie) {
		this.ferie = ferie;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return nome + " " + cognome + " " + anzianita + " " + ferie + " " + salario;
	}
}

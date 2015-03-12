package biblioteka;

public class Knjiga {
	
	private String naslov;
	private String autori;
	private String izdavac;
	private long ISBN;
	private int izdanje;
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getAutori() {
		return autori;
	}
	public void setAutori(String autori) {
		this.autori = autori;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", autori=" + autori + ", izdavac="
				+ izdavac + ", ISBN=" + ISBN + ", izdanje=" + izdanje + "]";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ISBN ^ (ISBN >>> 32));
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
	

}

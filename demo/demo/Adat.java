package demo;


public class Adat {

	private String egy;
	private String ketto;
	private String harom;

	public Adat(String line) {
		String[] tmp = line.split(" ");
		this.egy=tmp[0];
		this.ketto=tmp[1];
		this.harom=tmp[2];
	}
	public String getEgy() {
		return egy;
	}

	public String getKetto() {
		return ketto;
	}
	public String getHarom() {
		return harom;
	}
}

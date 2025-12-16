package controle2;

public class Arbitre {
	private String nom;
	private String prenom;
	private String code;
	
	public Arbitre(String nom, String prenom, String code ) {
		this.nom=nom;
		this.prenom=prenom;
		this.code=code;
	}
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getCode() {
		return code;
	}
	
	public String toString () {
		return prenom + "" + nom + " (code: " + code + " )";
	}
	

}

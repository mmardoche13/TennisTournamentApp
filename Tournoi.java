package controle2;

public class Tournoi {
	private String nom;
	private Date date;
	private Match[]matchs;
	private int nbMatchs;
	
	public Tournoi(String nom, Date date, int capacite) {
		this.nom=nom;
		this.date=date;
		this.matchs=new Match[capacite];
		this.nbMatchs=0;
	}
	public void ajouterMatch(Match match) {
        if (nbMatchs < matchs.length) {
            matchs[nbMatchs] = match;
            nbMatchs++;
        } else {
            System.out.println("Le tournoi est complet!");
        }
    }
	
	 public String getNom() {
	        return nom;
	    }
	    
	    public Date getDate() {
	        return date;
	    }
	    
	    public Match[] getMatchs() {
	        return matchs;
	    }
	    
	    public int getNombreMatchs() {
	        return nbMatchs;
	    }
	    
	    
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("=== Tournoi: ").append(nom).append(" ===\n");
	        sb.append("Date: ").append(date).append("\n");
	        sb.append("Nombre de matchs: ").append(nbMatchs).append("\n\n");
	        
	        for (int i = 0; i < nbMatchs; i++) {
	            sb.append(matchs[i]).append("\n\n");
	        }
	        
	        return sb.toString();

}
	    
	    }

package controle2;
class Match {
    private Joueur joueur1;
    private Joueur joueur2;
    private Arbitre arbitre;
    private String resultat;
    private Date date;
    
    public Match(Joueur joueur1, Joueur joueur2, Arbitre arbitre, String resultat, Date date) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.arbitre = arbitre;
        this.resultat = resultat;
        this.date = date;
    }
    
    public Joueur getJoueur1() {
        return joueur1;
    }
    
    public Joueur getJoueur2() {
        return joueur2;
    }
    
    public Arbitre getArbitre() {
        return arbitre;
    }
    
    public String getResultat() {
        return resultat;
    }
    
    public Date getDate() {
        return date;
    }
    
    // Méthode gagnerMatch qui retourne le nom complet du joueur gagnant
    public String gagnerMatch() {
        // Tire aléatoirement 0 ou 1
        int nombreAleatoire = (int) (Math.random() * 2);
        
        if (nombreAleatoire == 0) {
            // Le joueur1 gagne
            return joueur1.getNomComplet();
        } else {
            // Le joueur2 gagne
            return joueur2.getNomComplet();
        }
    }
    
    @Override
    public String toString() {
        return "Match du " + date + ":\n" +
               "  " + joueur1 + " vs " + joueur2 + "\n" +
               "  Arbitre: " + arbitre + "\n" +
               "  Résultat: " + resultat;
    }
}
package controle2;

public class TennisTournamentApp {
	public static void main(String[] args) {
        // Création des joueurs
        Joueur j1 = new Joueur("Nadal", "Rafael", 36);
        Joueur j2 = new Joueur("Djokovic", "Novak", 35);
        Joueur j3 = new Joueur("Federer", "Roger", 40);
        Joueur j4 = new Joueur("Medvedev", "Daniil", 26);
        
        // Création des arbitres
        Arbitre a1 = new Arbitre("Dupont", "Pierre", "A101");
        Arbitre a2 = new Arbitre("Martin", "Claire", "A102");
        
        // Création des dates
        Date dateMatch1 = new Date(12, 6, 2025);
        Date dateMatch2 = new Date(13, 6, 2025);
        
        // Création d'au moins deux matchs avec des joueurs et un arbitre
        Match m1 = new Match(j1, j2, a1, "6-4, 6-3", dateMatch1);
        Match m2 = new Match(j3, j4, a2, "7-6, 6-7, 6-2", dateMatch2);
        
        // Création du tournoi
        Date dateTournoi = new Date(12, 6, 2025);
        Tournoi tournoi = new Tournoi("Open de Test", dateTournoi, 10);
        
        // Ajout des matchs au tournoi
        tournoi.ajouterMatch(m1);
        tournoi.ajouterMatch(m2);
        
        // Appeler la méthode gagnerMatch pour chaque match
        // Afficher le nom du joueur gagnant pour chaque match
        System.out.println("Le gagnant du match " + j1.getPrenom() + " " + j1.getNom() + 
                         " VS " + j2.getPrenom() + " " + j2.getNom() + 
                         " est : " + m1.gagnerMatch());
        
        System.out.println("Le gagnant du match " + j3.getPrenom() + " " + j3.getNom() + 
                         " VS " + j4.getPrenom() + " " + j4.getNom() + 
                         " est : " + m2.gagnerMatch());
    }

}

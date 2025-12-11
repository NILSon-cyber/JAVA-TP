package Produit;

public class main {

	
	public static void main(String[] args) {
		Librairie maLibrairie = new Librairie() ;
		Livre nouveauLivre = new Livre("L003", "Les Trois Mousquetaires", 12.50, "Alexandre Dumas", 800);
		maLibrairie.ajouter(nouveauLivre);
		System.out.println("Le livre '" + nouveauLivre.gettitre() + "' a été ajouté à la librairie.");
		maLibrairie.afficher();
		
		Librairie MAGAZINE = new Librairie() ;
		Magazine nouveaumagazine = new Magazine("L004", "MGFTB", 12.50, 10, 1);
		MAGAZINE.ajouter(nouveaumagazine);
		System.out.println("La magazine '" + nouveaumagazine.gettitre() + "' a été ajouté à la librairie.");
		MAGAZINE.afficher();
		Magazine foot = new Magazine("ff5", "football", 19.50, 12, 6);
		MAGAZINE.ajouter(foot);
		System.out.println("La magazine '" + foot.gettitre() + "' a été ajouté à la librairie.");
		MAGAZINE.afficher();
	}

}

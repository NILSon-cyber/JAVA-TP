package Produit;
import java.util.ArrayList;


public class Librairie {
	private ArrayList<Produit> produits;

	public Librairie() {
        this.produits = new ArrayList<>();
    }
	public void ajouter(Produit p) {
        this.produits.add(p); 
    }
	public Produit rechercher(String code) { 
        for (Produit p : this.produits) {
            if (p.getCode().equals(code)) {
                return p; 
            }
        }
        return null; 
    }
	public void supprimer(String code) { 
        Produit p = rechercher(code);
        
        if (p != null) {
            this.produits.remove(p);
            System.out.println("Produit avec le code " + code + " supprimé.");
        } else {
            System.out.println("Erreur: Le produit avec le code " + code + " est introuvable (non supprimé).");
        }
    }
	public void afficher() {
        System.out.println("--- Catalogue de la Librairie ---");
        if (produits.isEmpty()) {
            System.out.println("Le catalogue est vide.");
            return;
        }
        for (Produit p : this.produits) {
            System.out.println("[" + p.getType() + "] " + p.toString());
        }
        System.out.println("---------------------------------");
    }
	public double totalPrixTTC() {
        double total = 0;
        for (Produit p : this.produits) {
            total += p.getPrixTTC();
        }
        return total;
    }
       


  
	

}

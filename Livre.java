package Produit;

public class Livre extends Produit {
	private String auteur; 
    private int pages; 
    
    
    public void setAuteur(String auteur) {
		this.auteur=auteur ;
	}
	public void setpages(int pages) {
	      this.pages=pages;
	      }
	public String getAuteur(String auteur) {
		return auteur;
	}
	public int getPages(int pages) {
	      return pages ;
	      }

    public Livre(String code, String titre, double prix, String auteur, int pages) {
        super(code, titre, prix); 
        this.auteur = auteur;
        this.pages = pages;
    }
    public String getType() { 
        return "Livre";
    }
    public String toString() {
        
        return super.toString() + ", Auteur: " + auteur + ", Pages: " + pages + ", Prix TTC: " + getPrixTTC() + "$"; 
    } 
    
}

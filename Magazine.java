package Produit;

public class Magazine extends Produit {
	private int mois; 
    private int numero; 
    
    public void setmois(int mois) {
		this.mois=mois ;
	}
	public void setpages(int numero) {
	      this.numero=numero;
	      }
	public int getmois(int mois) {
		return mois;
	}
	public int getnumero(int numero) {
	      return numero ;
	      }

    public Magazine(String code, String titre, double prix,int numero, int mois) {
        super(code, titre, prix); 
        this.mois = mois;
        this.numero = numero;
    }
    
    public String getType() { 
        return "Magazine";
    }
    public String toString() {
       
        return super.toString() + ", Mois: " + mois + ", Numéro: " + numero + ", Prix TTC: " + getPrixTTC() + "$"; 
    }
    

}

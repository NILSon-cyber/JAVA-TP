package Produit;

public abstract class Produit {
	private String code; 
    private String titre; 
    private double prix; 

    public Produit(String code, String titre, double prix) {
        this.code = code;
        this.titre = titre;
        this.prix = prix;
    }
    
    public void setCode(String code) {
		this.code=code ;
	}
	public void setTitre(String titre) {
	      this.titre=titre;
	      }
	public void setPrix(double prix) { 
		this.prix=prix ;
	}
	public String getCode() {
		return this.code ;
	}
	public String gettitre() {
	      return this.titre;
	      }
	public double getPrix() { 
		
		return this.prix ;
	}
	public String toString() {
        return "Code: " + code + ", Titre: " + titre + ", Prix HT: " + prix + "$";
    }
	
	
	public double getPrixTTC() { 
	    return this.prix * 1.05; 
	}
	

	public abstract String getType();
	
	

}

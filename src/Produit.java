public class Produit {
    private int codeProduit;
    private String nom;
    private int stock;
    private double prixUnit;
    private int stockSecu;
    private Categorie Cat;


    public Produit(int codeProduit, String nom, int stock, double prixUnit, int stockSecu, Categorie pro) {
        this.codeProduit = codeProduit;
        this.nom = nom;
        this.stock = stock;
        this.prixUnit = prixUnit;
        this.stockSecu = stockSecu;
        this.Cat = pro;
    }

    public int getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrixUnit() {
        return prixUnit;
    }

    public void setPrixUnit(double prixUnit) {
        this.prixUnit = prixUnit;
    }

    public int getStockSecu() {
        return stockSecu;
    }

    public void setStockSecu(int stockSecu) {
        this.stockSecu = stockSecu;
    }


    public int entreStock (int valeur ){
        return stock+=valeur;

}
    public int sortieStock (int valeur ){
        return stock-=valeur;
}

    public double ValeursStock(){
        return this.stock * this.prixUnit;

    }

    public String AlerteLimite(){
        String Alerte="";
        if (stock >= stockSecu){
            Alerte = "Vous avez atteint le Stock de secours";
        } else {
            Alerte = "Vous n'avez pas atteint le Stock de secours";
        }

        return Alerte;

}

public String InfoProdut() {
    String info = "InfoProduit " + "Prix : " + this.prixUnit + ", Sotck : " + this.stock + ", Nom : " + this.nom + ", Code : " + this.codeProduit;
    return info;
}

    public boolean valideComande (int commQauntite) {
    boolean valide;
    if ((this.stock - commQauntite) >= stockSecu) {
        valide = true;
    } else {
        valide = false;
    }
    return valide;
}

    public int getCodeCat() {
        return this.Cat.getCode();
    }
    public String getNomCat() {
        return this.Cat.getNom();
    }


}
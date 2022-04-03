public class Categorie {
    private int code;
    private String nom;

    public Categorie(String nom, int code) {
        this.code = code;
        this.nom = nom;
    }

    public int getCode() {
        return this.code;
    }
    public void setCode(int param) {
        this.code = param;
    }
    public String getNom() {
        return this.nom;
    }
    public void setNom(String param) {
        this.nom = param;
    }

}



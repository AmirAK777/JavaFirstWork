public class Traitement {
    public static void main (String[]args){
        Categorie viande = new Categorie("Boeuf",3);

        Produit Boeuf = new Produit(1,"boeuf",30,5.55,10,viande);{
            System.out.println("Ajout du stock: "+Boeuf.entreStock(30));
            System.out.println("Sortie du stock: "+Boeuf.sortieStock(15));
            System.out.println("Valeur du stock: "+Boeuf.ValeursStock());
            System.out.println("Information du Stock: "+Boeuf.AlerteLimite());
            System.out.println("La commande est validé ?: "+Boeuf.valideComande(20));
            System.out.println("Numero de la categorie: "+Boeuf.getCodeCat());
            System.out.println("Nom de la categorie: "+Boeuf.getNomCat());
            System.out.println("Info du produit: "+Boeuf.InfoProdut());



        }
    }
}

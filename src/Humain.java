public class Humain {
    private String nom;
    private String boisson_favorite="eau";

    public Humain(String nom) {
        this.nom = nom;
    }
    // methode parler
    public void parler(String text){
        System.out.println(this.getNom()+" - "+text);
    }

    //methode pour se presenter
    public String sePresenter(){
        return "Ah ! un bon verre de "+this.boisson_favorite;
    }
    // pour connaitre le nom de l'humain
    public String quel_est_ton_nom(){
        return this .nom;
    }
    // pour connaitre la boisson favorite de l'humain
    public String quelle_est_ta_boisson_favorite(){
        return this.boisson_favorite;
    }

    @Override
    public String toString() {
        return "Mon nom est '" + this.nom + '\'' +
                ", et ma boison_favorite='" + this.boisson_favorite + '\'' +
                '}';
    }

    public String getNom() {
        return nom;
    }


    public void setBoisson_favorite(String boisson_favorite) {
        this.boisson_favorite = boisson_favorite;
    }
}

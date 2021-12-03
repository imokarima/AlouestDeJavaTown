public class Dame extends Humain implements Visage_pale{
    private String color;
    private String etat;// libre ou captive

    public Dame(String nom,String color,String etat) {
        super(nom);
        this.color=color;
        this.etat=etat;
    }
    public void seFaireKidnapper(){
        if(this.etat=="libre"){
            this.etat="captive";
            System.out.println("AAAAAA au secours AAAAAAAAAA aidez-moi svp");
        }
    }
    public void changerRobe(String color){
        this.color=color;
        System.out.println("Regardez ma nouvelle robe "+this.color);
    }

    public void seFaireLiberer(Cowboy cowboy){
        if(this.etat=="captive"){
            this.etat="libre";
            System.out.println("Merci beaucoup Mr "+cowboy.getNom()+" !");
        }
    }

    public String quel_est_ton_nom(){
        return "Miss "+ super.quel_est_ton_nom();
    }
    public String  sePresenter(){
        String s="Bonjour je suis la dame "+this.getNom()+", "+super.sePresenter()+" Ma colour est "+this.color;
        return s;
    }

    @Override
    public String toString() {
        String s=super.toString();
        s+="Je suis une Dame et ma colour est ='" + color + '\'' +
                ", etat='" + etat + '\'' +
                '}';
        return s;
    }

    public String getColor() {
        return color;
    }

    public String getEtat() {
        return etat;
    }

    @Override
    public void scalp() {
        System.out.println("Aie ma tête !.");
    }
}

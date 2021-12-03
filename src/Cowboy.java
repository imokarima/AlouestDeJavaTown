public class Cowboy extends Humain implements Visage_pale{
    private int popularite=0;
    private String adjectif="vaillant";
    public Cowboy(String nom) {
        super(nom);
    }
    public void tirerSurBrigant(Hors_la_loi hors_la_loi){
        System.out.println("Le "+this.adjectif+" "+this.getNom()+" tire sur "+hors_la_loi.quel_est_ton_nom()+ ". PAN !\n  Prends ça, rascal !");
        hors_la_loi.seFaireEmprisonner(this);
    }
    public void libererUneDame(Dame dame){
        if(dame.getEtat()=="capture"){
            dame.seFaireLiberer(this);
            this.popularite++;
        }
    }

    public String quel_est_ton_nom(){
        return "Mr "+ super.quel_est_ton_nom();
    }
    public String  sePresenter(){
        return "Bonjour je suis "+this.getNom()+", "+super.sePresenter()+ " et on m'appellÒe "+this.adjectif+ "\nÒÒ";
    }

    @Override
    public String toString() {
        String s=super.toString();
        s+="Je suis un Cowboys et ma popularité est ='" + popularite + '\'' +
                ", et je suis toujours ='" + adjectif + '\'' +
                '}';
        return s;
    }

    public void setPopularite(int popularite) {
        this.popularite = popularite;
    }

    public void setAdjectif(String adjectif) {
        this.adjectif = adjectif;
    }

    @Override
    public void scalp() {
        System.out.println("Aie ma tête !.");
    }
}

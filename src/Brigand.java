public class Brigand extends Humain implements Hors_la_loi,Visage_pale{

    private String look="mechant";
    private int nbDameEnleve;
    private int recompense=100;
    private boolean estEnPrison;
    public Brigand(String nom) {
        super(nom);
    }
    public void kidnapper(Dame dame){
        dame.seFaireKidnapper();
        System.out.println("Ah ah !  "+dame.getNom()+"), tu es mienne désormais !");
    }

    @Override
    public int get_mise_a_prix() {
        return this.recompense;
    }

    public void seFaireEmprisonner(Cowboy cowboy){
        if(this.estEnPrison!=true){
            System.out.println("Damned, je suis fait ! "+cowboy.getNom()+" tu m'as eu");
            this.estEnPrison=true;
        }
    }

    public String quel_est_ton_nom(){
        return "Mr "+ super.quel_est_ton_nom()+ "le "+this.look;
    }

    public String  sePresenter(){
        String s= "Bonjour je suis "+this.getNom()+", "+super.sePresenter()+"\nÒ";
        s+="J'ai l'air méchant et j'ai déjà kidnappé"+this.nbDameEnleve+" Dames \n";
        s+="Ma tête est mise à prix, et je suis un Hors la loi "+this.recompense+ " § \n";
        return s;
    }

    @Override
    public String toString() {
        String s=super.toString();
        s+="Je suis un Brigant et mon look est ='" + look + '\'' +
                ", j'ai enlevé '" + nbDameEnleve + " dames " +'\'' +
                '}';
        return s;
    }

    public String getLook() {
        return look;
    }

    public int getNbDameEnleve() {
        return nbDameEnleve;
    }

    public int getRecompense() {
        return recompense;
    }

    @Override
    public void scalp() {
        System.out.println("Aie ma tête !.");
    }
}

public class Indien extends Humain{
    private int nbPlumes;
    private String totem="Coyote";
    public Indien(String nom) {
        super(nom);
        this.setBoisson_favorite("Jus de racine");
    }

    @Override
    public String sePresenter() {
        return super.sePresenter()+" mon nombre de plumes est :"+this.nbPlumes+" Ugh";
    }

    public void scalper(Visage_pale visage){
        this.nbPlumes++;
        System.out.println("J'ai scalpé un visage !");
    }
}

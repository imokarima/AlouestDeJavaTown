public class Sherif extends Cowboy implements Hors_la_loi{
    public Sherif(String nom) {
        super(nom);
    }

    @Override
    public void seFaireEmprisonner(Cowboy c) {
            this.setAdjectif("mechant");
            this.setPopularite(0);
            System.out.println("Damned, je suis fait ! "+c.getNom()+" tu m'as eu");
    }

    @Override
    public void kidnapper(Dame dame) {
        dame.seFaireKidnapper();
        System.out.println("Ah ah !  "+dame.getNom()+"), tu es mienne désormais !");
    }

    @Override
    public int get_mise_a_prix() {
        return 100;
    }
}

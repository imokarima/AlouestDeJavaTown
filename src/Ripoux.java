public class Ripoux extends  Humain implements Hors_la_loi{
    public Ripoux(String nom) {
        super(nom);
    }

    @Override
    public void seFaireEmprisonner(Cowboy c) {
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

    @Override
    public String quel_est_ton_nom() {
        return super.getNom();
    }
}

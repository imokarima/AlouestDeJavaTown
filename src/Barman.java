public class Barman extends Humain{
    private String nomBar="Bar chez"+this.getNom();

    public Barman(String nom) {
        super(nom);
        super.setBoisson_favorite("Vin");
    }

    @Override
    public String sePresenter() {
        return super.sePresenter()+" vous êtes "+this.nomBar+" Coco.";
    }

}

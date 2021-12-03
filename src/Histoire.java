public class Histoire {
    public static void main(String[] args) {
        System.out.println("Bienvenue");
        Humain humain=new Humain("Karima");
        System.out.println(humain.toString()+"\n");
        System.out.println("Ma boisson favorite est "+humain.quelle_est_ta_boisson_favorite());
        humain.sePresenter();
        Dame dame=new Dame("Maria","rouge","libre");
        Brigand brigant=new Brigand("alpha");
        brigant.kidnapper(dame);
        Cowboy cowboy=new Cowboy("Alexandre \n");
        cowboy.tirerSurBrigant(brigant);
        dame.seFaireLiberer(cowboy);
        System.out.println(dame.quel_est_ton_nom());

        Barman barman=new Barman("Julio");

        System.out.println(dame.sePresenter());
        System.out.println(humain.sePresenter());
        System.out.println(barman.sePresenter());
        System.out.println(humain.sePresenter());

        System.out.println("   ---- ");
        Cowboy cowboy1=new Sherif("Mori");
        // il a accès à tt les méthode de la classe pere
        cowboy1.tirerSurBrigant(brigant);
        cowboy1.libererUneDame(dame);
        System.out.println("   ----  ");
        cowboy.tirerSurBrigant(brigant);
        Femme_brigand femme=new Femme_brigand("FEMME");
        Ripoux ripoux= new Ripoux("ripoux");
        System.out.println("   ---- ");
        ripoux.kidnapper(dame);




    }
}

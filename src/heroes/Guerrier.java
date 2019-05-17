package heroes;

public class Guerrier extends Personnage {
    private Arme arme;
    private String bouclier;

    public String toString() {

        return super.toString()
                + "GUERRIER" + "\n"
                + "Nom de l'arme: " + this.arme.getNameWeapon() + "\n"
                + "Atk de l'arme: " + this.arme.getNvAtk();


    }

    public Guerrier(String nom, String image, int pv, int atk, Arme arme) {
        super(nom, image, pv, atk);
        this.arme = arme;
        // this.bouclier = bouclier;


    }
    //Constructeur default
    public Guerrier() {

    }


    //METHODS:


    //SETTER
    public void setArme(Arme arme) {
        this.arme = arme;

    }

    //GETTER
    public Arme getArme() {
        return arme;
    }


    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }

    //GETTER
    public String getBouclier() {
        return bouclier;
    }


}
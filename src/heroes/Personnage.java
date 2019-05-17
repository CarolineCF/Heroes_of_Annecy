package heroes;

public abstract class Personnage {

    private String nom;
    private String image = null;
    private int pv;
    private int atk;

    protected Personnage(String nom, String image, int pv, int atk) {
        this.nom = nom;
        this.image = image;
        this.pv = pv;
        this.atk = atk;

    }

    public Personnage() {

    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPv() {
        return pv;
    }


    public void setAtk(int atk) {
        this.atk = atk;
    }


    public int getAtk() {
        return atk;
    }


    public String toString() {
        return "Nom du joueur: " + this.nom + "\n"
                + "Photo du héro " + this.image + "\n"
                + "Pv: " + this.pv + "\n"
                + "Atk: " + this.atk + "\n";

    }
}

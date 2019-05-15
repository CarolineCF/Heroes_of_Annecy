package heroes;

public class Guerrier {
    private String nom;
    private String image = null;
    private int pv;
    private int atk;
    private Arme arme;
    private String bouclier;

    public String toString() {
        return "Nom du joueur: " + this.nom +"\n"
                +"Photo du héro " + this.image +"\n"
                + "Pv: " + this.pv +"\n"
                + "Atk: " + this.atk +"\n"
                + "Nom de l'arme: " + this.arme.getNameWeapon() + "\n"
                + "Atk de l'arme: " + this.arme.getNvAtk();
               // + "Possède un bouclier" + this.bouclier;

    }

public Guerrier () {
        this.setArme(new Arme());
}

public void setArme(Arme arme){
        this.arme= arme;

    }
    public Arme getArme(){
        return arme;
    }

    //SETTER
    public void setNom(String nom) {
        this.nom = nom;
    }
    //GETTER
    public String getNom() {
        return nom;
    }

    //SETTER
    public void setImage(String image) {
        this.image = image;
    }
    //GETTER
    public String getImage() {
        return image;
    }

    //SETTER
    public void setPv(int pv) {
        this.pv = pv;
    }
    //GETTER
    public int getPv() {
        return pv;
    }

    //SETTER
    public void setAtk(int atk) {
        this.atk = atk;
    }
    //GETTER
    public int getAtk() {
        return atk;
    }
    //SETTER
    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }
    //GETTER
    public String getBouclier() {
        return bouclier;
    }
}
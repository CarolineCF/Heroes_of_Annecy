package heroes;

public class Magicien {
    private String nom;
    private String image = null;
    private int pv;
    private int atk;
    private Sort sort;
    private String philtre;


    public String toString() {
        return "Nom du joueur: " + this.nom +"\n"
                +"Photo du héro " + this.image +"\n"
                + "Pv: " + this.pv +"\n"
                + "Atk: " + this.atk +"\n"
                + "Possède un philtre " + this.philtre + "\n"
                + "Nom du sort: " + this.sort.getNameSort() + "\n"
                + "Puissance du sort: " + this.sort.getNvAtk();

    }
    public Magicien (){
        this.setSort(new Sort());
    }

    private void setSort(Sort sort) {
        this.sort = sort;
    }
    public Sort getSort(){
        return sort;
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
    public double getPv() {
        return pv;
    }
    //SETTER
    public void setAtk(int atk) {
        this.atk = atk;
    }
    //GETTER
    public double getAtk() {
        return atk;
    }
    //SETTER
    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }
    //GETTER
    public String getPhiltre() {
        return philtre;
    }
}
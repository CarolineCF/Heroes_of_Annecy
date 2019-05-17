package heroes;

public class Magicien extends Personnage {
    private Sort sort;
    private String philtre;


  public String toString() {
        return
                super.toString()
                //+"Possède un philtre " + this.philtre + "\n"
                + "Nom du sort: " + this.sort.getNameSort() + "\n"
                + "Puissance du sort: " + this.sort.getNvAtk();

    }
    public Magicien(){

    }

    public Magicien(String nom, String image, int pv, int atk,Sort sort, String philtre){
    super( nom,image,pv,atk);
    this.sort = sort;
    this.philtre = philtre;

    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public Sort getSort() {
        return sort;
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
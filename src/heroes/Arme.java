package heroes;

public class Arme {
    private String nameWeapon;
    private int nvAtk;


    public Arme() {

    }

    //SETTER
    public void setNameWeapon(String nom) {
        this.nameWeapon = nom;
    }
    //GETTER
    public String getNameWeapon(){
        return nameWeapon;
    }
    //SETTER
    public void setNvAtk(int nvAtk) {
        this.nvAtk = nvAtk;
    }
    //GETTER
    public int getNvAtk(){
        return nvAtk;
    }
}
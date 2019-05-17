package heroes;

public class Arme {
    private String nameWeapon;
    private int nvAtk;


    public Arme(String nameWeapon, int nvAtk) {
        this.nameWeapon = nameWeapon;
        this.nvAtk = nvAtk;
    }

    //SETTER
    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    //GETTER
    public String getNameWeapon() {
        return nameWeapon;
    }

    //SETTER
    public void setNvAtk(int nvAtk) {
        this.nvAtk = nvAtk;
    }

    //GETTER
    public int getNvAtk() {
        return nvAtk;
    }
}
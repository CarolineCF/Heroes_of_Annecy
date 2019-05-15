package heroes;

public class Sort {
    private String nameSort;
    private int nvAtk;

    public Sort() {

    }

    public void setNameSort(String nom) {
        this.nameSort = nom;
    }
    public String getNameSort(){
        return nameSort;
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

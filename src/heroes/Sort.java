package heroes;

public class Sort {
    private String nameSort;
    private int nvAtk;

    public Sort(String nameSort, int nvAtk) {
    this.nameSort = nameSort;
    this.nvAtk = nvAtk;
    }

    public void setNameSort(String nameSort) {
        this.nameSort = nameSort;

    }

    public String getNameSort() {
        return nameSort;
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

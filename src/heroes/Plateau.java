package heroes;

import java.util.ArrayList;

public class Plateau {

    ArrayList<Case> plateau = new ArrayList();

    public Plateau(int size) {

        for (int p = 0; p < size; p++) {
            plateau.add(new EnnemiCase());
            plateau.add(new SuperCase());
            System.out.println("Case " + p + " = " + plateau.get(p));
        }

    }
    public void contenuPlateau() {

        for (Case cas : plateau) {
            System.out.println(cas);
        }
    }


}









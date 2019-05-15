package heroes;

import java.util.Scanner;


public class Play {
    private static Magicien stockage2[] = new Magicien[10];
    private static Guerrier stockage[] = new Guerrier[10];
    private static Scanner sc = new Scanner(System.in);

    private static String e = "";
    private static int g = 0;
    private static int m = 0;

    public static void main(String[] args) {


        while (!e.equalsIgnoreCase("exit")) {

            menu();

            String classe = sc.nextLine();

            if (classe.equalsIgnoreCase("guerrier")) {

                createGuerr();


            } else if (classe.equalsIgnoreCase("mage")) {

                createMage();


            } else if (classe.equalsIgnoreCase("liste")) {

                liste();

            } else if (classe.equalsIgnoreCase("exit")) {

                System.exit(0);
            }

        }


    }

    //Function création guerrier
    public static void createGuerr() {
        Guerrier user1 = new Guerrier();



        System.out.println("Nom ? :");
        String name = sc.nextLine();
        user1.setNom(name);


        System.out.println("import une photo via une url");
        String photo = sc.nextLine();
        user1.setImage(photo);


        System.out.println("Choisis un nombre de vie bien BADASS");
        int nvVie = sc.nextInt();
        user1.setPv(nvVie);


        System.out.println("Force d'attaque ? ");
        int forceAttaque = sc.nextInt();
        user1.setAtk(forceAttaque);


        System.out.println("Donnes un nom à ton arme");
         sc.nextLine();
        String nomArme = sc.nextLine();
        user1.getArme().setNameWeapon(nomArme);


        System.out.println("Définie la puissance de ton arme ");
        int atkArme = sc.nextInt();
        user1.getArme().setNvAtk(atkArme);


        sc.nextLine();

        System.out.println("Settings du Guerrier terminus");


        stockage[g] = user1;
        g++;
    }

    //Function création mage
    public static void createMage() {
        Magicien user2 = new Magicien();
        Sort userarme2 = new Sort();


        System.out.println("Nom ? :");
        String name = sc.nextLine();
        user2.setNom(name);

        System.out.println("import une photo via une url");
        String photo = sc.nextLine();
        user2.setImage(photo);


        System.out.println("Choisis un nombre de vie bien BADASS");
        int nvVie = sc.nextInt();
        user2.setPv(nvVie);


        System.out.println("Force d'attaque ? ");
        int forceAttaque = sc.nextInt();
        user2.setAtk(forceAttaque);


        System.out.println("Donnes un nom à ton arme");
        sc.nextLine();
        String nomArme = sc.nextLine();
        user2.getSort().setNameSort(nomArme);



        System.out.println("Définie la puissance de ton arme ");
        int atkArme = sc.nextInt();
        user2.getSort().setNvAtk(atkArme);


        sc.nextLine();

        System.out.println("\n" + "Settings du Mage terminus" + "\n");

        stockage2[m] = user2;
        m++;

    }

    //Function affichage menu
    public static void menu() {

        System.out.println("\n" + "Plusieurs choix s'offrent à vous:" + "\n"
                + "Entrez votre choix de personnage (mage / guerrier) ?" + "\n"
                + "Afficher la liste des héros -> entrez |liste|" + "\n"
                + "Quitter le jeu -> entrez |exit|");
    }

    //Function affichage liste des héros
    public static void liste() {
        for (int z = 0; z < stockage.length; z++) {
            if (stockage[z] != null) {
                System.out.println("GUERRIER :" + "\n" + stockage[z] + "\n");
            }
            if (stockage2[z] != null) {
                System.out.println("MAGE:" + "\n" + stockage2[z] + "\n");
            }
        }
    }
}







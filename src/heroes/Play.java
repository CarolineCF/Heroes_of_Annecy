package heroes;

import java.util.Scanner;


public class Play {


    public static Personnage stockage[] = new Personnage[10];
    private static Scanner sc = new Scanner(System.in);

    private static String e = "";
    private static int g = 0;


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
        Guerrier guerrier = new Guerrier();



        System.out.println("Nom ? :");
        String name = sc.nextLine();
        guerrier.setNom(name);



        System.out.println("import une photo via une url");
        String photo = sc.nextLine();
        guerrier.setImage(photo);


        System.out.println("Choisis un nombre de vie bien BADASS");
        int nvVie = sc.nextInt();
        guerrier.setPv(nvVie);


        System.out.println("Force d'attaque ? ");
        int forceAttaque = sc.nextInt();
        guerrier.setAtk(forceAttaque);


        System.out.println("Donnes un nom à ton arme");
        sc.nextLine();
        String nomArme = sc.nextLine();



        System.out.println("Définie la puissance de ton arme ");
        int atkArme = sc.nextInt();
        Arme blublu = new Arme(nomArme, atkArme);
        guerrier.setArme(blublu);

        sc.nextLine();

        System.out.println("Settings du Guerrier terminus");


        stockage[g] = guerrier;

        g++;
    }

    //Function création mage
    public static void createMage() {
        Magicien mage = new Magicien();



        System.out.println("Nom ? :");
        String name = sc.nextLine();
        mage.setNom(name);

        System.out.println("import une photo via une url");
        String photo = sc.nextLine();
        mage.setImage(photo);


        System.out.println("Choisis un nombre de vie bien BADASS");
        int nvVie = sc.nextInt();
        mage.setPv(nvVie);


        System.out.println("Force d'attaque ? ");
        int forceAttaque = sc.nextInt();
        mage.setAtk(forceAttaque);


        System.out.println("Donnes un nom à ton arme");
        sc.nextLine();
        String nomArme = sc.nextLine();




        System.out.println("Définie la puissance de ton arme ");
        int atkArme = sc.nextInt();
        Sort blabla = new Sort(nomArme, atkArme);
        mage.setSort(blabla);

        sc.nextLine();

        System.out.println("\n" + "Settings du Mage terminus" + "\n");

        stockage[g] = mage;
        g++;

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
                System.out.println("Personnages créés: " + "\n" + " "+ stockage[z] + "\n");
            }

        }
    }
}







import planete.Planete;
import planete.planetes;
import vaisseau.Vaisseau;

import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);
    public static Vaisseau vs = new Vaisseau();
    public static void main(String[] args) {

        System.out.println("Bienvenue sur Space Explorer\nVous etes présentement sur l'orbite de la terre.");
        while (vs.getPv()>0&&vs.getGas()>0){
            switch(printMenu()){
                case 1:vs.printEtat();break;
                case 2:nextPlanete();break;
                case 3:vs.wantToUseItem(sc);break;
                case 4:vs.wantToGoBack();break;
            }
        }
        if(vs.getPv()<=0){
            System.out.println("Vous etes mort.");
        }else
            System.out.println("Vous avez manqué de gas.");

        System.out.println("Votre vaisseau a parcourue ces planetes : ");
        vs.printTravel();
    }
    public static void nextPlanete(){
        Planete rep;
        int rand=(int)(Math.random()*4);
        rep=planetes.all[rand];
        System.out.println("Vous visitez la planete "+rep.getNom());
        vs.visite(rep);


    }
    public static int printMenu(){
        System.out.println("Que voulez-vous faire?\n1-Examiner l'état du vaisseaux\n2-Aller a la prochaine planete\n3-Utiliser un objet de l'inventaire\n4-Revenir a la planete précédente");
        return sc.nextInt();
    }
}

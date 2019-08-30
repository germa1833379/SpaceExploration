package vaisseau;

import Items.*;
import planete.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Vaisseau {
    private Stack<Planete> travelLog=new Stack<>();
    public Vaisseau(){
        travelLog.push(planetes.terre);
    }
    private int pv=500,maxPv=500,gas=10,nbLaser=0;
    private ArrayList<Item> inventaire=new ArrayList<>();
    public void damage(int dmg){pv-=dmg;}
    public void wantToUseItem(Scanner sc){
        if(inventaire.size()>=1) {
            System.out.println("-- Inventaire --");
            for (int i = 0; i < inventaire.size(); i++) {
                System.out.println((i+1)+" "+inventaire.get(i).getNom());
            }
            System.out.println("Choisir un objet ou quitter avec `r`.");
            int rep=sc.nextInt();
            boolean gotIt=false;
            for(int i=0;i<inventaire.size();i++){
                if(rep==i+1){
                    gotIt=true;
                }
            }
            if(gotIt){
                inventaire.get(rep-1);
            }else
                System.out.println("Mauvaise entrée.");
        }else{
            System.out.println("Vous n'avez pas d'objet.");
        }
    }
    public void storeItem(Item i){inventaire.add(i);}
    public void addMaxPv(int i){maxPv+=i;}
    public void addLaserShot(){nbLaser++;}
    public int getPv(){return pv;}
    public void printEtat(){
        System.out.println("PV = "+pv+"\nGas = "+gas);
    }
    public void visite(Planete plan){
        travelLog.add(plan);
        if(nbLaser>0) {
            System.out.println("Votre laser tue les pirates d'un coup, votre vaisseaux n'a rien eu.");
        }else {
            int degat = plan.getDanger() * 20;
            damage(degat);
            System.out.println("Vous rencontrez des pirates, ils vous font " + degat + "\nVotre vaisseaux a " + pv);
        }
        int rand= (int)(Math.random()*6);
        switch (rand) {
            case 0:
                break;
            case 1:
                storeItem(new jerrican());
                System.out.println("Vous recevez Jerrican.");
                break;
            case 2:
                storeItem(new balleLaser());
                System.out.println("Vous recevez Munition Laser.");
                break;
            case 3:
                storeItem(new coffre());
                System.out.println("Vous recevez Coffre.");
                break;
            case 4:
                storeItem(new coqueUpgrade());
                System.out.println("Vous recevez Coque Ameliorer.");
                break;
            case 5:
                storeItem(new clerAMolette());
                System.out.println("Vous recevez Cler A Molette.");
                break;
                }
                gas-=1;
                }
    public void wantToGoBack(){
        if (travelLog.peek().equals(planetes.terre)){
            System.out.println("Vous ne pouvez retourner en arriere.");
        }else{
            travelLog.pop();
            System.out.println("Vous etes revenues en arrière.");
        }
    }

}

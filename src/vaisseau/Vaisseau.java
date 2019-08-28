package vaisseau;

import Items.*;
import planete.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Vaisseau {
    private int pv=500,maxPv=500,gas=10,nbLaser=0;
    private ArrayList<Item> inventaire;
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
                if(rep==i){
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

    }
}

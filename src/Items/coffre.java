package Items;

import vaisseau.Vaisseau;

public class coffre extends Item {
    public coffre(){
        nom="Coffre";
    }
    public void utiliser(Vaisseau vs){
        int rand = (int)(Math.random()*4);
        switch (rand){
            case 0:vs.storeItem(new coqueUpgrade());break;
            case 1:vs.storeItem(new clerAMolette());break;
            case 2:vs.storeItem(new balleLaser());break;
            case 3:vs.storeItem(new jerrican());break;
        }
    }
}

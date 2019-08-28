package Items;

import vaisseau.Vaisseau;

public class jerrican extends Item{
    public jerrican(){
        nom="Jerrican";
    }
    public void utiliser(Vaisseau vs){
        vs.damage(-50);
        System.out.println("Vous avez gagné 50pv.");
    }
}

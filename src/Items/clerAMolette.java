package Items;

import vaisseau.Vaisseau;

public class clerAMolette extends Item {
    public clerAMolette(){
        nom="Cler A Molette";
    }
    public void utiliser(Vaisseau vs){
        vs.damage(-50);
        System.out.println("Vous avez gagné 50pv.");
    }
}

package Items;

import vaisseau.Vaisseau;

public class coqueUpgrade extends Item {
    public coqueUpgrade(){
        nom = "Coque Amélioré";
    }
   public void utiliser(Vaisseau vs){
        vs.addMaxPv(100);
        vs.damage(-100);
        System.out.println("Vos PV max sont augmenté de 100.");
   }

}

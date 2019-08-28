package Items;

import vaisseau.Vaisseau;

public class balleLaser extends Item {
    public balleLaser(){
    nom="Munition Laser";
}
    public void utiliser(Vaisseau vs){
        System.out.println("Vos prochains énemies vont y gouter.");
        vs.addLaserShot();
    }
}

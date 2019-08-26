import Items.*;

import java.util.ArrayList;

public class vaisseaux {
    private int pv;
    private int gas;
    private ArrayList<Item> inventaire; //TODO OBJECT a remplacer
    public void damage(int dmg){pv-=dmg;}
    public void wantToUseItem(){}
    public void storeItem(Item i){inventaire.add(i);}
}

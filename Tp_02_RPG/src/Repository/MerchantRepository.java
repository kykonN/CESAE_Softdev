package Repository;

import Domain.Item.ItemHeroi;
import Tools.Cvsreader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MerchantRepository {

    private ArrayList<ItemHeroi>  merchantArray;

    public MerchantRepository(String filepath) throws FileNotFoundException{

        Cvsreader cvsreader = new Cvsreader(filepath);
        merchantArray = cvsreader.readCSVToRepository();
    }

    public ArrayList <ItemHeroi> getMerchantArray(){
        return merchantArray;
    }
}

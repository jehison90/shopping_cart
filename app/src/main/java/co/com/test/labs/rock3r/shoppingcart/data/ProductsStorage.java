package co.com.test.labs.rock3r.shoppingcart.data;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

import co.com.test.labs.rock3r.shoppingcart.R;
import co.com.test.labs.rock3r.shoppingcart.domain.Product;

/**
 * Created by Jehison on 07/04/2016.
 */
public class ProductsStorage {

    private List<Product> productsInStorage;
    private Resources res;

    private static ProductsStorage instance;

    protected ProductsStorage(){

    }

    public List<Product> getProductsInStorage(){
        if(productsInStorage == null || productsInStorage.isEmpty()){
            initializeProductsList();
        }
        return productsInStorage;
    }

    private void initializeProductsList(){
        productsInStorage = new ArrayList<Product>();
        productsInStorage.add(new Product(1, "Camiseta Alemania", 150000, 20, res.getDrawable(R.drawable.alemania)));
        productsInStorage.add(new Product(1, "Camiseta Argentina", 175000, 5, res.getDrawable(R.drawable.argentina)));
        productsInStorage.add(new Product(1, "Camiseta Brasil", 120000, 70, res.getDrawable(R.drawable.brasil)));
        productsInStorage.add(new Product(1, "Camiseta Chile", 189000, 30, res.getDrawable(R.drawable.chile)));
        productsInStorage.add(new Product(1, "Camiseta Colombia", 187000, 3, res.getDrawable(R.drawable.colombia)));
        productsInStorage.add(new Product(1, "Camiseta Ecuador", 240000, 10, res.getDrawable(R.drawable.ecuador)));
        productsInStorage.add(new Product(1, "Camiseta España", 230000, 90, res.getDrawable(R.drawable.espana)));
        productsInStorage.add(new Product(1, "Camiseta Francia", 199900, 34, res.getDrawable(R.drawable.francia)));
        productsInStorage.add(new Product(1, "Camiseta Holanda", 130000, 26, res.getDrawable(R.drawable.holanda)));
        productsInStorage.add(new Product(1, "Camiseta Inglaterra", 127000, 780, res.getDrawable(R.drawable.inglaterra)));
        productsInStorage.add(new Product(1, "Camiseta Italia", 130900, 11, res.getDrawable(R.drawable.italia)));
        productsInStorage.add(new Product(1, "Camiseta Mexico", 128900, 6, res.getDrawable(R.drawable.mexico)));
        productsInStorage.add(new Product(1, "Camiseta Nigeria", 140900, 2, res.getDrawable(R.drawable.nigeria)));
        productsInStorage.add(new Product(1, "Camiseta Peru", 160000, 89, res.getDrawable(R.drawable.peru)));
        productsInStorage.add(new Product(1, "Camiseta Portugal", 160000, 5, res.getDrawable(R.drawable.portugal)));
        productsInStorage.add(new Product(1, "Camiseta Suecia", 187000, 0, res.getDrawable(R.drawable.suecia)));
        productsInStorage.add(new Product(1, "Camiseta Suiza", 190000, 1, res.getDrawable(R.drawable.suiza)));
        productsInStorage.add(new Product(1, "Camiseta Uruguay", 180000, 19, res.getDrawable(R.drawable.uruguay)));
    }

    public static ProductsStorage getInstance(Resources res) {
        if(instance == null) {
            instance = new ProductsStorage();
            instance.res = res;
        }
        return instance;
    }

}

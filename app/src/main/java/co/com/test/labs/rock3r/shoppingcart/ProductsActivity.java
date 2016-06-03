package co.com.test.labs.rock3r.shoppingcart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import co.com.test.labs.rock3r.shoppingcart.data.ProductsStorage;
import co.com.test.labs.rock3r.shoppingcart.domain.Product;

public class ProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        List<Product> products = ProductsStorage.getInstance(getResources()).getProductsInStorage();

        ListView productListView = (ListView) findViewById(R.id.productsListView);
        productListView.setAdapter(new ProductListAdapter(products, getLayoutInflater(), false));
    }
}

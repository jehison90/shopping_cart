package co.com.test.labs.rock3r.shoppingcart;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import co.com.test.labs.rock3r.shoppingcart.domain.Product;

/**
 * Created by Jehison on 07/04/2016.
 */
public class ProductListAdapter extends BaseAdapter {

    private List<Product> productListInStock;
    private LayoutInflater inflater;
    private boolean mShowCheckbox;

    public ProductListAdapter(List<Product> productListInStock, LayoutInflater inflater, boolean showCheckbox) {
        this.productListInStock = productListInStock;
        this.inflater = inflater;
        mShowCheckbox = showCheckbox;
    }

    @Override
    public int getCount() {
        return productListInStock.size();
    }

    @Override
    public Object getItem(int position) {
        return productListInStock.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View productView, ViewGroup parent) {

        final ProductView mProductView;

        if (productView == null) {
            productView = inflater.inflate(R.layout.product, parent, false);
            mProductView = new ProductView(productView);
            productView.setTag(mProductView);
        } else{
            mProductView = (ProductView) productView.getTag();
        }

        final Product product = productListInStock.get(position);

        mProductView.productImage.setImageDrawable(product.getImage());

        mProductView.productNameInLayout.setText(product.getName());

        mProductView.productPriceInLayout.setText("$ " + String.valueOf(product.getPrice()) + "COP");

        int stock = product.getProductsInStock();
        mProductView.productLeftStock.setTextColor(stock <= 0 ? Color.parseColor("#FF0000") : Color.parseColor("#008000"));
        mProductView.productLeftStock.setText(String.valueOf(stock));

        mProductView.buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productListInStock.get(position).setProductsInStock(product.getProductsInStock()-1);
                mProductView.parentView.refreshDrawableState();
            }
        });

        return productView;
    }

    private class ProductView {
        //TextView tvTitle, tvDesc;
        ImageView productImage;
        TextView productNameInLayout;
        TextView productPriceInLayout;
        TextView productLeftStock;
        Button buy;

        View parentView;

        public ProductView(View item) {
            parentView = item;
            productImage = (ImageView) item.findViewById(R.id.productImageView);
            productNameInLayout = (TextView) item.findViewById(R.id.twProductName);
            productPriceInLayout = (TextView) item.findViewById(R.id.twProductPrice);
            productLeftStock = (TextView) item.findViewById(R.id.twStockNumber);
            buy = (Button) item.findViewById(R.id.buttonBuy);
        }
    }

}
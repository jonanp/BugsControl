package jp.bugscontrol.server;

import java.util.ArrayList;
import java.util.List;

import jp.bugscontrol.AdapterProduct;

public abstract class Server {
    protected List<Product> products;
    AdapterProduct adapter_product;

    public Server() {
        products = new ArrayList<Product>();
    }

    protected abstract void loadProducts();

    public void setAdapterProduct(AdapterProduct adapter) {
        adapter_product = adapter;
        loadProducts();
    }

    public List<Product> getProducts() {return products;}

    protected void productsListUpdated() {
        adapter_product.notifyDataSetChanged();
    }
}
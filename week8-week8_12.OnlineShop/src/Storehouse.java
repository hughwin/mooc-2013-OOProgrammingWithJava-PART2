
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugh
 */
public class Storehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        int price = -99;
        for (String key : this.prices.keySet()) {
            if (this.prices.get(product) == null) {
                price = -99;
            } else {
                price = this.prices.get(product);
            }

        }
        return price;
    }

    public int stock(String product) {
        int stock = 0;
        for (String key : this.stocks.keySet()) {
            if (this.stocks.get(product) == null) {
                stock = 0;
            } else {
                stock = this.stocks.get(product);
            }

        }
        return stock;
    }

    public boolean take(String product) {
        boolean boo;
        if (this.stocks.get(product) == null) {
            boo = false;
        } else if (this.stocks.get(product) > 0) {
            int count = this.stocks.get(product);
            this.stocks.replace(product, count - 1);
            boo = true;

        } else {
            boo = false;
        }
        return boo;
    }

    public Set<String> products() {
        
        Set<String> set = new HashSet<String>();
        for (String key : this.prices.keySet()){
            set.add(key);
        }
        return set;
    }

}

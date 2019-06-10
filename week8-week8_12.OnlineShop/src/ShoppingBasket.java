
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugh
 */
public class ShoppingBasket {

    private Map<String, Purchase> map;

    public ShoppingBasket() {
        this.map = new HashMap<String, Purchase>();
    }

    public int price() {
        int price = 0;
        for (String product : this.map.keySet()) {
            price += this.map.get(product).price();
        }
        return price;
    }

    public void add(String product, int price) {
        if (this.map.containsKey(product)){
            this.map.get(product).increaseAmount();
        }
        else {this.map.put(product, new Purchase(product, 1, price));}
    }

    public void print() {
        for (String product : this.map.keySet()) {
            System.out.println(this.map.get(product));
        }
    }

}

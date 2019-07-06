
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugh
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        for (Card x : this.hand) {
            System.out.println(x);
        }
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    @Override
    public int compareTo(Hand hand) {
        int value1 = this.getHandValue();
        int value2 = hand.getHandValue();
        
        if (value1 == value2){
            return 0;
        }
        if (value1 > value2){
            return 1;
        }
        else {return -1;}

    }

    public int getHandValue() {
        int value1 = 0;
        for (Card x : this.hand) {
            value1 += x.getValue();
        }
        return value1;
    }
    
    public void sortAgainstSuit(){
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }

}

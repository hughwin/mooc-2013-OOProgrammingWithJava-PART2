
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugh
 */
public class PromissoryNote {

    private HashMap<String, Double> loan;

    public PromissoryNote() {
        this.loan = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        this.loan.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {

        if (!this.loan.containsKey(whose)) {
            return 0;
        } else {
            return this.loan.get(whose);
        }
    }
}

import java.util.Comparator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
public class jumpOrder implements Comparator<Jumper> {
    @Override
    public int compare(Jumper jumper1, Jumper jumper2) {
        return jumper1.getScore()-jumper2.getScore();
    }
}

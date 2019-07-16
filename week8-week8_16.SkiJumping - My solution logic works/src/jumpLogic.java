
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugh
 */
public class jumpLogic {

    private Jumper jumper;

    public jumpLogic(Jumper j) {
        this.jumper = j;
    }

    public void distance() {
        Random rand = new Random();
        int dist = rand.nextInt(60) + 61;
        this.jumper.increaseScore(dist);
        System.out.println("    length: " + dist);
        this.jumper.trackedDistances(dist);
    }

    public void judgesVotes() {
        ArrayList scores = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            int score = rand.nextInt(10) + 11;
            scores.add(score);
        }
        System.out.println("    judges votes: " + scores);
        Collections.sort(scores);
        scores.remove(0);
        scores.remove(3);
        this.jumper.increaseScore(addScores(scores));
    }

    public int addScores(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

}


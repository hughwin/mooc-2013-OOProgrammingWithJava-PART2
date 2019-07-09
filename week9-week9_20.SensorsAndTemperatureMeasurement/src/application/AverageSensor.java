/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugh
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();

    }

    @Override
    public boolean isOn() {
        for (Sensor x : this.sensors) {
            if (x.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor x : this.sensors) {
            x.on();
        }
    }

    @Override
    public void off() {
        for (Sensor x : this.sensors) {
            x.off();
        }
    }

    @Override
    public int measure() {
        int avg = 0;
        for (Sensor x : this.sensors) {
            if (!isOn() || this.sensors.isEmpty()) {
                throw new IllegalStateException();
            } else {
                int reading = x.measure();
                avg += reading;

                System.out.println(avg);
            }
        }
        this.readings.add(avg / this.sensors.size());
        return avg / this.sensors.size();

    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }

    public List<Integer> readings() {
        return this.readings;
    }

}

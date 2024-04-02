package org.eastwoo.designpatterns.behavioralPattern.observer.example2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherAPI implements Subject{
    float temp; // 온도
    float humidity; // 습도
    float pressure; // 기압

    List<Observer> subscribers = new ArrayList<>();

    void measurementsChanged(){
        temp = new Random().nextFloat() * 100;
        humidity = new Random().nextFloat() * 100;
        pressure = new Random().nextFloat() * 100;

        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : subscribers){
            observer.display(this);
        }
    }
}

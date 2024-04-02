package org.eastwoo.designpatterns.behavioralPattern.observer.example3;

import java.util.Observable;
import java.util.Random;

public class WeatherAPI extends Observable {
    float temp;
    float humidity;
    float pressure;

    void measurementsChanged(){
        temp = new Random().nextFloat() * 100;
        humidity = new Random().nextFloat() * 100;
        pressure = new Random().nextFloat() * 100;

        /* 부모 클래스 Observable의 부모 메서드 */
        setChanged(); // 내부 플래그를 true로 만들어 알림이 동작하게 끔 한다,.
        notifyObservers(); // 옵저버들에게 알림 전파
    }
}

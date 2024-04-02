package org.eastwoo.designpatterns.behavioralPattern.observer.example2;

public class Client {
    public static void main(String[] args){

        WeatherAPI weatherAPI = new WeatherAPI();

        weatherAPI.registerObserver(new KoreanUser("홍길동"));
        weatherAPI.registerObserver(new KoreanUser("임꺽정"));
        weatherAPI.registerObserver(new KoreanUser("세종대왕"));

        weatherAPI.measurementsChanged();

    }
}

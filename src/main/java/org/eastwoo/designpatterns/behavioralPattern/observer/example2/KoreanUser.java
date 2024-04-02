package org.eastwoo.designpatterns.behavioralPattern.observer.example2;

public class KoreanUser implements Observer{
    String name;

    KoreanUser(String name){
        this.name = name;
    }

    @Override
    public void display(WeatherAPI weatherAPI) {
        System.out.printf("%s님이 현재 날씨 상태를 조회함 : %.2f°C %.2fg/m3 %.2fhPa\n", name , weatherAPI.temp, weatherAPI.humidity, weatherAPI.pressure);
    }
}

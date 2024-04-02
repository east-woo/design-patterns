package org.eastwoo.designpatterns.behavioralPattern.observer.example3;

public class Client {
    public static void main(String[] args) {
        WeatherAPI api = new WeatherAPI();

        // 옵저버 리스트 추가
        api.addObserver(new KoreanUser("홍길동"));
        api.addObserver(new KoreanUser("임꺽정"));
        api.addObserver(new KoreanUser("세종대왕"));

        // 온습도기에서 현재 상태의 온습도 정보가 갱신됨
        api.measurementsChanged();

        // 알아서 전파되어 출력

        api.measurementsChanged();


    }
}

package org.eastwoo.designpatterns.behavioralPattern.observer.example2;

interface Subject {
    void registerObserver(Observer o); // 구독 추가

    void removeObserver(Observer o); // 구독 삭제

    void notifyObserver(); // Subject 객체의 상태 변경시 이를 모든 옵저버에게 알림

}

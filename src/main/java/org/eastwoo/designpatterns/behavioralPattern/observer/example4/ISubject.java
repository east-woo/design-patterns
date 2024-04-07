package org.eastwoo.designpatterns.behavioralPattern.observer.example4;



// Publisher 발행자
public interface ISubject {
    public boolean register(IObserver newObserver);
    public boolean remove(IObserver observer);
    public boolean sendMessage(Message msg); // notify() -> 이벤트 발생을 알리는 역할
}

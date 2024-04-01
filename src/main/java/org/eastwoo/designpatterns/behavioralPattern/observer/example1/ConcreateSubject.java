package org.eastwoo.designpatterns.behavioralPattern.observer.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : ConcreateSubject
 * @since : 2024-03-29
 */
public class ConcreateSubject implements ISubject{
    List<IObserver> observers = new ArrayList<>();

    // 구독자를 리스트에 등록
    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
        System.out.println(observer+" 구독 완료");
    }

    // 구독자를 리스트에 제거
    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
        System.out.println(observer+" 구독 취소");
    }

    @Override
    public void notifyObserver() {
        for (IObserver iObserver : observers){
            iObserver.update();
        }
    }
}

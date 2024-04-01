package org.eastwoo.designpatterns.behavioralPattern.observer.example1;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : ObserverA
 * @since : 2024-03-29
 */
public class ObserverA implements IObserver{
    @Override
    public void update() {
        System.out.println("ObserverA 한테 이벤트 알림이 왔습니다.");
    }

    public String toString() { return "ObserverA"; }
}

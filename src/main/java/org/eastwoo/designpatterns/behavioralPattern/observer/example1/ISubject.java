package org.eastwoo.designpatterns.behavioralPattern.observer.example1;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : ISubject
 * @since : 2024-03-29
 */
public interface ISubject {
    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);
    void notifyObserver();
}

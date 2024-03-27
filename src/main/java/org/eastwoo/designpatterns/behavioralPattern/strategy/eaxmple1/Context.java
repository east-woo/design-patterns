package org.eastwoo.designpatterns.behavioralPattern.strategy.eaxmple1;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : Context
 * @since : 2024-03-27
 */
// 컨텍스트(전략 등록/실행)
public class Context {
    IStrategy iStrategy;
    // 전략 인터페이스를 합성(composition)
    void setStrategy(IStrategy strategy){
        this.iStrategy = strategy;
    }
    // 전략 실행 메소드
    void doSomething(){
        this.iStrategy.doSomething();
    }
}

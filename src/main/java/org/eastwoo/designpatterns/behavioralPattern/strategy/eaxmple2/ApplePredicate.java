package org.eastwoo.designpatterns.behavioralPattern.strategy.eaxmple2;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : ApplePredicate
 * @since : 2024-03-27
 */

//전략 인터페이스
//(사과 기준을 나누는)전략 구현체에 대한 공용 인터페이스.
// 전략 구현체의 이름을 리턴하는 공용 메서드를 선언하기 위해서 인터페이스에서 추상체로 변경

public abstract class ApplePredicate {
    public String getFilterName(){
        return getClass().getSimpleName();
    }

    public abstract boolean filter(Apple apple);
}

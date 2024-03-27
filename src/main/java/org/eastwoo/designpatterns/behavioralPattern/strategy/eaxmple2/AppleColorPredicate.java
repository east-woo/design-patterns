package org.eastwoo.designpatterns.behavioralPattern.strategy.eaxmple2;

import org.springframework.stereotype.Component;

import static org.eastwoo.designpatterns.behavioralPattern.strategy.eaxmple2.Color.GREEN;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : AppleColorPredicate
 * @since : 2024-03-27
 */

//사과를 특정한 기준으로 구분해내는 기능이 구현되어 있는 구현체.
@Component
public class AppleColorPredicate extends ApplePredicate{
    @Override
    public boolean filter(Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}

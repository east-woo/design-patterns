package org.eastwoo.designpatterns.behavioralPattern.strategy.eaxmple2;

import org.springframework.stereotype.Component;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : AppleHeavyWeightPredicate
 * @since : 2024-03-27
 */
@Component
public class AppleHeavyWeightPredicate extends ApplePredicate{
    @Override
    public boolean filter(Apple apple) {
        return apple.getWeight() > 20;
    }
}

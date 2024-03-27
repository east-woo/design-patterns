package org.eastwoo.designpatterns.behavioralPattern.strategy.eaxmple2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : AppleService
 * @since : 2024-03-27
 */
@Service
@RequiredArgsConstructor
public class AppleService {
    private final PredicateFactory factory;

    public List<Apple> getFilteredAppleList(List<Apple> appleList, String className){
        List<Apple> result = new ArrayList<Apple>();
        ApplePredicate predicate = factory.findBy(className);
        for (Apple apple: appleList){
            if (predicate.filter(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}

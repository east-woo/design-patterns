package org.eastwoo.designpatterns.behavioralPattern.strategy.eaxmple2;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : PredicateFactory
 * @since : 2024-03-27
 */

// Context
//Spring ApplicationContext를 이용해서 전략 구현체들을 보관하고 있다가, Client의 요구에 따라 적절한 전략 구현체를 리턴하는 역할

@Component
@RequiredArgsConstructor
public class PredicateFactory {
    private final Set<ApplePredicate> applePredicateSet;
    private Map<String, ApplePredicate> predicate;

    @PostConstruct
    public void init(){
        createPredicate(applePredicateSet);
    }
    private void createPredicate(Set<ApplePredicate> predicateSet){
        predicate = new HashMap<String, ApplePredicate>();
        predicateSet.forEach(p -> predicate.put(p.getFilterName(),p));
    }

    public ApplePredicate findBy(String className){
        return predicate.get(className);
    }
}

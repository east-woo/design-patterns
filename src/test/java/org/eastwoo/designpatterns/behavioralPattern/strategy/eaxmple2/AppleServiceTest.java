package org.eastwoo.designpatterns.behavioralPattern.strategy.eaxmple2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : AppleServiceTest
 * @since : 2024-03-27
 */

@SpringBootTest
class AppleServiceTest {

    @Autowired
    private PredicateFactory predicateFactory;

    @Test
    void testAppleServiceWithColorPredicate() {
        // Given
        List<Apple> appleList = new ArrayList<>();

        appleList.add(new Apple(Color.GREEN, 15L));
        appleList.add(new Apple(Color.RED, 25L));
        appleList.add(new Apple(Color.GREEN, 30L));

        // When
        AppleService appleService = new AppleService(predicateFactory);
        List<Apple> filteredList = appleService.getFilteredAppleList(appleList, "AppleColorPredicate");

        // Then
        assertEquals(2, filteredList.size());
        assertTrue(filteredList.stream().allMatch(apple -> apple.getColor() == Color.GREEN));
    }

    @Test
    void testAppleServiceWithWeightPredicate() {
        // Given
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(Color.GREEN, 15L));
        appleList.add(new Apple(Color.RED, 25L));
        appleList.add(new Apple(Color.GREEN, 30L));

        // When
        AppleService appleService = new AppleService(predicateFactory);
        List<Apple> filteredList = appleService.getFilteredAppleList(appleList, "AppleHeavyWeightPredicate");

        // Then
        assertEquals(2, filteredList.size());
        assertTrue(filteredList.stream().allMatch(apple -> apple.getWeight() > 20));
    }
}

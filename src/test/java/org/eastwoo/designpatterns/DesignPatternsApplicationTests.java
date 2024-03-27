package org.eastwoo.designpatterns;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Predicate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DesignPatternsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        Predicate<Integer> predicate1 = (num) -> num < 10;
        Predicate<Integer> predicate2 = (num) -> num > 5;

        assertThat(predicate1.and(predicate2).test(11)).isTrue();
    }

}

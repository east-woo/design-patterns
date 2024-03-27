package org.eastwoo.designpatterns.behavioralPattern.strategy.eaxmple2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : Apple
 * @since : 2024-03-27
 */

@AllArgsConstructor
@Builder
@Getter
@Setter
public class Apple {
    private Color color;
    private Long weight;
}

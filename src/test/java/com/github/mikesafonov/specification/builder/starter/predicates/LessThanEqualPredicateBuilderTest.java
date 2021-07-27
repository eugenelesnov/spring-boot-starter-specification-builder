package com.github.mikesafonov.specification.builder.starter.predicates;

import org.junit.jupiter.api.Test;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;

import static org.mockito.Mockito.*;

/**
 *
 * @author MikeSafonov
 */
class LessThanEqualPredicateBuilderTest {
    @Test
    void shouldCallLessThanEqualOnExpression() {
        CriteriaBuilder cb = mock(CriteriaBuilder.class);
        Expression expression = mock(Expression.class);
        Expression valueExpression = mock(Expression.class);
        LessThanEqualPredicateBuilder builder = new LessThanEqualPredicateBuilder(cb, valueExpression, expression);

        builder.build();

        verify(cb).lessThanOrEqualTo(expression, valueExpression);
        verifyNoMoreInteractions(expression);
    }
}

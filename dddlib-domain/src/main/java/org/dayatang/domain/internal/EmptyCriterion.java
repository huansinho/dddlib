package org.dayatang.domain.internal;

import org.dayatang.domain.MapParameters;
import org.dayatang.domain.QueryCriterion;

/**
 * "空"条件，什么也不做。为了简化条件之间的运算
 *
 * @author yyang (<a href="mailto:gdyangyu@gmail.com">gdyangyu@gmail.com</a>)
 */
public class EmptyCriterion implements QueryCriterion {

    EmptyCriterion() {
    }

    @Override
    public QueryCriterion and(QueryCriterion criterion) {
        return criterion;
    }

    @Override
    public QueryCriterion or(QueryCriterion criterion) {
        return criterion;
    }

    @Override
    public QueryCriterion not() {
        return this;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean isCollection() {
        return false;
    }

    @Override
    public String toQueryString() {
        return "";
    }

    @Override
    public MapParameters getParameters() {
        return MapParameters.create();
    }

}
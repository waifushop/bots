package com.theunitedstatesofamerica.bots.common;

import java.util.List;

public interface Repository<T> {
    long count();
    List<? extends T> findAll(int offset, int limit);
    T persist(T entity);
    T update(T entity);
}

package com.beauty.model.converter;

public interface Converter<T, V> {
    V convert(T object) throws Exception;
}

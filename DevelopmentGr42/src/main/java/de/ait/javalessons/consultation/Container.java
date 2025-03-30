package de.ait.javalessons.consultation;

public interface Container <T> {
    void add(T element);
    T get(int index);
}

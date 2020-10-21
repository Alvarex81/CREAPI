package edu.grupo2.CREApi.issue;

public interface Iterator<T> {

  T next();
  boolean  isDone();
  T currentItem();
}

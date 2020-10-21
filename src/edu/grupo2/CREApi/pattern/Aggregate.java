package edu.grupo2.CREApi.pattern;

public interface Aggregate {

  Iterator createIterator();
  Iterator createInverseIterator();
}

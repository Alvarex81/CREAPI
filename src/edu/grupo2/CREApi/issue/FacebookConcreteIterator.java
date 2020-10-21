package edu.grupo2.CREApi.issue;

//import edu.ccat.behavioral.iterator.FacebookUser;
import edu.grupo2.CREApi.FacebookUser;

public class FacebookConcreteIterator implements Iterator<FacebookUser> {

  public int index = -1;

  @Override
  public FacebookUser next() {
    if (!isDone()) {
      index++;
      return FacebookApi.getFacebook().get(index);
    } else {
      return null;
    }
  }

  @Override
  public boolean isDone() {
    return index == FacebookApi.getFacebook().size()-1;
  }

  @Override
  public FacebookUser currentItem() {
    return FacebookApi.getFacebook().get(index);
  }
}

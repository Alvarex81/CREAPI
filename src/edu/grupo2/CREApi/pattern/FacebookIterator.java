package edu.grupo2.CREApi.pattern;

public class FacebookIterator implements Iterator {

  private Facebook facebook;
  private int position;

  public FacebookIterator(Facebook facebook) {
    this.facebook = facebook;
    this.position = 0;
  }

  @Override
  public boolean isDone() {
    return this.position >= this.facebook.getFacebook().size();
  }

  @Override
  public String currentItem() {
    return this.facebook.getFacebook().get(this.position++).toString();
  }
}

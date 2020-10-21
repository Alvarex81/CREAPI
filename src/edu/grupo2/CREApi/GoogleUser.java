package edu.grupo2.CREApi;

public class GoogleUser {

  private String name;
  private String email;

  public GoogleUser(String name, String email) {
    this.name = name;
    this.email = email;
  }

  @Override
  public String toString() {
    return String.format("GUserName: %s Email: %s", this.name, this.email);
  }
}

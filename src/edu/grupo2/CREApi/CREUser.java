package edu.grupo2.CREApi;

public class CREUser {

    private int  ID;
    private UserData userData;

    public CREUser(int ID, UserData userData) {
        this.ID = ID;
        this.userData = userData;
    }

    @Override
    public String toString() {
        return ("CRE ID: "+this.ID+" "+this.userData.toString());
    }

}

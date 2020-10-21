package edu.grupo2.CREApi;

public class CREUser {


    private String creName;
    private Integer creNumberMeter;

    public CREUser(String creName, Integer creNumberMeter) {
        this.creName = creName;
        this.creNumberMeter = creNumberMeter;
    }

    @Override
    public String toString() {
        return String.format("CREUser: %s, Url: %s", this.creName, this.creNumberMeter);
    }

}

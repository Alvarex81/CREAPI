package edu.grupo2.CREApi.pattern;

import edu.grupo2.CREApi.CREUser;
import edu.grupo2.CREApi.UserData;

import java.util.Map;

public class CRE implements Aggregate {

    @Override
    public Iterator createIterator() {
        return new CREIterator();
    }

    @Override
    public Iterator createInverseIterator() {
        return new InverseCREIterator();
    }


}

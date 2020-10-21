package edu.grupo2.CREApi.pattern;

import edu.grupo2.CREApi.CREUser;

import java.util.Arrays;
import java.util.List;

public class CRE implements Aggregate {

    private List<CREUser> CREUsers;

    public List<CREUser> getCRE() {
        // Retorna un lista simulada de usuarios de CRE
        this.CREUsers =
                Arrays.asList(
                        new CREUser("Juan", 12345),
                        new CREUser("Pedro", 45678),
                        new CREUser("Adrian", 78901));

        return this.CREUsers;
    }

    @Override
    public Iterator createIterator() {
        return new CREIterator(this);
    }

    @Override
    public Iterator createInverseIterator() {
        return new InverseCREIterator(this);
    }


}

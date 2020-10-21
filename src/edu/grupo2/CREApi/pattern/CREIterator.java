package edu.grupo2.CREApi.pattern;

import edu.grupo2.CREApi.CREUser;
import edu.grupo2.CREApi.UserData;
import edu.grupo2.CREApi.issue.CREApi;
import java.util.Map;
import java.util.HashMap;

public class CREIterator implements Iterator {

    private Map<Integer, UserData> creUsers;
    private java.util.Iterator position;

    public CREIterator() {
        this.creUsers = CREApi.getCREinfo();
        this.position = this.creUsers.entrySet().iterator();

    }

    @Override
    public boolean isDone() {
        return !this.position.hasNext();
        }

    @Override
    public String currentItem() {

        Map.Entry entry = (Map.Entry) position.next();
        CREUser creUser = new CREUser((Integer)entry.getKey(), (UserData) entry.getValue());

        return creUser.toString();
    }

}

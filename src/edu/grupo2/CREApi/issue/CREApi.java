package edu.grupo2.CREApi.issue;

import com.sun.xml.internal.bind.v2.model.core.ID;
import edu.grupo2.CREApi.CREUser;
import edu.grupo2.CREApi.UserData;

import java.util.*;
import java.util.Iterator;

public class CREApi {

    public static Map<Integer, UserData> getCREinfo() {
        // Retorna un map  de usuarios de CRE
        Map<Integer, UserData> CREUsers = new TreeMap<Integer, UserData>();

        CREUsers.put(12345, new UserData("Juan", "Calle 1", 200));
        CREUsers.put(87890, new UserData("Pedro", "Calle 2", 300));
        CREUsers.put(29763, new UserData("Luis", "Calle 3", 400));

        return CREUsers;
    }
}

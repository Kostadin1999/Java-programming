package org;

import java.util.Random;

public enum Names {
    DEFAULT(" "),
    ANDREY("Andrey"),
    IVAN("Ïvan"),
    KOSTADIN("Koce"),
    GEORGE("George");
    private final String value;

    Names(String value) {
        if(value.equals("Andrey") || value.equals("Ivan") || value.equals("Koce") || value.equals("George")){
            this.value = value;
        }
        else
        {
            Random rd = new Random();
            int temp = rd.nextInt(Names.values().length);
            this.value = Names.values()[temp].toString();
        }
    }

}

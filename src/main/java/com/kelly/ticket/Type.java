package com.kelly.ticket;

public class Type {
    public static final Type OLDERTICKET =
            new Type(1, "old");
    public static final Type STUDENTTICKET =
            new Type(2, "student");
    public static final Type EARLIERTICKET =
            new Type(3, "early");
    public static final Type REGULARTICKET =
            new Type(4, "regular");
    int id;
    String name;
    public Type(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

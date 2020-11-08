package com.company.MissedCalls;

public enum Group {
    WORK("Работа"),
    FRIENDS("Друзья"),
    FAMILY("Семья");

    private String group;

    Group(String group) {
        this.group = group;
    }

    public static Group getGroup(String group) {
        if (group.equals("Работа")) {
            return Group.WORK;
        } else if (group.equals("Друзья")) {
            return Group.FRIENDS;
        } else if (group.equals("Семья")) {
            return Group.FAMILY;
        }
        return null;
    }
}

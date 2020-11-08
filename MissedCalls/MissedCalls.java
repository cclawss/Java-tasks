package com.company.MissedCalls;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    static Map<LocalDateTime, String> missedCalls = new TreeMap<>();


    public static void addMissedCall(String phone) {
        missedCalls.put(LocalDateTime.now(), phone);
    }

    public static void showAllMissedCalls() {
        if (missedCalls.size() == 0) {
            System.out.println("Нет пропущенных вызовов.");
        } else {
            for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {
                LocalDateTime key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " " + Contacts.searchForAContact(value) +"\n"+
                        "Номер:"+ value);
            }
        }
    }

    public static void clearMissedCalls() {
        missedCalls.clear();
    }

}

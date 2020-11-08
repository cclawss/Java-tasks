package com.company.FindCracker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static Map<String, Object> allUser = new TreeMap<>();
    public static Map<String, Integer> intruder = new HashMap<>();


    public static void countingOccurrences(ArrayList<String> ipList) {
        for (int i = 0; i < ipList.size(); i++) {
            int score = 0;
            for (int j = 0; j < ipList.size(); j++) {
                if (ipList.get(i).equals(ipList.get(j))) {
                    score++;
                }
            }
            intruder.put(ipList.get(i), score);
        }
    }


    public static void findingCracker() {
        for (Map.Entry<String, Integer> integerEntry : intruder.entrySet()) {
            if (integerEntry.getValue().equals(Collections.max(intruder.values()))) {
                System.out.println(allUser.get(integerEntry.getKey().split(":")[0]));
                System.out.println("Количество входов: " + Collections.max(intruder.values()));
                System.out.println("ip-адрес: " + integerEntry.getKey());
            }
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("C:\\Users\\Nik\\IdeaProjects\\Shop\\src\\com\\company\\FindCracker\\users.db");
        File file2 = new File("C:\\Users\\Nik\\IdeaProjects\\Shop\\src\\com\\company\\FindCracker\\server.log");
        Scanner scanner = new Scanner(file1);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] splitInfo = line.split(";");
            String[] fullName = splitInfo[2].split(" ");
            allUser.put(splitInfo[0], new User(splitInfo[0], fullName[0], fullName[1], fullName[2], splitInfo[3]));
        }

        ArrayList<String> ipList = new ArrayList<String>();

        scanner = new Scanner(file2);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] ip = line.split(":");
            for (int i = 0; i < ip.length; i += 2) {
                String fullIp = ip[i] + ":" + ip[i + 1];
                ipList.add(fullIp);
            }
        }

        countingOccurrences(ipList);
        findingCracker();
        scanner.close();

    }
}

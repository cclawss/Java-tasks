package com.company.SelectionSystem;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static TreeSet<Candidate> candidates = new TreeSet<>(Comparator
            .comparing(Candidate::getRelevance)
            .thenComparing(Candidate::getRating).reversed());

    public static void addCandidates() {
        candidates.add(new Candidate("Иванов Иван Иванович", "муж", "25", 4, 5));
        candidates.add(new Candidate("Петров Иван Александрович", "муж", "28", 4, 3));
        candidates.add(new Candidate("Максимов Иван Александрович", "муж", "24", 3, 5));
        candidates.add(new Candidate("К И Ю", "муж", "24", 1, 2));
        candidates.add(new Candidate("А Д С", "муж", "23", 3, 4));
        candidates.add(new Candidate("К Б А", "муж", "21", 2, 2));
        candidates.add(new Candidate("Д В А", "муж", "20", 3, 1));
        candidates.add(new Candidate("К В Ы", "муж", "26", 2, 5));
        candidates.add(new Candidate("М Ы Д", "муж", "25", 3, 1));
        candidates.add(new Candidate("С А В", "муж", "22", 3, 5));

    }

    public static void main(String[] args) {
        addCandidates();
        System.out.println("Список кандидатов:\n" +
                "ФИО, Релевантность резюме, Оценка на собеседовании");
        candidates.forEach(candidate -> System.out.println(candidate.toString()));
    }
}

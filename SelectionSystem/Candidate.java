package com.company.SelectionSystem;

import java.util.Objects;

public class Candidate {
    //    "Фамилия Имя Отчество" (через пробел) — String — уникальное значение;
//    Пол — String;
//    Возраст — String;
//    Релевантность резюме (соответствие резюме предлагаемой вакансии — relevance) — Integer (0-5, где 0 — низкое значение соответствия, а 5 — очень высокое значение соответствия);
//    Оценка на собеседовании (rating) — Integer (0-5, где 0 — низкое значение оценки, а 5 — очень высокое значение оценки). Также для вывода кандидата на экран переопределить метод toString.
    private final String fullName;
    private String gender;
    private String age;
    private Integer relevance;
    private Integer rating;

    public Candidate(String fullName, String gender, String age, Integer relevance, Integer rating) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public Integer getRelevance() {
        return relevance;
    }

    public Integer getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return fullName.equals(candidate.fullName) &&
                Objects.equals(gender, candidate.gender) &&
                Objects.equals(age, candidate.age) &&
                Objects.equals(relevance, candidate.relevance) &&
                Objects.equals(rating, candidate.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, gender, age, relevance, rating);
    }

    @Override
    public String toString() {
        return fullName + ", "+ relevance + ", "+ rating;
    }
}

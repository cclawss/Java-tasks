package com.company.ValidatingEvents;

public class Main {
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 15),
        };
    }

    public static void validEvent(Event event){
        if(event.age==0){
            throw new RuntimeException("Field age not filled");
        }
        else if (event.releaseYear==0){
            throw new RuntimeException("Field releaseYear not filled");
        }
        else if (event.title.equals(null)){
            throw new RuntimeException("Field title not filled");
        }
    }

    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }
}

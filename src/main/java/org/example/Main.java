package org.example;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Counter() {
            @Override
            public String report(int countOfMonths) {
                return "The report for " + countOfMonths + " months";
            }
        }, 12);

    }
}



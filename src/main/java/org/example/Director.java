package org.example;

public class Director {
    public void force(Counter counter, int month) {
        String report = counter.report(month);
        System.out.println(report);
    }
}

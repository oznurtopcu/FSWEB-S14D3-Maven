package org.example.company;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "holden start engine";
    }

    @Override
    public String accelerate() {
        return "holden accelerate";
    }

    @Override
    public String brake() {
        return "holden brake";
    }
}

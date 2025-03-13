package org.example.company;

public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "ford start engine";
    }

    @Override
    public String accelerate() {
        return "ford accelerate";
    }

    @Override
    public String brake() {
        return "ford brake";
    }
}

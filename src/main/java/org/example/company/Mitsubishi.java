package org.example.company;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "mitsubishi start engine";
    }

    @Override
    public String accelerate() {
        return "mitsubishi accelerate";
    }

    @Override
    public String brake() {
        return "mitsubishi brake";
    }
}

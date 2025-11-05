package model;

public class e4_Animal {
    private final String name;

    public e4_Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

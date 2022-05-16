package Flyweight;

public class Context {
    private int id;
    private String color;
    private int level;

    public Context(int id, String color, int level) {
        this.id = id;
        this.color = color;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getLevel() {
        return level;
    }
}

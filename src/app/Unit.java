package app;

public class Unit {
    private String name;
    private int atk;
    private int def;
    private int health;

    public Unit(String name, int atk, int def, int health) {
        this.name = name;
        this.atk = atk;
        this.def = def;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

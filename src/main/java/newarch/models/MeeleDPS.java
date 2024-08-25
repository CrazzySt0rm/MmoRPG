package newarch.models;

public class MeeleDPS {

    String name;

    int power;

    int defence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public static void main(String[] args) {

        MeeleDPS rogue = new MeeleDPS();
        rogue.name = "Билли";
        rogue.power = 180;
        rogue.defence = 200;

        MeeleDPS deathKnight = new MeeleDPS();
        deathKnight.name = "Петёк";
        deathKnight.power = 500;
        deathKnight.defence = 350;
    }

    @Override
    public String toString() {
        return "MeeleDPS{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", defence=" + defence +
                '}';
    }
}

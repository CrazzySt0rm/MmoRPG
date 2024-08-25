package newarch.models;

import lombok.AllArgsConstructor;


public class Characters {

    private String name;
    private int power;
    private int defence;


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

        Characters mage = new Characters();
        mage.name = "Archmage";
        mage.power = 500;
        mage.defence = 200;


        Characters knight = new Characters();
        knight.name = "DeathKnight";
        knight.power = 300;
        knight.defence = 400;


    }


}

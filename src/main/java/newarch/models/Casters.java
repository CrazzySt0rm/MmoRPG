package newarch.models;


public class Casters {

    public String name;

    public int elementalPower;

    public int defence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getElementalPower() {
        return elementalPower;
    }

    public void setElementalPower(int elementalPower) {
        this.elementalPower = elementalPower;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }


    public static void main(String[] args) {

        Casters arcanMage = new Casters();
        arcanMage.name = "Zaratushtra";
        arcanMage.elementalPower = 300;
        arcanMage.defence = 90;

        Casters warlock = new Casters();
        warlock.name = "Navuhodonosr";
        warlock.elementalPower = 230;
        warlock.defence = 180;
    }

    @Override
    public String toString() {
        return "Casters{" +
                "name='" + name + '\'' +
                ", elementalPower=" + elementalPower +
                ", defence=" + defence +
                '}';


    }




}

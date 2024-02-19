package org.example;

public class HotDrinks extends BottleOfWater {
    private int temp;

    public HotDrinks(int name, int volume, int temp) {
        super(name, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temp;
    }
}

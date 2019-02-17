package hu.szaffi.app.garden.plant;

public class Flower extends Plant {
    public Flower(int size, String id) {
        super(size, id);
        this.overSize = 6;
        this.reactToBroth = -1;
        this.reactToFertilizer = -1;
        this.reactToWater = 3;
    }
}

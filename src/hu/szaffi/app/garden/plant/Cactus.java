package hu.szaffi.app.garden.plant;

public class Cactus extends Plant {
    public Cactus(int size, String id) {
        super(size, id);
        this.overSize = 4;
        this.reactToBroth = 1;
        this.reactToFertilizer = 1;
        this.reactToWater = -1;
    }
}

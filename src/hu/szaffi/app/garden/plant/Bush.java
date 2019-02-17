package hu.szaffi.app.garden.plant;

public class Bush extends Plant {
    public Bush(int size, String id) {
        super(size, id);
        this.overSize = 10;
        this.reactToBroth = 1;
        this.reactToFertilizer = -1;
        this.reactToWater = 1;
    }


}

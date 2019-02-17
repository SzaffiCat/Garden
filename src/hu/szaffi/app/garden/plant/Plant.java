package hu.szaffi.app.garden.plant;

import hu.szaffi.app.garden.Material;

public abstract class Plant {
    int size;
    String id;
    int reactToNone = -1;
    int reactToWater;
    int reactToBroth;
    int reactToFertilizer;
    int overSize;
    int aTrophySize = 0;

    public Plant(int size, String id) {
        this.size = size;
        this.id = id;
    }

    private int reactToMaterial(Material material) {
        switch (material) {
            case NONE:
                return reactToNone;
            case BROTH:
                return reactToBroth;
            case WATER:
                return reactToWater;
            case FERTILIZER:
                return reactToFertilizer;
        }
        return 0;
    }

    public boolean isAlive() {
        return (aTrophySize < size && size <= overSize);
    }

    public void modifySize(Material material) {
        this.size += reactToMaterial(material);
    }

    public void printData() {
        System.out.println(getClass().getSimpleName() + " - " + id);
        if (isAlive()) {
            System.out.println(size);
        } else {
            System.out.println("Dead");
        }
    }

}

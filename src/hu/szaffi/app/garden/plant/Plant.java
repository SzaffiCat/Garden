package hu.szaffi.app.garden.plant;

import hu.szaffi.app.garden.Material;

public abstract class Plant {
    private int size;
    private String id;
    int reactToWater;
    int reactToBroth;
    int reactToFertilizer;
    int overSize;

    Plant(int size, String id) {
        this.size = size;
        this.id = id;
    }

    private int reactToMaterial(Material material) {
        int reactToNone = -1;
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
        int aTrophySize = 0;
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

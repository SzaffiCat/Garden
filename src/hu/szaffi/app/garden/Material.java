package hu.szaffi.app.garden;

import java.util.Random;

public enum Material {
    NONE,
    WATER,
    BROTH,
    FERTILIZER;

    public static Material getRandomMaterial(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

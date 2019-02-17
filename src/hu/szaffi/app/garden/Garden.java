package hu.szaffi.app.garden;

import hu.szaffi.app.garden.plant.Bush;
import hu.szaffi.app.garden.plant.Cactus;
import hu.szaffi.app.garden.plant.Flower;
import hu.szaffi.app.garden.plant.Plant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garden {

    private int plantNum = 3;
    private List<Plant> plants = new ArrayList<>();

    public void simulateOneDay() {
        Material material = Material.getRandomMaterial();
        System.out.println();
        System.out.println(material);
        for (Plant plant :
                plants) {
            plant.modifySize(material);
            plant.printData();
        }
    }

    public void initPlants() {
        plants.add(new Flower(3, "F105"));
        plants.add(new Bush(4, "B205"));
        plants.add(new Cactus(2, "C102"));
        plants.add(new Cactus(1, "C150"));
    }

    public List<Plant> getPlants() {
        List<Plant> plantList = Collections.unmodifiableList(this.plants);
        return plantList;
    }
}
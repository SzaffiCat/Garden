package hu.szaffi.app.garden;

import hu.szaffi.app.garden.plant.Bush;
import hu.szaffi.app.garden.plant.Cactus;
import hu.szaffi.app.garden.plant.Flower;
import hu.szaffi.app.garden.plant.Plant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Garden {

    private List<Plant> livingPlants = new ArrayList<>();

    public void simulateOneDay() {
        Material material = Material.getRandomMaterial();
        System.out.println();
        System.out.println(material);
        for (Plant plant :
                livingPlants) {
            plant.modifySize(material);
            plant.printData();
        }
        updateLivingPlants();
    }

    public void initPlants() {
        livingPlants.add(new Flower(3, "F105"));
        livingPlants.add(new Bush(4, "B205"));
        livingPlants.add(new Cactus(2, "C102"));
        livingPlants.add(new Cactus(1, "C150"));
    }

    public List<Plant> getPlants() {
        return Collections.unmodifiableList(this.livingPlants);
    }

    private void updateLivingPlants() {
        for (Plant plant :
                livingPlants.stream().collect(Collectors.toList())) {
//                new ArrayList<>(livingPlants)) {
            if (!plant.isAlive()) {
                livingPlants.remove(plant);
            }
        }
    }


}

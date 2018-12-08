package orfiel.model;

public class Parrot extends Bird implements Herbivorous{

    private void tweet(){
        System.out.println("Ćwierkam");
    }

    public void eat() {
        System.out.println("Żrę");

    }

    public void eatingPlants() {
        System.out.println("Żrę roślinkę");

    }
}

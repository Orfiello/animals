package orfiel.model;

public class Iguana extends Lizard implements Herbivorous{

    private void hiss(){
        System.out.println("Syczę!!!!");

    }

    public void eat() {
        System.out.println("Żrę");
    }

    public void eatingPlants() {
        System.out.println("Żrę nasiona");

    }
}

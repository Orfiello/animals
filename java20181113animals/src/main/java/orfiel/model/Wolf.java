package orfiel.model;

public class Wolf extends Mammal implements Carnivorous {

    private void howl(){
        System.out.println(getName());

    }
    public void eat() {
        System.out.println(getName());

    }

    public void eatingMeat() {
        System.out.println("Żrę mięso");

    }
    public Animal(String name, int age){
        super(name, age);
        this.eatingMeat() = eatingMeat();
        this.eat()= eat();
    }


}


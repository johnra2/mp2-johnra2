package AnimalExercise;

public class Cat extends Animal {
    public Cat() {
        this("Salmon");
    }

    public Cat(String backpack) {
        super(backpack);
    }

    public String speak() {
        return "Meow";
    }
}

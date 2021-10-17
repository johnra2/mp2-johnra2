package AnimalExercise;

public class Dog extends Animal {
    public Dog() {
        this("Bone");
    }

    public Dog(String backpack) {
        super(backpack);
    }

    public String speak() {
        return "Woof";
    }
}

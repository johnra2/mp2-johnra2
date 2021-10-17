package AnimalExercise;

public class Duck extends Animal {
    public Duck() {
        this("Rice");
    }

    public Duck(String backpack) {
        super(backpack);
    }

    public String speak() {
        return "Quack";
    }
}

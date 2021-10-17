package AnimalExercise;

public class Cow extends Animal {
    public Cow() {
        this("Grass");
    }

    public Cow(String backpack) {
        super(backpack);
    }

    public String speak() {
        return "Moo";
    }
}

package ComputerExercise;

public class Keyboard extends ComputerPeripheral {
    public Keyboard(Computer computer) {
        super(computer);
    }

    @Override
    public String run() {
        return this.computer.run();
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + " with keyboard";
    }
}

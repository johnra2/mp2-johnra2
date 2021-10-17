package ComputerExercise;

public abstract class ComputerPeripheral implements Computer{
    protected Computer computer;

    public ComputerPeripheral(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String run(){
        return this.computer.run();
    }
    @Override
    public String getDescription(){
        return this.computer.getDescription();
    }
}

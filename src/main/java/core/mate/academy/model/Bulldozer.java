package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeHeight;
    private double rippingDepth;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}

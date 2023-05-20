package parrot;

public abstract class Parrot {

    private static final double BASE_SPEED = 12.0;

    public Parrot() {
    }

    public abstract double getSpeed();

    protected double getBaseSpeed() {
        return BASE_SPEED;
    }
}

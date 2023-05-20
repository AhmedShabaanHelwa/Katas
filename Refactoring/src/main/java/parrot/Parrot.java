package parrot;

public abstract class Parrot {

    private static final double BASE_SPEED = 12.0;

    public Parrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        return switch (getType()) {
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
            default -> throw new IllegalArgumentException("Invalid type of Parrot");
        };
    }

    public abstract ParrotTypeEnum getType();

    protected double getBaseSpeed() {
        return BASE_SPEED;
    }
}

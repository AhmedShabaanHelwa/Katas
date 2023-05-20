package parrot;

public abstract class Parrot {

    private static final double BASE_SPEED = 12.0;
    private static final double MAX_BASE_SPEED = 24.0;
    private final double voltage;
    private final boolean isNailed;

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

    private double getBaseSpeed(double voltage) {
        return Math.min(MAX_BASE_SPEED, voltage * getBaseSpeed());
    }

    protected double getBaseSpeed() {
        return BASE_SPEED;
    }
}

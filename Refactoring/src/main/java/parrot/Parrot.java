package parrot;

public abstract class Parrot {

    private static final double BASE_SPEED = 12.0;
    private static final double LOAD_FACTOR = 9.0;
    private static final double MAX_BASE_SPEED = 24.0;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    public Parrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        return switch (getType()) {
            case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
            default -> throw new IllegalArgumentException("Invalid type of Parrot");
        };
    }

    public abstract ParrotTypeEnum getType();

    private double getBaseSpeed(double voltage) {
        return Math.min(MAX_BASE_SPEED, voltage * getBaseSpeed());
    }

    private double getLoadFactor() {
        return LOAD_FACTOR;
    }

    protected double getBaseSpeed() {
        return BASE_SPEED;
    }
}

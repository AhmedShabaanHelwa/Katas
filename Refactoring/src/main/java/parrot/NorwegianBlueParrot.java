package parrot;

public class NorwegianBlueParrot extends Parrot {
    private static final double MAX_BASE_SPEED = 24.0;
    private final boolean isNailed;
    private final double voltage;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        super(voltage, isNailed);
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.NORWEGIAN_BLUE;
    }

    @Override
    public double getSpeed() {
        return isNailed ? 0 : Math.min(MAX_BASE_SPEED, voltage * getBaseSpeed());
    }

}

package parrot;

public class AfricanParrot extends Parrot {
    private static final double LOAD_FACTOR = 9.0;
    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(voltage, isNailed);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.AFRICAN;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    private double getLoadFactor() {
        return LOAD_FACTOR;
    }
}

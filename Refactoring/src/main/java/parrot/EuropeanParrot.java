package parrot;

public class EuropeanParrot extends Parrot {
    public EuropeanParrot(double voltage, boolean isNailed) {
        super(voltage, isNailed);
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.EUROPEAN;
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }
}

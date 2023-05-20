package parrot;

public class NorwegianBlueParrot extends Parrot {
    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        super(voltage, isNailed);
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.NORWEGIAN_BLUE;
    }
}

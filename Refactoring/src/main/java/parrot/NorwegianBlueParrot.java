package parrot;

public class NorwegianBlueParrot extends Parrot {
    public NorwegianBlueParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.NORWEGIAN_BLUE;
    }
}

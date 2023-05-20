package parrot;

public class EruopeanParrot extends Parrot {
    public EruopeanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.EUROPEAN;
    }
}

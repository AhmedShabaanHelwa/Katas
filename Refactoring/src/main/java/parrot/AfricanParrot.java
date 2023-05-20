package parrot;

public class AfricanParrot extends Parrot {
    public AfricanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public ParrotTypeEnum getType() {
        return ParrotTypeEnum.AFRICAN;
    }
}

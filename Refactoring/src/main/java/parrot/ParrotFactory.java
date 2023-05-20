package parrot;

public class ParrotFactory {

    private ParrotFactory() {

    }

    public static Parrot create(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        if (ParrotTypeEnum.EUROPEAN.equals(type)) return new EuropeanParrot();
        else if (ParrotTypeEnum.AFRICAN.equals(type))
            return new AfricanParrot(numberOfCoconuts);
        else if (ParrotTypeEnum.NORWEGIAN_BLUE.equals(type))
            return new NorwegianBlueParrot(voltage, isNailed);
        else throw new IllegalArgumentException("Unknown type of parrots");
    }
}
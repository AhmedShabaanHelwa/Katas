package parrot;

public class ParrotFactory {

    private ParrotFactory() {

    }

    public static Parrot create(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        if (ParrotTypeEnum.EUROPEAN.equals(type)) return new EruopeanParrot(type, numberOfCoconuts, voltage, isNailed);
        return new Parrot(type, numberOfCoconuts, voltage, isNailed);
    }
}
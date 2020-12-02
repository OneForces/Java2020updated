package Laba24;

public class ChairFactory implements ChairAbstractFactory {
    @Override
    public FunctionChair createFunctionChair() {
        return new FunctionChair();
    }

    @Override
    public MagicChair createMagicChair(String material) {
        return new MagicChair(material);
    }

    @Override
    public VictorianChair createVictorianChair(String owner) {
        return new VictorianChair(owner);
    }
}
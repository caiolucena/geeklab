package states;

public class DeadMario implements IMarioState {
    @Override
    public IMarioState takeMushroom() {
        System.out.println("Nada pode ser feito, pois o mário está morto :(");
        return this;
    }

    @Override
    public IMarioState takeFlower() {
        System.out.println("Nada pode ser feito, pois o mário está morto :(");
        return this;
    }

    @Override
    public IMarioState takeFeather() {
        System.out.println("Nada pode ser feito, pois o mário está morto :(");
        return this;
    }

    @Override
    public IMarioState takeYoshi() {
        System.out.println("Nada pode ser feito, pois o mário está morto :(");
        return this;
    }

    @Override
    public IMarioState takeDamage() {
        System.out.println("Nada pode ser feito, pois o mário está morto :(");
        return this;
    }
}

package states;

public class FireShotMario implements IMarioState {
    @Override
    public IMarioState takeMushroom() {
        System.out.println("Mário acaba de ganhar 1000 pontos!");
        return this;
    }

    @Override
    public IMarioState takeFlower() {
        System.out.println("Mário acaba de ganhar 1000 pontos!");
        return this;
    }

    @Override
    public IMarioState takeFeather() {
        System.out.println("Mário agora pode voar!");
        return new FlyingMario();
    }

    @Override
    public IMarioState takeYoshi() {
        System.out.println("Mário agora está montado em Yoshi!");
        return new YoshiMario("FireShotMario");
    }

    @Override
    public IMarioState takeDamage() {
        System.out.println("Mário perdeu o poder de atirar e voltou a ser pequeno!");
        return new LittleMario();
    }
}

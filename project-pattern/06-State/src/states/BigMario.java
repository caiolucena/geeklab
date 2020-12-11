package states;

public class BigMario implements IMarioState {
    @Override
    public IMarioState takeMushroom() {
        System.out.println("Mário acaba de ganhar 1000 pontos!");
        return this;
    }

    @Override
    public IMarioState takeFlower() {
        System.out.println("Mário agora pode atirar bolas de fogo!");
        return new FireShotMario();
    }

    @Override
    public IMarioState takeFeather() {
        System.out.println("Mário agora pode voar!");
        return new FlyingMario();
    }

    @Override
    public IMarioState takeYoshi() {
        System.out.println("Mário agora está montado em Yoshi!");
        return new YoshiMario("BigMario");
    }

    @Override
    public IMarioState takeDamage() {
        System.out.println("Mário voltou a ser pequeno!");
        return new LittleMario();
    }
}

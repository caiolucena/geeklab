package states;

public class LittleMario implements IMarioState {
    @Override
    public IMarioState takeMushroom() {
        System.out.println("Mário agora está grande!");
        return new BigMario();
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
        return new YoshiMario("LittleMario");
    }

    @Override
    public IMarioState takeDamage() {
        System.out.println("Mário morreu :(");
        return new DeadMario();
    }
}

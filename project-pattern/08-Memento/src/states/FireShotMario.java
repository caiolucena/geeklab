package states;

import java.io.Serializable;

public class FireShotMario implements IMarioState, Serializable {
    
	private static final long serialVersionUID = 1L;

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
    
    @Override
	public String showState() {
		return "I am FireShotMario!";
	}
}

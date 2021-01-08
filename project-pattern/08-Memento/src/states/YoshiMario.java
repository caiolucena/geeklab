package states;

import java.io.Serializable;

public class YoshiMario implements IMarioState, Serializable{    
	private static final long serialVersionUID = 1L;
	private String previousState;

    YoshiMario(String previousState) {
        this.previousState = previousState;
    }

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
        System.out.println("Mário acaba de ganhar 1000 pontos!");
        return this;
    }

    @Override
    public IMarioState takeYoshi() {
        System.out.println("Mário acaba de ganhar 1000 pontos!");
        return this;
    }
    
    @Override
	public String showState() {
		return "I am YoshiMario!";
	}

    @Override
    public IMarioState takeDamage() {
        switch (this.previousState) {
            case "BigMario":
                System.out.println("Mário perdeu o Yoshi, e agora voltou a ser grande.");
                return new BigMario();
            case "DeadMario":
                System.out.println("Nada pode ser feito, pois o mário está morto :(");
                return new DeadMario();
            case "FireShotMario":
                System.out.println("Mário perdeu o Yoshi, e agora voltou a atirar bolas de fogo.");
                return new FireShotMario();
            case "FlyingMario":
                System.out.println("Mário perdeu o Yoshi, e agora voltou a voar.");
                return new FlyingMario();
            default:
                System.out.println("Mário perdeu o Yoshi e agora voltou a ser pequeno.");
                return new LittleMario();
        }
    }
}

package states;

public interface IMarioState {
	
	String showState();
	
    IMarioState takeMushroom();

    IMarioState takeFlower();

    IMarioState takeFeather();

    IMarioState takeYoshi();

    IMarioState takeDamage();
}

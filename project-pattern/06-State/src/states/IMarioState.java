package states;

public interface IMarioState {
    IMarioState takeMushroom();

    IMarioState takeFlower();

    IMarioState takeFeather();

    IMarioState takeYoshi();

    IMarioState takeDamage();
}

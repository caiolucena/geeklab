package states;

public class Mario {
    protected IMarioState state;

    public Mario() {
        state = new LittleMario();
    }

    public void takeMushroom() {
        state = state.takeMushroom();
    }

    public void takeFlower() {
        state = state.takeFlower();
    }

    public void takeFeather() {
        state = state.takeFeather();
    }

    public void takeYoshi() {
        state = state.takeYoshi();
    }

    public void takeDamage() {
        state = state.takeDamage();
    }
}

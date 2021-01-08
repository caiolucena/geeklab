package states;

import memento.ConcretoMemento;
import memento.IMemento;

/**
 * Originator class that has the data we want to save 'snapshots'.
 */
public class Mario{
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
    
    public void showState() {
		System.out.println(this.state.showState());		
	}

    /**
     * Method used to generate a ConcretoMemento,passing the current state of the Originating class.
     * @return ConcretoMemento
     */
	public IMemento save() {
		return new ConcretoMemento(this.state);
	}
	
	/**
	 * Method used to restore the originator's state, using a memento received by parameter.
	 * @param memento
	 */
	public void restore(IMemento memento) {
		this.state = memento.restore();
	}

}

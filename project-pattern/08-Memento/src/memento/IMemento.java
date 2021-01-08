package memento;

import states.IMarioState;

/**
 * The IMemento interface defines what information can be retrieved.
 */
public interface IMemento {
	
	public IMarioState getState();
	
	public String getTimestamp();
	
	public IMarioState restore();

}

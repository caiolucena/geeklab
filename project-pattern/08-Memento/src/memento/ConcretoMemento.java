package memento;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import states.IMarioState;

/**
 * The Concrete Memento contains the infrastructure for storing the Originator's
 * state. She who will be responsible for implementing the methods defined in the IMemento interface.
 */
public class ConcretoMemento implements IMemento, Serializable {
	private static final long serialVersionUID = 1L;
	private IMarioState state;
	private String timestamp;
	
	public ConcretoMemento(IMarioState state) {
		this.state = state;
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date date = new Date();	
		this.timestamp = formatter.format(date);
	}
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public IMarioState getState() {
		return state;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public IMarioState restore() {
		System.out.println("--- Resturando ---- ");
		System.out.println("--- Salvo em:  " + this.timestamp);
		return this.state;
	}

}

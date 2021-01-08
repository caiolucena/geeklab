package memento;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import states.Mario;

/**
 * The Caretaker doesn't depend on the Concrete Memento class. Therefore, it
 * doesn't have access to the originator's state, stored inside the memento. It
 * works with all mementos via the base Memento interface.
 */
public class Caretaker {
	private List<IMemento> history;
	private Mario originador;
	
	public Caretaker(Mario originador) {
		this.history = new ArrayList<IMemento>();
		this.originador = originador;
	}	
	
	public Mario getOriginador() {
		return originador;
	}

	public void setOriginador(Mario originador) {
		this.originador = originador;
	}
	
	/**
	 * Stores the history of mementos in a binary file.
	 */
	public void saveGame() {	
		try {
            FileOutputStream fos = new FileOutputStream("save-game");
            ObjectOutputStream oos = new ObjectOutputStream(fos);   
            oos.writeObject(this.history);
            oos.close(); 
            System.out.println("Jogo salvo com sucesso!");
        } catch(Exception ex) {            
            System.out.println("Erro ao salvar jogo!");           
            System.out.println("");
        }
	}
	
	/**
	 * Read the binary file and try to restore its contents in the list of mementos history.
	 */
	@SuppressWarnings("unchecked")
	public void loadGame() {
		try {				
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("save-game"));			
			this.history =  (ArrayList<IMemento>) objectInputStream.readObject();
			objectInputStream.close();		
			int index = this.history.size() - 1;
			IMemento m = this.history.get(index);
			this.originador.restore(m);
			System.out.println("Jogo carregado com sucesso!");
     } catch (Exception ex) {          
    	 System.out.println("Erro ao carregar jogo!");
         System.out.println("");
     }
	}
	
	/**
	 * Activate the save method of the originator and store the return in the history list.
	 */
	public void save() {
		this.history.add(this.originador.save());
	}
	
	/**
	 * Use the history list to restore the last available memory
	 */
	public void undo() {
		int index = this.history.size() - 2;
		if(index >= 0) {
			IMemento m = this.history.get(index);
			this.originador.restore(m);
			if(index > 0) {
				this.history.remove(index);
			}
		}		
	}
}

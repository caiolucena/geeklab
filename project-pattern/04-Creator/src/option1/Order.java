package option1;

import java.util.ArrayList;

import models.OrderItem;
import models.Product;

public class Order {
    private ArrayList<OrderItem> items;
    
    public Order() {
    	this.items = new ArrayList<OrderItem>();
    }

	public ArrayList<OrderItem> getItens() {
		return items;
	}

	public void setItens(ArrayList<OrderItem> itens) {
		this.items = itens;
	}

	public void addItem(OrderItem orderItem) {
        this.items.add(orderItem);
    }
	
	public double total(){		
	    return this.items
	    		.stream()
	    		.map(orderItem->orderItem.total())
	    		.reduce(0.0, (parcial, totalCurrent ) -> parcial + totalCurrent);	    
    }

}
package option2;

import java.util.ArrayList;

import models.OrderItem;
import models.Product;

public class CreatorOrder {
    private ArrayList<OrderItem> items;
    
    public CreatorOrder() {
    	this.items = new ArrayList<OrderItem>();
    }   
    

	public ArrayList<OrderItem> getItens() {
		return items;
	}

	public void setItem(ArrayList<OrderItem> itens) {
		this.items = itens;
	}

	public void addItem(Product product, int amount) {
        OrderItem orderItem = new OrderItem(product,amount);
        this.items.add(orderItem);
    }
	
	public double total(){		
	    return this.items
	    		.stream()
	    		.map(orderItem->orderItem.total())
	    		.reduce(0.0, (parcial, totalCurrent ) -> parcial + totalCurrent);	    
    }
}
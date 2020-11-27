package main;

import java.util.List;

import models.OrderItem;
import models.Product;
import option1.Order;
import option2.CreatorOrder;

public class Main {
	
	public static void showItems(List<OrderItem> items) {
		System.out.println("   Nome do Produto     Preço    Quantidade   Total ");
		items
		.forEach(item->System.out.printf("  %s       %.2f        %d       %.2f\n", item.getName(),item.getUnitPrice(), item.getAmount(), item.total() ));
	}
	
	public static void main(String args[]){
		/* Os produtos seriam selecionados de alguma forma */
		Product p1 = new Product("01522","Biscoito Claudia",2.15); 
		Product p2 = new Product("11522","Biscoito Claudio",3.35);
		
		/* Sem utilizar os principios do Creator */
		
		OrderItem orderItem1 = new OrderItem(p1,5);
		OrderItem orderItem2 = new OrderItem(p2,3);
		
		Order order = new Order();
		order.addItem(orderItem1);
		order.addItem(orderItem2);
		
		System.out.println("=================================================");
		System.out.println("==========         SEM CREATOR         ==========");
		System.out.println("=================================================");		
		
		System.out.printf("Total da Venda: %2f\n", order.total());
		
		showItems(order.getItens());
		
		System.out.println("=================================================");
		
		
		/* Opção utilizando os principios do Creator */
		
				
		CreatorOrder creatorOrder = new CreatorOrder();
		creatorOrder.addItem(p1,5);
		creatorOrder.addItem(p2,3);
		
		System.out.println("=================================================");
		System.out.println("==========         COM CREATOR         ==========");
		System.out.println("=================================================");
		
		System.out.printf("Total da Venda: %2f\n", creatorOrder.total());
		showItems(creatorOrder.getItens());
		
		System.out.println("=================================================");
		
	}
	

}

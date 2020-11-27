package models;

public class OrderItem {    
    private String name;
    private double unitPrice;
    private int amount;
    
    public OrderItem(Product product, int amount){
        this.setName(product.getName());
        this.setUnitPrice(product.getPrice());       
        this.setAmount(amount);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
    
    public double total() {
    	return this.getUnitPrice() * this.getAmount();
    }
    
}
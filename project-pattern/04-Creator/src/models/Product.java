package models;

public class Product {  
	private String id;
    private String name;
    private String description;
    private String code;
    private Double price;
    
    public Product(String code, String name, Double price) {
    	this.setCode(code);
    	this.setName(name);
    	this.setPrice(price);
    }
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}   
    
    
}
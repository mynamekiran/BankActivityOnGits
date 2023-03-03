package Food;

import java.time.LocalDate;

public class Cart {

	private int itemid;
	private int orderid;
	private int price;
	private int qty;
	private LocalDate orderdate;
	private LocalDate ordertime;
    private int custid;
	
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public LocalDate getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}
	public LocalDate getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(LocalDate ordertime) {
		this.ordertime = ordertime;
	}
	
	
}

package application;

import java.util.Date;
import entities.Order;
import entities.enums.OrderStatus;

public class Program {
	
	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
	
		System.out.println(order);
		
		OrderStatus os01 = OrderStatus.DELIVERED;
		
		OrderStatus os02 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os01);
		
		System.out.println(os02);
		
	}

}
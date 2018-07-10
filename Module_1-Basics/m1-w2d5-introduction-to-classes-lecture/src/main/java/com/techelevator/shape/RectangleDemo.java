package com.techelevator.shape;

public class RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(10);
		rectangle.setHeight(20);
		
		//Rectangle rec2 = new Rectangle();
		
		Rectangle rec2 = new Rectangle(30, 30);
		
		rec2.setHeight(30);
		rec2.setWidth(30);
		System.out.print(rectangle.isLargerThan(rec2));
		System.out.println("Rectangle 2: " + rec2);
		
		Rectangle rec3 = new Rectangle(10, 20);
		System.out.println("Are 1 and 3 equals?: " + rectangle.equals(rec3));
		String result = "";
		if(rec2.equals(rec3)) {
			result = "Equal!";
			
		}else {
			result = "Not equal";
		}
		System.out.println(result);	
	}

}

package org.tnsif.acc.c2tc.oops;

public class FoodItem {

	
		String name;
		double price;
		String category;
		void displayDetail()
		{
			System.out.println("Food name:"+name);
			System.out.println("Price:"+price);
			System.out.println("Category:"+category);

	}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			FoodItem fooditem1=new FoodItem();
			fooditem1.name="Biryani";
			fooditem1.price=299.99;
			fooditem1.category="Rice";
			
			FoodItem fooditem2=new FoodItem();
			fooditem1.name="Pizza";
			fooditem1.price=399.99;
			fooditem1.category="Fast Food";
			
			fooditem1.displayDetail();
			fooditem2.displayDetail();

			
}
}
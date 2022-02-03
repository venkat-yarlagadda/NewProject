public class Car{
	String brand;
	String model;
	String color;
	double price;
	static String madein="INDIA";
  public static void main(String[] arg){
		Car c = new Car();
			c.brand="Mahindra";
			c.model="XUV";
			c.color="Red ";
			c.price=1500000;
		Car c1 = new Car();
		    c1.brand = "Tata";
			
			c1.color="White";
			c1.price=1200000;
		Car c2 = new Car();
		    c2.brand="Ford";
			c2.model="Aspire";
			c2.color="Black";
			c2.price=900000;
			
		c.madein="IND";
		c1.madein="Indiaaaa";
		System.out.println(c.madein+" "+c1.madein+" "+c2.madein);
		System.out.println(c.brand+" "+c.model+" "+c.color);
		System.out.println(c1.brand+" "+c1.model+" "+c1.color);
		System.out.println(c2.brand+" "+c2.model+" "+c2.color);
		
		// India  India India
		// IND India India
		// IND IND IND
		
     
  }

}
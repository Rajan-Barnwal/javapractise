public class Car extends Vehicle{
	private String model;
	//private int year;
	public Car(String brand,String model){
		super(brand);
		this.model=model;
	}

	public Car(String brand,String model,int year){
		super(brand,year);
		this.model=model;
		//this.year=year;
		//super(year);
	}

	public void displayCarInfo(){
		System.out.println("Car info: ");
		super.displayBrand();
		System.out.println("Model: "+model);
		super.displayYear();
		//System.out.println("Car's year: "+year);
	}
}
		
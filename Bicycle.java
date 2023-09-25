public class Bicycle extends Vehicle{
	private int gears;
	public Bicycle(String brand,int gears){
		super(brand);
		this.gears=gears;
	}
	public void displayBicycleInfo(){
		System.out.println("Bicycle Info: ");
		super.displayBrand();
		System.out.println("Gears: "+gears);
	}
}
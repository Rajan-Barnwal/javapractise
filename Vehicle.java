public class Vehicle{
   protected String brand;
   protected int year;
   public Vehicle(String brand){
      this.brand=brand;
   }
   public Vehicle(String brand, int year){
      this.brand=brand;
      this.year=year;
   }

   public void displayBrand(){
    System.out.println("Brand: "+brand);
   }
   public void displayYear(){
    System.out.println("Car's Year: "+year);
   }
}
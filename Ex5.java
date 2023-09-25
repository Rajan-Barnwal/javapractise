public class Ex5 {
public static void main(String[] args) {
  int a=3,b=5 ;
  System.out.print("Before swap : "+a);
  System.out.println(b);
  a=a+b;
  b=a-b;
  a=a-b;
  
  System.out.print("After swap : "+a);
  System.out.println(b);
}
}
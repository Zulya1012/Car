public class d4{
  public static void main(String[] arg) throws Exception{
    
    Car car1 = new Car();
    Car car2 = new Car();
    
    car1.SetName("Mercedes Benz");
    car1.SetSpeed(180.5f);
    car1.SetColor("White");
      
    car2.SetName("BMW");
    car2.SetSpeed(180.5f);
    car2.SetColor("Red");
    
    car1.getName();
    car2.getName();
    System.out.println(car1.getName() + " " + car2.getName());
    
    
    car1.print();
    car2.print();
  }
}
    
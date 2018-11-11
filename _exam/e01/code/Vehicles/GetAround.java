public class GetAround {

  public static void ga01() {
      BeachCruiser a = new BeachCruiser(21.5, "blue");
      System.out.println("ga01: " +  a.getColor());
  }

  public static void ga02() {
      Bicycle b = new BeachCruiser(22.0, "yellow");
      // System.out.println("ga02: " +  b.getColor());        
  }

  public static void ga03() {
      BeachCruiser c = new BeachCruiser(26.0, "red");
      System.out.println("ga03: " +  c.getWheelDiameter());       
  }

  public static void ga04() {
      Rentable d = new EBike(1,24.0,"Hopr","12V");
      System.out.println("ga04: " + d.getCost(5,45));
  }
  
  public static void ga05() {
      Rentable e = new EBike(1,24.0,"Hopr","12V");
      // System.out.println("ga05: " + e.getName());      
  }

  public static void ga06() {
      Electric f = new EBike(3,26.0,"Hopr3","12V");
      // System.out.println("ga06: " + f.getName());      
  }

  public static void ga07() {
      Electric g = new Scooter("Lime");
      System.out.println("ga07: " + g.getBatteryType());      
  }

  public static void ga08() {
      Scooter h = new Scooter("Bird");
      System.out.println("ga08: " + h.getChargeTime());       
  }

  
  public static void main (String [] args) {
      System.out.println("ga01"); ga01();
      System.out.println("ga02"); ga02();
      System.out.println("ga03"); ga03();
      System.out.println("ga04"); ga04();
      System.out.println("ga05"); ga05();
      System.out.println("ga06"); ga06();
      System.out.println("ga07"); ga07();
      System.out.println("ga08"); ga08();
  }

}

package Harshat;

public interface Vehicle2 {
  void speed();
  void fuel();
  void brake();
  default void wheel()
  {
	  System.out.println("default");
  }
  static void wheel1()
  {
	  System.out.println("static");
  }

}

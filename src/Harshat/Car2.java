package Harshat;

public class Car2 implements Vehicle2,Carmain2 {
     public static void main(String args[])
     {
    	 Vehicle2 v2=new Car2();
    	   v2.fuel();
    	   v2.brake();
    	   v2.wheel();
    	   Vehicle2.wheel1();
     }
     public void wheel()
     {
    	 System.out.println("wheel");
     }
     public void wheel1()
     {
    	 System.out.println("wheel1");
     }
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("speed");
	}

	@Override
	public void fuel() {
		// TODO Auto-generated method stub
		System.out.println("fuel");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("brake");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

}

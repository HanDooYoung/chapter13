package chapter12;
abstract class Car8{
	int speed=0;
	String color;
	
	final void upSpeed(int speed) {
		this.speed+=speed;
	}
	
}

class Sedan8 extends Car8{
	
}

class Truck8 extends Car8{
	
}
public class Ex12_08 {

	public static void main(String[] args) {
		
		//Car8 car1=new Car8();
		Sedan8 sedan1=new Sedan8();
		System.out.println("승용차 인스턴스 생성~~");
		Truck8 truck1=new Truck8();
		System.out.println("트럭 인스턴스 생성~~");

	}

}

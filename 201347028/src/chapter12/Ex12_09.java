package chapter12;
abstract class Car9{
	int speed=0;
	String color;
	
	final void upSpeed(int speed) {
		this.speed+=speed;
	}
	
	abstract void work();
	
}

class Sedan9 extends Car9{
	void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}
}

class Truck9 extends Car9{
	void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");
	}
}
public class Ex12_09 {

	public static void main(String[] args) {
		
		Sedan9 sedan1=new Sedan9();
		sedan1.work();
		Truck9 truck1=new Truck9();
		truck1.work();

	}

}

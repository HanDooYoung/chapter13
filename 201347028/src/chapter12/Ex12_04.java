package chapter12;
class Car4{
	private String color;
	int speed;
}

class Sedan4 extends Car4{
	void setSpeed(int speed) {
		this.speed=speed;
	}
	
//	void setColor(String color) {
//		this.color=color;
//	}
}

public class Ex12_04 {

	public static void main(String[] args) {
		Sedan4 sedan1=new Sedan4();
		
		sedan1.setSpeed(300);
		System.out.println("승용차 속도 ==> "+sedan1.speed);

	}

}

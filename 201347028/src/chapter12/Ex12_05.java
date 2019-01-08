package chapter12;
class Car5{
	protected String color;
	int speed;
}

class Sedan5 extends Car5{
	void setSpeed(int speed) {
		this.speed=speed;
	}
	
	void setColor(String color) {
		this.color=color;
	}
}
public class Ex12_05 {

	public static void main(String[] args) {
		Sedan5 sedan1=new Sedan5();
		
		sedan1.setSpeed(300);
		sedan1.setColor("빨강");
		System.out.println("승용차 속도 ==> "+sedan1.speed);
		System.out.println("승용차 색상 ==> "+sedan1.color);

	}

}

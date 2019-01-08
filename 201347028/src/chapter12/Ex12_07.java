package chapter12;
class Car7{
	int speed=0;
	
	final void upSpeed(int speed) {
		this.speed+=speed;
	}
	
}

class Sedan7 extends Car7{
	final static String CAR_TYPE="승용차";
	
//	void upSpeed(int speed) {
//		
//	}
}
public class Ex12_07 {

	public static void main(String[] args) {
		System.out.println("Sedan 클래스 타입 ->"+Sedan7.CAR_TYPE);

	}

}

package chapter11;
class Car11{
	String color;
	int speed;
	static private int count=0;
	
	Car11(){
		count++;
	}
	
	static int getCount() {
		return count;
	}
}
public class Ex11_11 {

	public static void main(String[] args) {
		System.out.println("현재 생산된 자동차 숫자 ==>"+Car11.getCount());
		
		Car11 myCar1=new Car11();
		System.out.println("현재 생산된 자동차 숫자 ==>"+myCar1.getCount());

	}

}

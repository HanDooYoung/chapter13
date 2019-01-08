package chapter12;

class Car2{
	Car2(){
		System.out.println("슈퍼 클래스 생성자 호출~~");
	}
}

class Sedan2 extends Car2{
	Sedan2(){
		System.out.println("서브 클래스 생성자 호출~~");
	}
}

public class Ex12_02 {

	public static void main(String[] args) {
		
		Sedan2 sedan1=new Sedan2();

	}

}

package a10_클래스;

public class CarTest {
	// 자동차 3
	// carNumber = 문자열, 43다 1317
	// model = 문자열, k5
	
	// 메소드 carInfo
	// 차량번호는 43다 1317이고 모델은 k5입니다.
	
	
	public static void main(String[] args) {
		Car c1 = new Car("43다 1317", "k3");
		Car c2 = new Car("42다 1316", "k5");
		Car c3 = new Car("41다 1315", "k7");
		Car c4 = new Car();
		
		c4.setCarNumber("33나 3324");
		System.out.println(c2.getCarNumber());
		
		c1.setSerialNumber(10);
		System.out.println("c1의 시리얼 번호: " + c1.getSerialNumber());
		
		
		c1.carInfo();
		c2.carInfo();
		c3.carInfo();
		c4.carInfo();
	}
	
}

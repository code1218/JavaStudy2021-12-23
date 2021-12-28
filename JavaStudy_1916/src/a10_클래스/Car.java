package a10_클래스;

/**
 * 
 * 접근 지정자
 * default
 * public
 * private
 * protected
 *
 */

public class Car {
	private String carNumber;
	private String model;
	private int serialNumber;
	
	public Car() {
		
	}
	
	public Car(String carNumber, String model) {
		System.out.println(this);
		this.carNumber = carNumber;
		this.model = model;
	}
	
	
	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSerialNumber() {
		return serialNumber;
	}
	
	public int getSerialNumber2() {
		return serialNumber - 20210000;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber + 20210000;
	}

	public void carInfo() {
		System.out.println("차량번호는 " + carNumber + "이고 모델은 " + model + "입니다.");
	}
}

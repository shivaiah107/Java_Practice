package intro_oop;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(10);
		MotorBike honda = new MotorBike(-20);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		honda.start();
		ducati.stop();
		
		ducati.setSpeed(-100);
		ducati.increaseSpeed(100);
		honda.increaseSpeed(200);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(50);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
	
		
	}

}

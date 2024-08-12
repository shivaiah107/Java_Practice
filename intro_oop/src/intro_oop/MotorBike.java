package intro_oop;

public class MotorBike {
	MotorBike(int speed){
		if(speed > 0)
			this.speed = speed;
	}
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed > 0)
		this.speed = speed;
	}
	public void increaseSpeed(int howmuch) {
		setSpeed( this.speed + howmuch);
	}
	public void decreaseSpeed(int howmuch) {
		setSpeed( this.speed - howmuch);
		
	}
	void start() {
		System.out.println("the bike has started");
	}
	void stop() {
		System.out.println("bike stopped");
	}

}

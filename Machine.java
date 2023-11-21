package Begins;
class Functionality{
	void speak(String text) {
		System.out.println(text);
	}
	void parts (int parts) {
		System.out.println(parts);
	}
	void location(String direction , int floor) {
		System.out.println("direction" +" " +  floor);
	}
}
public class Machine {
public static void main(String[] args) {
	Functionality f = new Functionality();
	f.speak("It is on now ");
	f.parts(10);
	f.location("east", 5);
}
}

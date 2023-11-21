package Begins;
class Person1{
	private String name ;
	private int age ;
	
	void setName(String name ) {
		this.name = name ;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name ;
	}
	public int getAge() {
		return age ;
	}
}
public class GetterSetter {
 public static void main(String[] args) {
	Person1 p = new Person1();
	
	p.setName("Sagar");
	p.setAge(23);
	
	System.out.println(p.getClass());
	System.out.println(p.getName());
	System.out.println(p.getAge());
}
}

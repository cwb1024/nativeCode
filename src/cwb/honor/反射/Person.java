package cwb.honor.反射;

public class Person {
	private String name;
	private int age;
	public String email;

	public Person(){
		
	}
	
	public Person(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	private Person(String name){
		this.name=name;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void eat(){
		System.out.println("Person eat");
	}
	
	public void eat(String name){
		System.out.println(name+"  eat" );
	}
	
	private void walk(){
		System.out.println("Person  Walk");
	}
	
	private void walk(String name){
		System.out.println(name+"  Walk");
	}
	
	protected void sing(){
		System.out.println("Person  sing");
	}
	
	protected void sing(String name){
		System.out.println(name+"  sing");
	}
	
	void laugh(){
		System.out.println("Person  laugh");
	}
	
	void laugh(String name){
		System.out.println(name+"  laugh");
	}
	
	public void cry(){
		System.out.println("person  cry");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email
				+ "]";
	}

	
	
}

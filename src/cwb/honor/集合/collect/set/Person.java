package cwb.honor.集合.collect.set;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {

	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	@Override
	public String toString() {
		return name+":"+age;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+age*22;//乘以一个数，表示缩小不同对象相同hashCode的概率
	}
	
	/*public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj==null) {
			return false;
		}
		if (obj instanceof Person) {
			Person p=(Person) obj;
			return name.equals(p.name) && age ==p.age;
		}
		return false;
	}*/
	
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj==null) {
			return false;
		} 
		if (obj instanceof Person) {
			Person p=(Person) obj;
			return name.equals(p.name)&& age==p.age;
			
		}
		return false;
		
	}
	
}

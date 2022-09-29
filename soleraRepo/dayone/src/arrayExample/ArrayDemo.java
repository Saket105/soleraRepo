package arrayExample;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		
		for(int a:arr) {
			System.out.println(a);
		}
		
		System.out.println("**********************************");
		Person p1 = new Person(420,"shivam");
		
		Person[] personArr = new Person[5];
		personArr[0] = new Person(1,"Lokesh");
		personArr[1] = new Person(2,"Sam");
		personArr[2] = new Person(3,"Ankit");
		personArr[3] = new Person(4,"Saksham");
		personArr[4] = new Person(5,"Qwerty");
		
		for (Person person : personArr) {
			System.out.println(person);
		}
		
	}

}

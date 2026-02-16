package Super_keyword;

public class cat extends animal {
	
	int leg_number=6;
	public void display() {
		
		System.out.println("PARENT CLASS ANIMAL LEG="+super.leg_number);//point parent class variable
		System.out.println("Child CLASS ANIMAL LEG="+leg_number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c=new cat();
		c.display();

	}

}

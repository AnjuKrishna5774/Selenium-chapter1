package testinheritance;

public class childclass extends parentclass {
	
	public void childmethod()
	{
		
		System.out.println("Hello Child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childclass c1=new childclass();
		c1.myparentmethod();
		c1.childmethod();

	}

}

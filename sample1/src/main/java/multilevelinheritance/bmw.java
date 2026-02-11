package multilevelinheritance;

public class bmw extends car{

	public void finalize()
	{
		
		System.out.println("My car is BMW");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
bmw b=new bmw();
b.select();
b.find();
b.finalize();
	}

}

package hyrarchicalinheritance;

public class son extends father{
public void showdsonetails()
{
System.out.println("I am the son");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		son s=new son();
		s.show();
		s.showdsonetails();

	}

}

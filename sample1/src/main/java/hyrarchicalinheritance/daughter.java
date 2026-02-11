package hyrarchicalinheritance;

public class daughter extends father {
public void showdaughterdetails()
{
System.out.println("I am the daughter");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
daughter d=new daughter();
d.show();
d.showdaughterdetails();
	}

}

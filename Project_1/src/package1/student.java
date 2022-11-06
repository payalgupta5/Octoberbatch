package package1;

public class student {
	
	int age;
	int roll_no;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student ref_var=new student();
		ref_var.age=32;
		ref_var.roll_no=1444;
		ref_var.display1();
		ref_var.display2();
		System.out.println(ref_var.age);
		System.out.println(ref_var.roll_no);

	}

}

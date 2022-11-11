package package1;

public class Asignment3 {
	
	public Asignment3()
	{
		this(1,2,3,4);
		System.out.println("Default Constructor");
	}
	
	public Asignment3(int a)
	{
		this();
		System.out.println("One Parameterized Constructor");
	}
	
	public Asignment3(int a,int b)
	{
		this(1,2,3);
		System.out.println("Two Parameterized Constructor");
	}
	public Asignment3(int a,int b,int c)
	{
		this(1);
		System.out.println("Three Parameterized Constructor");
	}
	public Asignment3(int a,int b,int c,int d)
	{
		System.out.println("Four Parameterized Constructor");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Asignment3 obj=new Asignment3(2,4);
	}

}

package package1;

public class Asignment4 {
	
	public void method()
	{
		System.out.println("Default method");
	}
	
	public void method1(int a)
	{
		
		System.out.println("1 Parameterized method");
		
	}
	public void method2(int a,int b)
	{
		System.out.println("2 Parameterized method");
	}
	public void method3(int a,int b,int c)
	{
		System.out.println("3 Parameterized method");
		this.method();
		this.method4(1,2,3,4);
		this.method1(1);
		this.method2(1,2);
	}
	public void method4(int a,int b,int c,int d)
	{
		System.out.println("4 Parameterized method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asignment4 obj=new Asignment4();
		obj.method3(1,2,3);

	}

}

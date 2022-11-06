package package1;

public class test {
	
	int a,b;
	
	public int sum(int a,int b)
	{
		int sumresult=a+b;
		return(sumresult);
		
	}
	public int sub(int a,int b)
	{
		int subresult=a-b;
		return(subresult);
	}
	
	public int mul(int a,int b)
	{
		int mulresult=a*b;
		return(mulresult);
	}
	public void div(int a,int b)
	{
		float divresult=a/b;
		System.out.println("Result is"+divresult);
	}
	
	public static void main(String[] args) 
	{
		test ref_var=new test();
		int res1=ref_var.sum(10, 2);
		int res2=ref_var.sum(res1, 2);
		int res3=ref_var.sub(res2, 2);
		int res4=ref_var.mul(res3, 2);
		ref_var.div(res4,2);
		System.out.println("Result is shown");
	}

}

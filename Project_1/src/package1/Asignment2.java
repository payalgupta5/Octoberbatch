package package1;

public class Asignment2 {
	
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
		System.out.println("Result of (((((10*2)+2)-2)-2)/2) is "+divresult);
	}
	
	public static void main(String[] args) 
	{
		Asignment2 ref_var=new Asignment2();
		int res1=ref_var.mul(10, 2);
		int res2=ref_var.sum(res1, 2);
		int res3=ref_var.sub(res2, 2);
		int res4=ref_var.sub(res3, 2);
		ref_var.div(res4,2);
	}

}

package Maven;



public class calcTest {
	
	int a=20,b=10,c;
	calcTest ocalc ;

	public void Add()
	{
		c= a+b;
		System.out.println("Add"+c);
	}
	
	public void Sub()
	{
		c= a-b;
	System.out.println("Sub"+c);
	}
	

	public void Mul()
	{
		c= a*b;
		System.out.println("Mul"+c);
	}
	

	//public static void main(String[] args) {

	//Calc obj = new Calc();
	//obj.c= obj.a+obj.b;
	//System.out.println("Add:"+obj.c);


	//}
	public static void main(String[] args) {

		calcTest ocalc = new calcTest();
	ocalc.Add();
	ocalc.Sub();
	ocalc.Mul();
}
}

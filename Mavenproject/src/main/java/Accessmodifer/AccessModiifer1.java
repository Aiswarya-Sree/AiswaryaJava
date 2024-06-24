package Accessmodifer;

public class AccessModiifer1 {
	public void display1()
	{
		System.out.println("public method");
	}
    private void display2()
    {
    	System.out.println("private method");
    }
    protected void display3()
    {
    	System.out.println("protected method");
    }
     void display4()
    {
    	System.out.println("default method");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        AccessModiifer1 am= new AccessModiifer1();
        am.display1();
        am.display2();
        am.display3();
        am.display4();
      
	}

}

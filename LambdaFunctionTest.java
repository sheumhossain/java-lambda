package main;

public class LambdaFunctionTest {
	public static void main(String arg[])
	{
		LambdaFunction hello=(test)->{System.out.println(" hello"+test);};
		hello.string(" Apple");
	}
}
		
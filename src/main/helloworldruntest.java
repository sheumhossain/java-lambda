package main; 

public class helloworldruntest {
	public static void main(String[] args) {
		helloruntest hw = (name)->"hello" + name;
		String h = hw.sayHello("sheum");
		System.out.println(h);
	}

}

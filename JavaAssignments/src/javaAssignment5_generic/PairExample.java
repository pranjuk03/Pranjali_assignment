package javaAssignment5_generic;

public class PairExample {
	public static void main(String[] args) {
        Pair<String,String> obj1=new Pair();
		obj1.setKey("1");
		obj1.setValue("Hello");
		System.out.println("Key:"+obj1.getKey()+" :: Value:"+obj1.getValue());
		System.out.println(" ");
		Pair<String,Date> obj2=new Pair();
		obj2.setKey("Today is");
		obj2.setValue(new Date());
		System.out.println("Key:"+obj2.getKey()+" :: Value:"+obj2.getValue());		
	}
}

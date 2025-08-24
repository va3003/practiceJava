package com.Learning.practiceJava;
import static java.lang.System.out;
/**
 * Hello world!
 *
 */
public class EqualsHashCodePractice 
{
    public static void main( String[] args )
    {
        int i = 10;
        int j = 10;
        int k = 9;
        
        TestEquals tq1 = new TestEquals(5);
        TestEquals tq2 = new TestEquals(5);
        TestEquals tq3 = new TestEquals(6);
        
        out.println(tq1==tq2);
//        out.println(i==k);
        out.println();
        out.println(tq1.equals(tq2));
//        out.println(tq1.equals(tq1));
//        out.println(tq1==tq2);
        
        String s1 = new String("HELLO"); 
        String s2 = new String("HELLO"); 
        System.out.println(s1 == s2); 
        System.out.println(s1.equals(s2)); 
        
        
        //hashcode using hashcode to compare values within object.
        
    }
    
    
}


class TestEquals{
	int id;
	TestEquals(int id){
		this.id=id;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		TestEquals other = (TestEquals) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}
//	
}
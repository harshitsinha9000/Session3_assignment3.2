//assignment 3.2
package java_session3;

public class String_comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1,str2;
		str1="hi";
		str2="hello";
		
		boolean same;
		
		if(str1.equalsIgnoreCase(str2))
		{
			same=true;
		}
		else
		{
			same=false;
		}
		
		System.out.println("Strings are equal ="+same);
	}

}

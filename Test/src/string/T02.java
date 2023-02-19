package string;

public class T02 {

	public static void main(String[] args) {
		String str ="vikas";
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		System.out.println("Reverse String is = " +str1 );

	}

}

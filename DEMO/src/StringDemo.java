// StringDemo.java ****************************************************************
public class StringDemo {
	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		
		String s3=new String("java");
		String s4=new String("java");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		String s5="Hello";
		String s6="World";
		String s7="HelloWorld";
		String s8=s5+s6;
		String s9="Hello"+"World";
		String s10=(s5+s6).intern();
		System.out.println(s7==s8);
		System.out.println(s7==s9);
		System.out.println(s7==s10);
		
		
		String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String newStr="";
		long ns1= System.nanoTime();
		for(int i=0;i<str.length();i++)
			for(int j=0;j<=i;j++)
				newStr = newStr+str.charAt(j);
		long ns2= System.nanoTime();
		System.out.println("tome Taken   :  " + (ns2-ns1) + "  nano Sec");
		
		// StringBuffer +++++++++++++++++++++++
		StringBuffer strBuff = new StringBuffer();
		long ns3= System.nanoTime();
		for(int i=0;i<str.length();i++)
			for(int j=0;j<=i;j++)
				strBuff.append(str.charAt(j));
		long ns4= System.nanoTime();
		System.out.println("tome Taken   :  " + (ns4-ns3) + "  nano Sec");
		
		// StringBuilder  ++++++++++++++++++++++
		StringBuilder strBuild = new StringBuilder();
		 ns3= System.nanoTime();
		for(int i=0;i<str.length();i++)
			for(int j=0;j<=i;j++)
				strBuild.append(str.charAt(j));
		ns4= System.nanoTime();
		System.out.println("tome Taken   :  " + (ns4-ns3) + "  nano Sec");	
	}
}

public class Demo {
	public static void fun(int n) {
		int n2=n;
		int z=0,o=0;
		String bin="";
		while(n>0) {
			if(n%2==0) {
				z++;
				bin+="0";
			}else {
				o++;
				bin+="1";
			}
			n/=2;
		}

		
		System.out.println("n = " + n2 + "  binary  :  "+ bin + "     Zeroes = " + z + "    Ones = " + o);
		
		
	}
	
	public static void main(String[] args) {
		

		String s="abc";
		if(!s.equals("aaa")) {
			System.out.println("hiiiiiiiiii");
		}else {
			System.out.println("hellooooooooo");
		}
//		for(int i=0;i<15;i++) {fun(i);}
//		fun(12345);
		
	}

}

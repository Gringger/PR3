import java.util.Scanner;

public class Number {
	 long i;
     long j;

     long mxcnt=6;
     public void run(){
    	 scour();

    	 bigger();
    	 count();
    	 
     }

private void scanner(){
	Scanner fu1 = new Scanner(System.in);
    while (fu1.hasNextInt()) { 
    	 i = fu1.nextInt(); 
    	 j = fu1.nextInt();
        fu1.close();
}}
private void bigger(){
	      if (i>j){ 

 
		 time=i; i=j; j=time;
		}
}
    private void count(){
    	long k;
    long n=i;
	 while(n<=j){
		 k=n;
		 int cnt;
		 cnt=1;
		 
		 while(k!=1){					 
		 if (k % 2 != 0)
			{
				k = 3 * k + 1;
				cnt++;
			}
		 else{	
				k = k / 2;
				cnt++;
		 }
		 
		 }
		 if (cnt>mxcnt){
			 mxcnt=cnt;
		 }
		 n++;
	}
    	System.out.println(i+" "+j+" " + mxcnt);
	
    }
    

	public static void main(String[] args) {
		new Number();
	

	}
}


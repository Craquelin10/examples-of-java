package notTutma;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int a[]= {0,0,0,0,0,0,1,2,4,2,1};
		int c,s;
		
		for(c=0;c<a.length;c++) {
			if(c==10) {
			System.out.printf("%d: ",100);
			
			
			}else {
				System.out.printf("%02d-%02d: ",c*10,c*10+9);
				System.out.printf("\n");
				
			}
			for(s=0;s<a[c];s++) {
				
				System.out.printf("*");
				System.out.printf("\n");
				
				
				
			}
			}
		}
		

	}



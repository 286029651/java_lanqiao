package jichu;

import java.util.Scanner;

public class BASIC_16 {
	//Decomposition factor
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m = s.nextInt();
		
		
		for(int i = n; i <= m; i ++) {
			String s1 = "";
			int z = i;
			int  k=2;  //����һ����С�������� 
		    while (k<=z){    //����ѭ���ж�   
		    	if(k==z){ 
		    		s1 += z;
		    		break;
		    	}else if (z%k==0){  
		    		s1 =s1 + k+"*";
		    		z=z/k;
		    		}
		    	else k++; 
		 	}
		    System.out.println(i + "=" + s1);
		}		
	}
}

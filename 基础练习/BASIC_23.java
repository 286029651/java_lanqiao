	package jichu;
	
	import java.util.Arrays;
	import java.util.Scanner;
	
	public class BASIC_23 {
		//оƬ����
		public static void main(String[] args) {
			Scanner key=new Scanner(System.in);
			int n=key.nextInt();
			int [][]a=new int[n+1][n+1];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					a[i][j]=key.nextInt();
				}
			}
			for(int i=0;i<n;i++){
				int t = 0,f = 0;//  t��ʾֵΪ��1���Ĵ�����f��ʾֵΪ��0���Ĵ���
				for(int j=0;j<n;j++){
					if(a[j][i]==1) t++;
					if(a[j][i]==0) f++;		
				}
				if(t>f) System.out.print((i+1)+" ");
			}
		}
	}

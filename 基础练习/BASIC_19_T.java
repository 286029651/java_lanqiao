package jichu;

import java.io.IOException;
import java.util.Scanner;

public class BASIC_19_T {
	// �����Ĵ���
	static char[] s;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        s = in.nextLine().toCharArray();
        in.close();
        int count = 0;
        int j = n - 1;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int k = j; k >= i; k--) {
                if (k == i) {//��i���ַ�Ϊ������
                    if (n % 2 == 0 || flag) {//���ܹ��ɻ��ĵ��������
                        System.out.println("Impossible");
                        return;
                    }
                    flag = true;//������һ���������ַ�,������������������ַ�����nΪ�������ܹ��ɻ���
                    count += n / 2 - i;
                } else if (s[i] == s[k]) {
                    for (int l = k; l < j; l++) {
                        swap(l, l + 1);//��s[k]����s[j]��
                        count++;//ͳ�ƽ�������
                    }
                    j--;
                    break;
                }
            }
        }
        System.out.println(count);
    } 
    private static void swap(int c, int d) {
        char temp = s[c];
        s[c] = s[d];
        s[d] = temp;
 
    }
}
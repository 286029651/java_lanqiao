package jichu;

import java.util.Scanner;

public class BASIC_24 {
	//��������Ԥ��
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int v1 = in.nextInt();	//�����ٶ�
        int v2 = in.nextInt();	//�ڹ��ٶ�
        int t = in.nextInt();		//����t�׻�����
        int s = in.nextInt();		//ͣ������Ϣs��
        int l = in.nextInt();
        int l1 = 0;					//���ӵ�ǰ�ܵĳ���
        int l2 = 0;					//�ڹ��ܵĳ���
        int breakTime = 0;		//������Ϣʱ��
        int flag = 1; 				//������Ϣ
        int countTime = 0;
        while (l1 < l && l2 < l) {
            if (flag == 1 && l1 - l2 < t || flag == 0 && breakTime >= s) {
                flag = 1;
                l1 += v1;
                breakTime = 0;
            } else {
                flag = 0;
                breakTime++;
            }
            l2 += v2;
            countTime++;
        }
        if (l1 > l2) {
            System.out.println("R\n" + countTime);
        } else if (l1 < l2) {
            System.out.println("T\n" + countTime);
        } else if (l1 == l2) {
            System.out.println("D\n" + countTime);
        }
	}
}

package Day02;

import java.util.Scanner;

public class Day02_5 {//cs

	public static void main(String[] args) {//ms
//		//����2 : ���󼼱�
//			//[�Է�����] : �ݾ�
//			//[����] : �ʸ������� ��������� ���� ����
		Scanner scanner = new Scanner(System.in);
//		System.out.println("�ݾ� �Է� : ");	int �ݾ� = scanner.nextInt();
//		
//		int �ʸ��� = �ݾ�/100000;
//		System.out.println("�ʸ��� : " +�ʸ���+"��");
//		�ݾ�-= �ʸ���*100000;
//		
//		int ���� = �ݾ�/10000;
//		System.out.println("���� : " +����+"��");
//		�ݾ�-= ����*10000;
//		
//		int õ�� = �ݾ� / 1000;
//		System.out.println("õ�� : "+õ��+"��");
//		�ݾ� -= õ��*1000;
//		
//		int ��� = �ݾ� / 100;
//		System.out.println("��� : "+���+"��");
//		�ݾ� -= ���*100;
//		
//		
//		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ��� [true / false]
//		System.out.println("\n7�� ������� Ȯ��");
//		System.out.println("�ϳ��� �����Է� : ");		int ����1 = scanner.nextInt();
//		System.out.println("��� : "+(����1%7==0));
//		
//		
//		//����4 : �ϳ��� ������ �Է¹޾� Ȧ������ Ȯ�� [true / false]
//		System.out.println("\nȦ������ Ȯ��");
//		System.out.println("�ϳ��� �����Է� : ");		int ����2 = scanner.nextInt();
//		System.out.println("��� : "+(����2%2==1));
//		
//		
//		//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [true / false]
//		System.out.println("\n7�ǹ�� and ¦������ Ȯ��");
//		System.out.println("\n�ϳ��� ������ �Է�");		int ����3 = scanner.nextInt();
//		System.out.println("��� : "+ (����3%7==0 && ����3%2==0));
//		
//		
//		//����6 : �ΰ��� ������ �Է¹޾� �� ū �� ��� [true, false]
//		System.out.println("\n�ΰ��� ���� �� ���� �� ū�� Ȯ��");
//		System.out.println("ù��° ���� �Է� : ");		int ����4 = scanner.nextInt();
//		System.out.println("�ι�° ���� �Է� : ");		int ����5 = scanner.nextInt();
//		System.out.println("�� ū ���� : "+(����4>����5 ? ����4 : ����5));
//		
//		
//		//����7 : �������� �Է¹޾� ������ ����ϱ�
//			// ������ ���� : ������*������*3.14
//		System.out.println("\n������ ���ϱ�");
//		System.out.println("������ �Է� : ");		int ������ = scanner.nextInt();
//		System.out.println("������ : "+(������*������*3.14));
		
		
//		//����8 : �� �Ǽ��� �Է¹޾� �� �Ǽ��� ���� ���� ���� �� %���� ���
//			// ��) 54.5   84.3 �̸�    64.285714%
//		System.out.println("\n�Ǽ� % ���ϱ�");
//		System.out.println("ù��° �Ǽ� �Է� : ");	double �Ǽ�1 = scanner.nextDouble();
//		System.out.println("�ι�° �Ǽ� �Է� : ");	double �Ǽ�2 = scanner.nextDouble();
//		
//		double ���� = (�Ǽ�1/�Ǽ�2);
//		System.out.println("�Ǽ�1�� �Ǽ�2 ����� : "+ ���� + "%");
//		System.out.println("�Ǽ�1�� �Ǽ�2 ����� : %.2f %%"+ ����);
//			// %f : �Ǽ� ǥ��
//				//%.����f : �����ڸ����� ǥ��
//		
//		
//		//����9 : ��ٸ��� ���� ���ϱ� [����, �غ� ���� �Է¹޾� ���]
//			//��ٸ��� ���� = > (���� * �غ�) * ���� / 2
//		System.out.println("\n��ٸ��� ���� ���ϱ�");
//		System.out.println("���� : ");	int ���� = scanner.nextInt();
//		System.out.println("�غ� : ");	int �غ� = scanner.nextInt();
//		System.out.println("���� : ");	int ���� = scanner.nextInt();
//		System.out.println("��ٸ��� ���� : " + ((����*�غ�)*����/2));
//		
//		
//		//����10 : Ű�� ������ �Է¹޾� ǥ��ü�� ���
//			//ǥ��ü�� ��� : (Ű-100)*0.9
//		System.out.println("\nǥ��ü�� ���ϱ�");
//		System.out.println("Ű : ");	int Ű1 = scanner.nextInt();
//		System.out.println("ǥ��ü�� : " + ((Ű1-100)*0.9));
//		
//		
//		//����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
//			//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
//		System.out.println("\nBMI ���ϱ�");
//		System.out.println("Ű : ");	int Ű2 = scanner.nextInt();
//		System.out.println("������ : ");	int ���� = scanner.nextInt();
//		System.out.printf("BMI : %.2f\n" + (����/((Ű2/100.0)*(Ű2/100.0))));
//		
//		
//		//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ� [ 1 inch -> 2.54cm ] 
//		System.out.println("\n inch=>cm ��ȯ�ϱ�");
//		System.out.println("inch �Է� : ");	int inch = scanner.nextInt();
//		System.out.println("��� : " + (inch*2.54));
		
		
//		//����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
//			//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
//			//�߰���� �ݿ����� => 30 %
//			//�⸻��� �ݿ����� => 30 %
//			//������ �ݿ����� => 40 %
//		System.out.println("\n�ݿ����� ����ϱ�");
//		System.out.println("�߰���� : ");		double �߰� = scanner.nextDouble();
//		System.out.println("�⸻��� : ");		double �⸻ = scanner.nextDouble();
//		System.out.println("������ : "); 	double ���� = scanner.nextDouble();
//		
//		�߰� *= 0.3;
//		�⸻ *= 0.3;
//		���� *= 0.4;
//		
//		System.out.printf("�ݿ����� ���� : %.2f %%\n", (�߰�+�⸻+����));
		
//		
//		//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
//			//int x = 10;
//			//int y = x-- + 5 + --x;
//			//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
//				//1. x-- + 5 => ���� ���� ���� + => 10+5
//				//2. x-- => x���� [x = 9]
//				//3. 15 + --x => x ���� ����
//				//4. 15 + 8 = 23
		
		
//		//����15 : ���̸� �Է¹޾� ���̰� 10���̻��̸� �л� , 20���̻��̸� ���� , 40���̻��̸� �߳� ���� ����ϱ�
//		System.out.println("���̸� �Է��ϼ��� : ");		int age = scanner.nextInt();
//		String ���� = age>=10 && age<20 ? "�л�" : age>=20 && age<40 ? "����" : age>=40 ? "�߳�" : "�˼�����";
//		System.out.println("���ɴ� : " + ����);
			
		
//		//����16 : 3���� ������ �Է¹޾� ������������ ����
//		System.out.println("ù��° ������ �Է� : ");		int num1 = scanner.nextInt();
//		System.out.println("�ι�° ������ �Է� : ");		int num2 = scanner.nextInt();
//		System.out.println("����° ������ �Է� : ");		int num3 = scanner.nextInt();
//		
//		int x = num1<=num2 && num1<=num3 ? num1 : num2<= num1 && num2<=num3 ? num2 : num3;
//		int z = num1>=num2 && num1>=num3 ? num1 : num2>=num2 && num2>=num3 ? num2 : num3;
//		int y = num1>x && num1<z ? num1 : num2>x && num2<z ? num2 : num3;
//		
//		System.out.println("�������� ���� : \n" + x +"\n"+y+"\n"+ z);
		
		//����17 : 4���� ������ �Է¹޾� ������������ ���� 
		System.out.println("ù��° ������ �Է� : ");		int a = scanner.nextInt();
		System.out.println("�ι�° ������ �Է� : ");		int b = scanner.nextInt();
		System.out.println("����° ������ �Է� : ");		int c = scanner.nextInt();
		System.out.println("�׹�° ������ �Է� : ");		int d = scanner.nextInt();
		
		int min = a<=b && a<=c && a<=d ? a : b<=a && b<=c && b<=d ? b : c<=a && c<=b && c<=d ? c : d;
		int max = a>=b && a>=c && a>=d ? a : b>=a && b>=c && b>=d ? b : c>=a && c>=b && c>=d ? c : d;
		
		int middle = (a+b+c+d)/4;
		
		int mid1 = min<a && a<middle && a<max ? a : min<b && b<middle && b<max ? b : min<c && c<middle && c<max ? c : d;
		int mid2 = min<a && middle<a && a<max ? a : min<b && middle<b && b<max ? b : min<c && middle<c && c<max ? c : d;
		
		System.out.println("�������� ���� : \n" + max + "\n" + mid2 + "\n" + mid1 + "\n" + min);				
		
	}//me
}//ce

package Day03;

import java.util.Scanner;

public class Day03_4 {//cs

	public static void main(String[] args) {//ms
		//��� : 1. if��		2. switch��
			//if 	: ���˻� (true / false) / ����� �� ���������� �ʴ� ���
			//switch: �����Ͱ˻� / ����� �� ������ �ִ� ���
				//������ case�� ���๮ ó�� �� ���� case �̵�
			//����
				//switch(�˻���) {
				//	case'��' : ���๮;
				//	case'��' : ���๮;
				//	case'��' : ���๮;
				//	default : ���๮;
				// }
			//break; ���� ����� switch Ȥ�� �ݺ��� Ż��[������]
		
		
		//����1 ������ 90�̸� A 80���̸� B 70���� C �׿� Ż��
		
		int ���� = 80;
		if(����==90)		System.out.println("A���");
		else if(����==80)		System.out.println("B���");
		else if(����==70)		System.out.println("C���");
		else System.out.println("Ż��");
		
		System.out.println("--------------------------");
		
		switch (����) {
		case 90: System.out.println("A���");		break;
		case 80: System.out.println("B���");		break;
		case 70: System.out.println("C���");		break;
		default: System.out.println("Ż��");		break;
		}
		
		
		//����2 
		int ��ư = 3;
		
		switch(��ư) {
		case 1 :  System.out.println("1������ �̵�");	break;
		case 2 :  System.out.println("2������ �̵�");	break;
		case 3 :  System.out.println("3������ �̵�");	break;
		case 4 :  System.out.println("4������ �̵�");	break;
		default:  System.out.println("����");	
		}
		
		
		//����3
		char ��� = 'B';
		switch(���) {
			case 'A' :
			case 'B' :  System.out.println("���ȸ��");	break;
			case 'C' :
			case 'D' :  System.out.println("�Ϲ�ȸ��");	break;
			default  : System.out.println("�մ�");
		}
		
		
		//����4
		String ���� = "����";
		
		switch(����) { // ���� �����̱� ������ .equals ��� x
			case "����" : System.out.println("700����");	break;
			case "����" : System.out.println("500����");	break;
			default : System.out.println("300����");
		}
		
		
		
		//����1 : if���� switch = ����, ����, ���� ������ �Է¹޾� ����� 90�̻��̸� A / 80�� �̻� B / ������ Ż��
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� : ");	int ko = scan.nextInt();
		System.out.println("���� : ");	int en = scan.nextInt();
		System.out.println("���� : ");	int ma = scan.nextInt();
		
		int avg = (ko+en+ma)/3;
		System.out.println("��� : "+avg);
		
		switch(avg/10) {
			case 9 :  System.out.println("A����Դϴ�"); break;
			case 8 :  System.out.println("B����Դϴ�"); break;
			default : System.out.println("Ż���ϴ�");
				
		}
		
	}//me
}//ce

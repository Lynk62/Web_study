package Day03;

public class Day03_1 {//cs

	public static void main(String[] args) {//ms
		
		//1���� : �����
		//2���� : ����, ���(����)
		//���
			//��ǻ���� �Ǵܷ��� Ű���ִ� ��� = > ����� ���� ���� �� ���
			//���ǽ��� true�� ���๮ ó��
			//����
				//1. IF( ����[true / false]) ���๮;
				//2. if( ���ǽ� ) ���๮;
				//	else ���๮ [����];
				//3. ���๮�� 2�� �̻��̸� { }�� ���� ó��
				//4. ����� ���� �ټ��� �� [������ �ټ��� ��]
				//	if(����1) { ���๮[��1];}
				//	else if (����2) {���๮[��2];}
				// 	else if (����3) {���๮[��3];}
				//	else if (����4) {���๮[��4];}
				//	else if (����5) {���๮[��5];}
				//	else { ���๮ [����];}
				//5. if ��ø
				// if(���ǽ�) {
				//		if(���ǽ�) { ���๮;}
				//	} else {
				//		if(���ǽ�) {���๮;}
				//		else {���๮;}
				//	}
		
		//����1
		if(3>1) System.out.println("3�� 1���� ũ��");
			//���࿡ 3�� 1���� ũ�� ��� / �ƴϸ� ��� x
			//true�̸� ����
		
		//����2
		if(3>5) System.out.println("3�� 5���� ũ��");
			//���࿡ 3�� 5���� ũ�� ��� / �ƴϸ� ���x
			//true�̸� ����
		
		//����3
		if(3>1) System.out.println("��3) 3�� 1���� ũ��");
		else System.out.println("��3_1) 3�� 1���� �۴�");
			//���࿡ 3�� 1���� ũ�� ��3 ���
			//�ƴϸ� (3�� 1���� ������) ��3_1 ����
		
		//����4
		if(3>2) { //ts [���๮�� 2�� �̻��� ��]
			System.out.println("True");
			System.out.println("3�� 2���� ũ��");
		}//t
		else {	//false ���๮ ����
			System.out.println("false");
			System.out.println("3�� 2���� �۴�");
		}// fe
		
		//����5
		if(3>5) System.out.println("3�� 5���� ũ��");
		else if(3>4) System.out.println("3�� 4���� ũ��");
		else if(3>3) System.out.println("3�� 3���� ũ��");
		else if(3>2) System.out.println("3�� 2���� ũ��");
		else System.out.println("true�� ����"); //����x
		// ���� ó�� 1�� ��� ��� 1��
		
		if(3>5) System.out.println("3�� 5���� ũ��");
		if(3>4) System.out.println("3�� 4���� ũ��");
		if(3>3) System.out.println("3�� 3���� ũ��");
		if(3>2) System.out.println("3�� 2���� ũ��");
		if(3<2) System.out.println("true�� ����");
		// ����ó�� ��� �ټ�
		
		
		
		
	}//me
}//ce

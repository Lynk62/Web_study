package Day01;

public class Day01_2 { // c s
// 1. ���
	/* 1. print() : ��¸� ���
	   2. printf() : ��¿� �ٹ̱�
	   3. println() : ��� �� �ٹٲ� ó�� */
	
		// ����
			// %s : ���ڿ� ���� �ڸ�
			// %d : ���� ���� �ڸ�
			// %f : �Ǽ� ���� �ڸ�
	
		// ����� [\ : ������ ��ȭ ��ȣ]
			// \n : �ٹٲ�
			// \t : �鿩���� 5ĭ
			// \\ : \
			// \" : "
	
// 1. System : �ý��� Ŭ���� [����� ���� ������� �ڵ� ����]
// 2. out : ��� ��Ʈ��
// 3. print() : ����Լ�
// 4. ; : ���� �ڵ� ���˸�
	
// �ý��� Ŭ������ out �̶�� ��� ��Ʈ���� ���� print �Լ��� ����ؼ� console�� ���ϴ� ��� ����� �� �ִ�.
	
	public static void main(String[] args) { // m s
	 
		//1. �⺻���
		System.out.print("�ƹ���"); 		// ; : �ڵ� ���� ����
		System.out.print("java 1����");	// ���� "" ó��
		System.out.print(123);			// ���� "" ó�� x = ��ǻ�ʹ� ���ڿ� �� ģ��
			// �̸� ������� �ܾ� [�����]�� ������ ��� ���ڴ� "" ó��
		
		// 2. �ڵ��ϼ� (syso + ctrl + �����̽���)
		System.out.println("�ڹٴ� ��ü����");
		System.out.println("jdk8");
		System.out.println(123);
		
		//3. ���� ���
		System.out.printf("%s", " �ϰ������");
		System.out.printf("�ڹ� %d����", 1);
		System.out.printf("%d",123);
		
		// ����1 [�⼮��]
		System.out.println("\n\n\t\t[[�⼮��]]");
		System.out.println("------------------------------------");
		System.out.println("�� ��\t1����\t2����\t3����\t���");
		System.out.println("��ȣ��\t�� ��\t�� ��\t�� ��\t");
		System.out.println("���缮\t�� ��\t�� ��\t�� ��\t");
		System.out.println("------------------------------------");
		
		
		// ����2 [����1 => printf]
		System.out.printf("\n\t\t%s" , "[[�⼮��]]\n");
		System.out.printf("------------------------------------\n");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n", "�� ��", "1����", "2����", "3����", "���");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n", "��ȣ��", "�� ��", "�� ��", "�� ��", " ");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n", "���缮", "�� ��", "�� ��", "�� ��", " ");
		System.out.printf("------------------------------------\n");
		
		
		//����1 : �����
		System.out.println(" \\   /\\");
		System.out.println("  ) ( ')");
		System.out.println(" (  /  )");
		System.out.println("  \\(__)|");
		System.out.println("");
		
		//����2 : ������
		System.out.println("|\\_/|"); // \��½� => \\
		System.out.println("|q p|    /)");
		System.out.println("( 0 )\"\"\"\\"); // "��½� => \"
		System.out.println("|\"^\"'");
		System.out.println("||_/=\\\\__|");
		
	} // m e
	
	
} // c e

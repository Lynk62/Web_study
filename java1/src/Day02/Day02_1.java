// Ȯ����� ctrl+shift+[+/-]
// �׸�, ��Ʈ���� ����
// �ּ�ó�� [�ڵ� ����]

package Day02; //��Ű�� �̸�

public class Day02_1 { //c s
	//1. ��� �ڵ� �ۼ��� Ŭ���� { } �ȿ��� �ۼ�
	//2. ������ �ڵ�� main �Լ� { } �ȿ��� �ۼ� [������ : �ڵ带 �о��ִ� ����]
	//3. �ڵ��ϼ� : 1~3���ڱ��� �Է� �� ctrl + space => enter
	//4. { } �ȿ��� tab[�鿩����]
	
	// �޸� : ��ǻ�� �����ϴ� ���� [RAM] : �ڿ�
	
	//����
		//1. ������ 1�� �����ϴ� �޸� ���� [���� ����]
		//2. ���� ���� 	[�ڷ���	������;]
		//3. ���� �ʱ�ȭ(ó����) [�ڷ��� ������ = ������;]
		//4. ���� ȣ�� [������]
	
	//�뷮 ����
		// 0,1 => 1��Ʈ
		// 01010101 = 8��Ʈ => 1����Ʈ
		// 1024 => KB => 1024KB => 1MB => 1024MB => 1GB
	
	// �ڷ���
		//1. �޸𸮸� �Ʋ����� [ȿ����]
			// boolean 	: 1��Ʈ		: ��(true), ����(false)
			// char 	: 2����Ʈ	: ���� 1�� [ �ƽ�Ű�ڵ�(c���) / �����ڵ�(�ڹ�)]
			// byte 	: 1����Ʈ	: ���� +-128
			// short 	: 2����Ʈ	: ���� +-3������
			// int 		: 4����Ʈ	: ���� +-20������
			// long 	: 8����Ʈ	: ���� +-20���̻�
			// float 	: 4����Ʈ	: �Ǽ�(�Ҽ���) 8�ڸ� ǥ������
			// double	: 8����Ʈ	: �Ǽ�(�Ҽ���) 18�ڸ� ǥ������
	
	public static void main(String[] args) {//m s
		
		//p.35 ����1
		
		int value = 10;				// 1. ���� ����� �ʱ�ȭ
		// int : +-20�� ������ �����͸� ������ �� �ִ� ����
			// value[�ƹ��ų�] : ������ �̸� ( �����ڰ� �����ϱ� ���� )
				// = : ������ �����Ͱ� �������� ����
		//* ���� 10�� int�� value ������ ����
		
		
		int result = value + 10;
		// int : +-20�� ������ �����͸� ������ �� �ִ� ����
			// result[�ƹ��ų�] : ���� �̸�
				// ����ȣ��(�����ҷ�����) + 10
				// 10 + 10 = 20 <= result
		
		System.out.println(result);
		
	}//m e
} //c e
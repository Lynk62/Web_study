package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 {//cs

	public static void main(String[] args) {//ms
		/*���������� ����
		 * 1. ����ڿ��� ����[0] / ����[1] / ��[2] / ����[4]�߿� �Է¹ޱ�
		 * 2.��ǻ�� ���� �߻� [0~2]
		 * 3. ����� ��ǻ�� �� �¸��� �Ǵ� [����Ǽ�]
		 * 4. 3�� �����ϱ� ������ ���� ����
		 * 5. 3�� ���ý� ���� ����
		 * 	- �� ���� �� ���
		 * 	- ���� �¸���*/
		
		//���� �غ�
		int p; 				//����ڰ� ������ �� ����
		int com;					//��ǻ�Ͱ� ������ ������ �� ����
		int term = 0;					//�� ���������� ���� Ƚ��
		int pvic = 0;	int cvic = 0;	//�� �¸� ��
		
		//�Է°�ü
		Scanner scan = new Scanner(System.in);
		
		//���α׷� ����
		while(true) {  // ���α׷� ����[���ѷ��� �������� : 3���Է½� ����(break)]
			System.out.println("--------------[[���������� ����]]---------------");
			System.out.println("����(0)    ����(1)    ��(2)    ����(3)");
			System.out.println(">>>>>>>���� : "); 	p = scan.nextInt(); //�Է��� �� ����
			
			Random random = new Random(); 	//���� ��ü ����
				
			//random.nextInt() : int�� ǥ���� �� �ִ� ������ ���� �߻�
				//random.nextInt(��) : 0 ~ �� ������ ������ ���� �߻�
					//random.nextInt(10) : 0 ~ 9 �� ������ ���� �߻�
					//random.nextInt(11)+10 : 0 ~ 20 ������ ������ ���� �߻�
			com = random.nextInt(3);		//������ ����(int��)���� ��������
			
			//��������
			if(p==3) {
				System.err.println("�˸�)) ��������");
				System.out.println("�� ���� �� : "+term);
				
				if(pvic>cvic)	{
					System.err.println("���� �¸��� : �÷��̾�");
				}
				else if(pvic<cvic) {
					System.out.println("���� �¸��� : ��ǻ��");
				}
				else if(pvic>0 && cvic>0 && pvic==cvic) {
					System.out.println("���� �¸��� : ���º�");
				}
				else {
					System.out.println("���� �¸��� : ����");
				}
				break;
			}//�������� end
			
			else if(p>=0 && p<=2){  //�����Է�
				//�¸��� �Ǵ�
				if((p==0 && com==2) || (p==1 && com==0) || (p==2 && com==1)) {  //�÷��̾� �¸� ����� �� [0=>2 / 1=>0 / 2=>1]
					//�÷��̾ �̱�� ����� ���� 3����
					System.err.println(">> �÷��̾� �¸�! <<");
					pvic++;  // �÷��̾� �¸� �� ����
				}//�¸� end
				
				else if((p==0 && com==0) || (p==1 && com==1) || (p==2 && com==2)) {  // ���� ����� ��
					System.err.println(">> �����ϴ�! <<");
				}//���� end
				
				else {  //�׿ܴ� ��ǻ�� �¸�
					System.err.println(">> ��ǻ�� �¸�! <<");
					cvic++;
				}//���� end
				//���Ӽ� ����
				term++;
			} // ������� end
			
			else {
				System.err.println("�˸�))�� �� ���� �ൿ�Դϴ�");//
			} //���� end
		}//while1 end
		
	}//me
}//ce

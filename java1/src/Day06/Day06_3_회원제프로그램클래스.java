package Day06;

import java.util.Scanner;

public class Day06_3_ȸ�������α׷�Ŭ���� {//cs
	public static void main(String[] args) {//ms
		/*ȸ���� ���α׷� [Ŭ��������]
		 * 0. ȸ�� ���� = ȸ�� Ŭ���� �����
		 * 		1. �ʵ�
		 * 			= ���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ
		 * 1. �ʱ�޴� [1.ȸ������ / 2.�α��� / 3.���̵� ã�� / 4.��й�ȣ ã��]
		 * 		1. ȸ�����Խ� �Է¹޾� ����
		 * 		2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���
		 * 		3. ���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ���
		 * 		4. ��й�ȣ ã��� ���̵�� ��ȭ��ȣ�� �����ϸ� ��й�ȣ �˷��ֱ�
		 */
		
		//���� �����ϴ� ���� : main �޼ҵ� ��� ������ ����ϱ� ���ؼ�
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100];
		//Member Ŭ������ ������� ��ü (id, password, name, phone) 100�� ������ �� �ִ� �迭 ���� = 400��
		//���࿡ Ŭ������ ������ ��쿡��
			//String[][] memberlist = new Member[100][4];
		
		
		while(true) {  // ���α׷� ���� ���ѷ��� [�������� x]
			System.out.println("---------------[[ ȸ���� (Ŭ��������) ]]--------------");
			System.out.println("1.ȸ������    2.�α���    3.���̵� ã��    4.��й�ȣ ã��");
			System.out.println("���� : ");		int ch = scanner.nextInt();
			
			if(ch==1) {	//ȸ������
				//1. id, password, name, phone �Է¹ޱ� = ����4��
				System.out.println("--------------------------------------------");
				System.out.println("���̵� : ");		String id = scanner.next();
				System.out.println("��й�ȣ : ");		String password = scanner.next();
				System.out.println("�̸� : ");		String name = scanner.next();
				System.out.println("����ó : ");		String phone = scanner.next();
				
				//2. ��ü ����
				Member member = new Member();
							
				//3. �Է¹��� ���� 4�� ��ü �� �ʵ忡 ����
					//��ü �� �ʵ� = �Է¹��� ��
				member.id 		= id;
				member.password = password;
				member.name 	= name;
				member.phone 	= phone;
				
				//���̵� �ߺ�üũ
					//1. �迭 �� ��ü �� �Է��� ���̵�� ������ ���̵� ã��
				boolean idcheck = false;
				
				for(Member temp : memberlist) {
					// memberlist �迭 �� ��ü���� �ϳ��� temp�� ����
					if(temp!=null && temp.id.equals(id)) {
						//���࿡ �ش� ��ü �� id�� �Է¹��� id�� ������
						System.out.println("�˸� )) ������� ���̵� �Դϴ�.");
						idcheck = true;
						break;
					}//if end
				}//���̵� �ߺ�üũ for end
				
				//���̵� �ߺ��� ���� ��� ����
				if(idcheck==false) {
				//4. ������ ��ü�� �����ϴ� �迭�� ����
					//1. ������ �ε��� ã�� [ ���� �ƴϸ� ����ȸ���� ���� ]
					int i=0;//�ε��� ��ġ ����
					for(Member temp : memberlist) {	//�迭/����Ʈ �� ��� ��ü ȣ��
						//memberlist �迭�� member ��ü �ϳ��� �����ͼ� temp ���� �ݺ�
						
						//2. ���� �ε������� ��ü ����
						if(temp==null) { //���࿡ �ش� ��ü�� �����̸�
							memberlist[i] = member; //�ش� �ε����� ���� ������� ��ü ����
							System.out.println("�˸�)) ȸ������ ����!");
							break;	//for ������ [�� ������ ��� ���鿡 ������ ��ü ����Ǳ� ����]
						}//����ã�� if end
						i++;//�ε��� ����
					}//����ã�� for end
				}//���̵� �ߺ� ���� ��� if end
			}//ch==1 ȸ������ if end
			
			else if(ch==2) {  //�α���
				//1.�Է¹ޱ�
				System.out.println("------------ �α��� ������ ---------------");
				System.out.println("���̵� : ");		String loginid = scanner.next();
				System.out.println("��й�ȣ : ");		String loginpassword = scanner.next();
				
				//2.���� �迭[ȸ������Ʈ] �� �Է¹��� ���� ��
				boolean logincheck = false;		//true : �α��� ���� / false : �α��� ���н� ��� ����
				
				for(Member temp : memberlist) {
					//memberlist�� 0�� �ε������� �� �ε������� �ϳ��� temp�� ����
					
					if(temp!=null && temp.id.equals(loginid) && temp.password.equals(loginpassword)) {
						//��ü�� null�϶��� equals�Ұ� 
						System.out.println(" �˸�)) �α��� ����!");
						logincheck = true;
					}//�α��μ��� if end
				}//���̵� ��� �� for end
				
				//3.�α��� ����
				if(logincheck==false) {
					System.out.println("�˸�)) ������ ȸ�������� �����ϴ�.");
				}//�α��ο��� if end
			}//ch==2 �α��� if end
			
			else if(ch==3) {  //���̵�ã��
				System.out.println("--------- ���̵� ã�� ---------");
				//1.�̸��� ����ó �Է� ����
				System.out.println("�̸� : ");		String name = scanner.next();
				System.out.println("����ó : ");		String phone = scanner.next();
				
				//2.�迭 �� ������ �̸��� ����ó�� �ִ��� Ȯ��
				boolean findcheck = false;
				
				for(Member temp : memberlist) {
					if(temp!=null && temp.name.equals(name) && temp.phone.equals(phone)) {
						//3.������ ��ü�� ������ �ش� ���̵� ���
						System.out.println("���̵� ã�� ����!");
						System.out.println("ȸ������ ���̵� : " + temp.id);
						findcheck = true;
						break;
					}//if end
					
				}//���� �̸�����ó Ȯ�� for end
				
				//4.������ ���ٰ� ���
				if(findcheck==false) {
					System.out.println("�˸�)) ȸ�������� �����ϴ�");
				}//if end
			}//c1==3 if end
			
			else if(ch==4) {  //��й�ȣ ã��
				System.out.println("���̵� : ");		String id = scanner.next();
				System.out.println("����ó : ");		String phone = scanner.next();
				
				boolean findcheck = false;
				
				for(Member temp : memberlist) {
					if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
						System.out.println("�˸� )) ��й�ȣ ã�� ����");
						System.out.println("ȸ�� ��й�ȣ : " + temp.password);
						findcheck = true;
						break;
					}
				}
				
				if(findcheck == false) {
					System.out.println("�˸�)) ������ ȸ�������� �����ϴ�");
				}
				
			}//ch==4 if end
			
			else {System.out.println("�˸�)) �� �� ���� ��ȣ�Դϴ�");}//�˼����� else end
			
		}//���α׷� ���� while end
		
	}//me
}//ce

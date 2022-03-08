package Day06;

import java.util.Scanner;

public class Day06_6_��ȸ�����Խ��� {//cs
	/*�Խ��� [Ŭ����]
	 * 0. �Խù� ���� = Ŭ����
	 * 		-�ʵ� : ����, ����, �ۼ���, ��й�ȣ
	 * 		-������ : ������� ����
	 * 
	 * 1. ù ȭ�� [��� �Խù� (��ȣ, �ۼ���, ����) ���]
	 * 2. �޴� [1.�۾��� / 2.�ۺ��� ]
	 * 		1.�۾��� [����, ����, �ۼ���, ��й�ȣ] = 4������ = ��üȭ
	 * 		2.�ۺ��� [�ش� �۹�ȣ�� �Է¹޾� �ش� �� ��������(��ȣ, �ۼ���, ����, ����)ǥ��]
	 * 			- �۹�ȣ�� �迭�� ����Ǵ� ���� [�ε���]
	 * 			- �ۺ��� �޴�
	 * 3. �ۺ��� �޴� [1. ��Ϻ��� / 2. ���� / 3.����]
	 * 		1. ���� : �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����
	 * 		2. ���� : �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����� ���븸 ����*/
	
	
	public static void main(String[] args) {//ms
		
		//�غ� [��� {}�ȿ��� ���Ǵ� ���� ����]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
			// Board ��ü�� 100�� ������ �� �ִ� 1���� �迭
		
		//���α׷� ����
		while(true) {	//���ѷ��� [�������� : x]
			
			System.out.println("------[[ Ŀ�´�Ƽ ]]------");
		
////////////////////////////////////////////////  ���Խù� ��ȸ  ////////////////////////////////////////////
			
			//��� �Խù� ��ȸ
			System.out.println("��ȣ\t�ۼ���\t����");
			int index = 0;
			//�迭�� ��� ��ü(�Խù�) ��� �ݺ���
			for(Board temp : boardlist) {
				
				if(temp != null) {
					//���࿡ �ش� board ��ü�� ���빰�� ������ ���
				System.out.printf("%d\t%s\t%s\n", index, temp.writer, temp.title);
				}//���빰�� ������ ��� if end
				
				index++;	//�ε��� ����
			}//��� �Խù� ��ȸ for end
			
    ////////////////////////////////////////////////////////////////////////////////////////////////
			
			System.out.println("1.�۾���    2. �ۺ���");
			System.out.println(">> ���� : ");		int ch = scanner.nextInt();

	//---------------------------------  1. �۾���  --------------------------------------------------
			
			if(ch==1) {	//1. �۾���
				//1. 4�� ������ �Է¹޴´�
				System.out.println("-------- �۾��� ������ ---------");
				System.out.println("title : ");			String title = scanner.next();
				System.out.println("content : ");		String content = scanner.next();
				System.out.println("writer : ");		String writer = scanner.next();
				System.out.println("password : ");		String password = scanner.next();
				
				//2. 4�� ������ ��üȭ [��ü�� ���� 4�������� ��ü�� �ʵ忡 ����]
				Board board = new Board(title, content, writer, password);
							//4�� �ʵ带 ���� ������ ���
				
				//3. �迭�� ������� ã�Ƽ� ������� ��ü ����
				int i=0;
				for(Board temp : boardlist) {
					if(temp==null) {
						boardlist[i] = board; //�ش� �ε����� ���ο� ��ü ����
						break;	//�ѹ� ���������� �ݺ��� ����
					} //temp==null if end
					i++;
				}//�����ã�� for end
			}//1.�۾��� if end
			
	//-------------------------------------- �۾��� end / 2. �ۺ���   ------------------------------------------------
			
			else if(ch==2) {	//2. �ۺ���
				//1. �۹�ȣ �Է� �޴´�
				System.out.println("�Խñ� ��ȣ(�ε���) �Է� : ");		int bno = scanner.nextInt(); //�� �Խù��� �ε��� ��ȣ
				
				//2. �ش� ��ȣ �Խñ� ���
				System.out.println("------------------------------�Խù� ��������----------------");
				//�ݺ��� ��� ����x = ����� ��ġ[�ε���] �Է� �޾ұ� ������
				System.out.printf("�ۼ���: %s  ���� : %s\n", boardlist[bno].writer, boardlist[bno].title);
				System.out.printf("���� : %s\n", boardlist[bno].content);
				System.out.println("----------------------------------------------------------");
				System.out.println("1.��Ϻ���(�ڷΰ���)    2.�ۻ���    3.�ۼ��� \n>>���� : ");
				
				
				int ch2 = scanner.nextInt();
				
				if(ch2==1) {/*�ݺ����� ���� ������ ���� �� ����*/}//1.��Ϻ��� if end
	
	//-------------------------------------- �ۺ��� end / 2. �ۻ���   ------------------------------------------------
				
				else if(ch2==2) {
					//1. ��й�ȣ �Է¹ޱ�
					System.out.println("�˸�)) �� �Խù� ��й�ȣ : ");	String password = scanner.next();
					//�ݺ���x = ������ �ε��� ��ġ�� �Է¹޾ұ� ������ [�˻� x]
					if(boardlist[bno].password.equals(password)) { //�Խù���ü�� ��й�ȣ == �Է��� ��й�ȣ
						System.out.println("�˸�)) ���� ����!!");
						boardlist[bno] = null;	//�ش� �Խù��� null�� ���� // ����ó��
						
							//�����Ŀ� ������ �ε��� �ڷ� ��ĭ�� ������ �̵�
							//��?? ���࿡ �ش��ڵ尡 ���� ��� �迭�� ���̻��� ���� �߻�
						for(int i=bno; i<boardlist.length; i++) {
										//�迭���� = 100  �ε��� 0 ~ 99
							if(i == boardlist.length-1) boardlist[ boardlist.length-1 ] = null;
							//�˻��� �Խù��� �ε������� ������ �ε������� 1�� ����
							//i�� ������ �ε����̸� ������ �ε������� null ����
							
							else boardlist[i] = boardlist[i+1]; //������ �Խù� ���� �Խù�
								//���࿡ 2�� �ε��� ������
								//2���ε��� = 3���ε��� / 3���ε��� = 4���ε��� ~~ / 98�ε��� = 99�ε���
								//99�ε��� = null [100�� �ε����� ���� ������]
						}//for end
					}//if end
					
					else {
						System.out.println("�˸�)) ��й�ȣ�� �ٸ��ϴ� [��������]");
					}
					
				}//2.�ۻ��� if end
				
	//-------------------------------------- �ۻ��� end / 3. �ۼ���   ------------------------------------------------
				
				else if(ch2==3) {
					//1.��й�ȣ �Է¹ޱ�
					System.out.println("�˸�)) �� �Խù� ��й�ȣ : ");	String password = scanner.next();
					
					//2. bno ���Խù� (�����ִ°Խù�)�� �ε��� ��ü�� ��й�ȣ�� �Է¹��� ��й�ȣ �����ϸ�
					if(boardlist[bno].password.equals(password)) {
						//�ش� �Խù��� ����� ������ ���� �Է¹޾� �� �Խù���ü �� ����� ���뿡 ����
						System.out.println("������ ���� : ");		boardlist[bno].title = scanner.next();
						System.out.println("������ ���� : ");		boardlist[bno].content = scanner.next();
																//�ش� �Խù��� ����� ������ ���� �Է¹ޱ�
						System.out.println("�˸�)) ������ �����Ǿ����ϴ�");
					}//if end
					
					else {System.out.println("�˸�)) ��й�ȣ�� �ٸ��ϴ� [��������]");}
				}//3.�ۼ��� if end
	
	//-------------------------------------- �ۻ��� end / �ۼ���   ------------------------------------------------
			}//2.�ۺ��� if end 
			
			else{}//�˼����� else end
			
		}//���α׷� ���� while end
		
	}//me
}//ce

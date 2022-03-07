package Day05;

import java.util.Scanner;

public class Day05_2_�湮�� {//cs

	public static void main(String[] args) {//ms
		
		/*ȸ���� �湮�� ���α׷�
		 * 1. �ʱ�޴� [1. ȸ������ / 2. �α��� ]
		 * 	- ȸ������ [���̵�, ��й�ȣ, �̸�]
		 * 	- �α��� [���̵�, ��й�ȣ �����ϸ� �α���ó��]
		 * 
		 * 2. �α��ν� �޴� [ 1. �湮�Ͼ��� / 2. �α׾ƿ�]
		 * 	- �湮�Ͼ��� [����, ����, �ۼ���(�α��ε� ���̵�)]
			- �α׾ƿ� [�ʱ�޴��� ���ư���]*/
		
	//1. �غ�
		Scanner scan = new Scanner(System.in);
		//ȸ�� 100�� [id, pw, name] �����ϴ� �迭
		String[][] memberlist = new String[100][3];	//100�� 3�� = ȸ���� 1�� [1��=id][2��=pw][3��=name]
		//�湮�� 100�� [title, contents, writer] �����ϴ� �迭
		String[][] boardlist = new String[100][3];	//100�� 3�� = �Խñ۴� 1��
		
	//2. �ʱ�޴�
		while(true) {//���ѷ��� [�������� : X]
			
			System.out.println("------[[ ȸ���� �湮�� ]]-------");
			System.out.println("-----------------------------");
			System.out.println("1.ȸ������    2.�α���\n>>>���� : ");	int ch = scan.nextInt();
			
			if(ch==1) {
				System.out.println("-----<< ȸ�� ���� >>-----");
				System.out.println("Member ID : ");			String id = scan.next();
				System.out.println("Member Password : ");	String pw = scan.next();
				System.out.println("Member Name : ");		String name = scan.next();
				//String 3�� ���� �Է¹޾� memberlist 2���� �迭�� ����
					
					//1. �� ����[����=0 / �Ǽ�=0.0 / ��ü(���ڿ�)=null]�� ã�Ƽ� ���� [���࿡ ������� ������ ȸ�� 100�ʰ�]
					//2. ���̵� �ߺ�üũ
				
				//���̵� �ߺ�üũ [���� ȸ���� id�� �����ϸ� ȸ������ �Ұ�]
				boolean idcheck = true;
				
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						// ==null : ȸ��x / !=null : ȸ��o
						System.err.println("������ ���̵� �����մϴ�");
						idcheck = false; //����x
						break;
					}//if end
				}//���̵� �ߺ�üũ for end
				
				
				//���̵�, ��й�ȣ, �̸� ����κ�
					if(idcheck) {//idcheck�� true�� ��쿡�� ȸ������ ó��
						for(int i=0; i<memberlist.length; i++) {
							if(memberlist[i][0]==null) {	//i���� �࿡ id�� ������ = ������̸� ����
						
								memberlist[i][0] = id;
								memberlist[i][1] = pw;
								memberlist[i][2] = name;
								//i��° �� ���� ������ ����
						
								System.err.println("[�˸�] ȸ������ �Ϸ�!");
								break;	//���������� ��! [1���� �����ؾ��ϱ� ����]
							}//if end
						}//for end
					}//idcheck if end
				}//ch==1 if end
			
			//�α���
			else if(ch==2) {
				System.out.println("-----<< �� �� �� �� �� ��>>-----");
				System.out.println("Member ID : ");			String id = scan.next();
				System.out.println("Member Password : ");	String pw = scan.next();
				
				boolean logincheck = false; // �α��� ���� �ʱⰪ
				for(int i=0; i<memberlist.length; i++) {//�迭�� �����Ͱ� �Է¹��� id�� pw�� �����ϸ� �α��� ó��
					
					if(memberlist[i][0]!=null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) {
						//i��° �࿡ id�� pw�� �Է¹��� ���� equals ������ �α��� ����!
							//null�� ��ü�� �ƴϱ� ������ equals�� �Ұ��� >> ==
						System.err.println("�α��� ����!");
						logincheck = true;
	
						/////////////////////////////////////////////////////////////////////////////////////////////////////////
						while(true) {	// �α��ν� �޴� ���� ���� [�������� : �α׾ƿ�]
							System.out.println("--------------------------------");
							System.out.println("-----------[[ �湮�� ]]----------");
							System.out.println("��ȣ\t�ۼ���\t����\t����");
							
							//��� �湮�� ���
							for(int j=0; j<boardlist.length; j++) {
								if(boardlist[j][0] != null) {	//�Խù��� ���� �ε����� ����
								System.out.printf("%d\t%s\t%s\t%s\n", i, memberlist[j][2], memberlist[j][0], memberlist[j][1] );
								}//if end
							}//�湮�� ��� for end
							
							System.out.println("1.�湮�ϳ����     2. �α׾ƿ� \n\n>>>���� : ");	int ch2 = scan.nextInt();
							
							//1. �۾��� ����
							if(ch2==1) {
								System.out.println("-------�۾���--------");
								System.out.println("title : "); 	String title = scan.next();
								System.out.println("content : ");	String content = scan.next();
								
								//�迭�� ���� ã�Ƽ� ����
								for(int j=0; j<boardlist.length; j++) {
									if(boardlist[j][0] == null) {//j���� �ε��� �Խù��� �����̸�
										boardlist[j][0] = title;
										boardlist[j][1] = content;
										boardlist[j][2] = id;	//�α��ν� ���� id�� ����
										System.out.println("�湮���� �ۼ��Ǿ����ϴ�.");
										break;
									}//if end
								}//for end
							}//ch1==1 if end
							
							//2. �α׾ƿ� ����
							else if(ch2==2){
								System.out.println("�˸�]] �α׾ƿ�");
								break;  //���� ����� �ݺ��� Ż��
							}//ch2==2 if end
							
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
							
							//3. �˼����� ��ȣ
							else {
								System.err.println("�˸� )) �� �� ���� ��ȣ�Դϴ�.\n");
								}//else end
						}//ȸ���޴� while end
						
					}//�α��� ���� if end
				}//for end
				
				//�α��� ���н�
				if(logincheck == false) System.err.println("ȸ�������� ���ų� �ٸ��ϴ�");
			
			}//ch==2 if end
			
			else {
				System.err.println("�˸� )) �� �� ���� ��ȣ�Դϴ�.\n");
			}//else end
			
			
		}//�ʱ�޴� while end
	}//me
}//ce

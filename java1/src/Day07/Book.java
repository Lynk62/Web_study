package Day07;

public class Book {
	//Ŭ���� ����
	//1.�ʵ�
		String ISBN;		//ISBN [������ȣ = �ĺ��� ]
		String bname;		//������
		String bwriter;		//�۰�
		boolean brental;	//�����뿩����
		String mid;			//�뿩�� ID
	
		
	//2.������
		//1.�� ������[�⺻������] : �޼ҵ�ȣ��� (ctrl + spacebar)
		public Book() {}
		
		//2.Ǯ������[����ʵ�޴»�����] : �������
		public Book(String ISBN, String bname, String bwriter, boolean brental, String mid) {
			this.ISBN = ISBN;
			this.bname = bname;
			this.bwriter = bwriter;
			this.brental = brental;
			this.mid = mid;
		}
		
		
	//3.�޼ҵ�
		//1.�����˻�
		void �����˻�() {
			System.out.println("--------------[[ �����˻� ������ ]]-----------------");
		}//�����˻�void end
		
		
		
		//2.�������
		void �������() {
			System.out.println("--------------[[ ������� ������ ]]-----------------");
			System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
			
			for(Book temp : Day07_5_BookAplication.books) {
				if(temp != null) {	//������ �����ϸ�
					if(temp.brental) {	//�ش絵���� �����뿩���ΰ� true��
						System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "�뿩����");
					}//if end
					
					else {	//�ش� ���� �뿩���ΰ� false��
						System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "�뿩��");
						}//else end
				}//if end
			}//for end
			
		}//�������void end
		
		
		//3.�����뿩
		void �����뿩(String loginid) {
			System.out.println("--------------[[ �����뿩 ������ ]]-----------------");
			System.out.println("�뿩�� ���� ISBN : ");		String ISBN = Day07_5_BookAplication.scanner.next();
			
	
			for(Book temp : Day07_5_BookAplication.books) {
				if(temp != null && temp.ISBN.equals(ISBN)) {
					if(temp.brental) {
						System.out.println("�˸�)) �ش� ������ �뿩�մϴ�!");
						temp.brental = false;
						temp.mid = loginid;
						return;
					}//if end 
					else {
						System.out.println("�˸�)) �̹� �뿩�� �����Դϴ�");
						return;
					}//�뿩�Ұ��� else end
				}//if end
			}//for end
		}//�����뿩void end
		
		
		//4.�����ݳ�
		void �����ݳ�(String loginid) {
			System.out.println("--------------[[ �����ݳ� ������ ]]-----------------");
			�����뿩���(loginid);
			System.out.println("���� ISBN");	String ISBN = Day07_5_BookAplication.scanner.next();
			
			for(Book temp : Day07_5_BookAplication.books) {
				if(temp != null && temp.ISBN.equals(ISBN)) {
					if(temp.mid.equals(loginid)) {
						if(temp.brental) {	//�뿩���� �ƴϸ�
							System.out.println("�˸�)) ���� ������ �뿩���� �ƴմϴ�");
						}//�뿩������ �ƴ��� if end
						
						else {	//�뿩���̸�
							System.out.println("�˸�)) �ݳ� �Ϸ�");
							temp.brental = true;
							temp.mid = null;
							return;
						}//�뿩�������ƴ��� else end
					}//�뿩���� ���� if end
					else {
						System.out.println("�˸�)) ȸ������ �뿩�� ������ �ƴմϴ�");
					}//�뿩�����ƴ� else end
				}//isbn�� ��ġ�ϴٸ� if end
			}//for end
		}//�����ݳ�void end
			
			//���� �α��� �� ȸ���� �뿩���� ���� ��� [�� ���� �뿩���]
			void �����뿩���(String loginid) {
				System.out.println("--------------[[ ������� ������ ]]-----------------");
				System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
				for(Book temp : Day07_5_BookAplication.books) {
					if(temp != null && temp.mid.equals(loginid)) {	//������ �����ϸ�
						//������ �����ϸ鼭 �뿩id�� ���� �α��ε� id�� ������
						System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "�뿩��");
					}//if end
				}//for end
			}//�����뿩���void end
	
		
		
		
		
		
		//5.�������
		void �������() {
			System.out.println("--------------{{ ������� ������ }}-----------------");
			
			//1.�Է¹ޱ�
			System.out.println("ISBN : ");	String ISBN = 	 Day07_5_BookAplication.scanner.next();
			System.out.println("������ : ");	String bname = 	 Day07_5_BookAplication.scanner.next();
			System.out.println("�۰��� : ");	String bwriter = Day07_5_BookAplication.scanner.next();
			
			//ISBN �ߺ�üũ
			for(Book temp : Day07_5_BookAplication.books) {
				if(temp != null && temp.ISBN.equals(ISBN)) {
					System.out.println("�˸� )) ���� ������� ISBN�Դϴ� [��Ͻ���]");
					return;//������� �޼ҵ� ���� (��� ����)
				}//if end
			}//for end
			
			//2. ��üȭ [�ʱⰪ = �����뿩���� = true / �뿩ȸ��id = null]
			Book book = new Book(ISBN, bname, bwriter, true, null);
			
			//3. �迭����[�ֱ�]
			int i = 0;
			for(Book temp : Day07_5_BookAplication.books) {
				if(temp == null) {
					Day07_5_BookAplication.books[i] = book;
					System.out.println("�˸�)) ���� ����� �Ϸ�Ǿ����ϴ�!");
					return;
				}//if end
				i++;	//�ε�������
			}//for end
		
		}//�������void end
		
		
		
		//6.��������
		void ��������() {
			System.out.println("--------------{{ �������� ������ }}-----------------");
		}//��������void end
	

}

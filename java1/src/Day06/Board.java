package Day06;

public class Board {

	//Board Ŭ���� ����
		//main�޼ҵ�x
	
	//1.�ʵ�
	String title;
	String content;
	String writer;
	String password;
	
	
	//2.������
		//�ڵ� : ������ ���콺 Ŭ�� source
	
		//1. �������
	Board(){}
	
		//2. 1�� �ʵ� �޴� ������
	Board(String title){
		this.title = title;
		//this.�ʵ�� = ���κ���
		//�ܺηκ��� ���� ������ ���κ����� ����
	}
	
		//3. 2�� �ʵ� �޴� ������
	Board(String title, String content){
		this.title = title;
		this.content = content;
	}
	
		//4. 3�� �ʵ� �޴� ������
	Board(String title, String content, String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
		
		//5. 4�� �ʵ� �޴� ������
	Board(String title, String content, String writer, String password){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
	}
	
	
	//3.�޼ҵ�
}

package Day09;

import java.util.Random;

public class ������Ʈ�ѷ� {// cs
	//�ش� Ŭ������ ���� ���� ��Ʈ�ѷ�
	//M : �� [������]
	//V : �� [�����]
	//C : ��[M]�� ��[V] ���� ����
	
	//�信�� ��û�ϴ� ����[���] ����
		//1.���»��� [c]
	public String ���»���(String ��й�ȣ, String ������, int �����ȣ) {
		
		//1.��ü �Է¹��� ���� ������[�μ�]
		String ���¹�ȣ = null;	//���� [���� : while �ȿ��� ����� while �ȿ��� ��밡��]
		while(true) {	//���ѷ��� [�������� : ������ �ߺ��� �������]
			//���¹�ȣ �ڵ�����
			Random random = new Random();	// ����
			
			//4�ڸ� ����
			int ���� = random.nextInt(10000);	//0 ~ 9999����
			���¹�ȣ = String.format("%04d", ����);
							//�������� ����
								//%d ����
								//%4d ���� 4�ڸ� [���� �ڸ��� ������ ����ó��]
									// 15 = 15
								//%04d ���� 4�ڸ� [���� �ڸ��� ������ 0ó��]
									//15 = 0015
		
		//�ߺ�üũ
			boolean ���¹�ȣ�ߺ� = false;
			for(���� temp2 : Day09_06_����������α׷�.���¸���Ʈ) {
				if(temp2.get���¹�ȣ().equals(���¹�ȣ)) {	//���� �迭�� ���¹�ȣ�� ����
					���¹�ȣ�ߺ� = true;
				}
			}
			//a�����ߺ��� ������
			if(���¹�ȣ�ߺ� == false) break;
		}	
		
		//2.��üȭ [�ټ��� ������ �ϳ��� ��ü�� �����]
		���� temp = null;	//�� ��ü ����
		if(�����ȣ == 1) {
			temp = new ��������("0", ��й�ȣ, ������, 0);
		}//if end
		
		else if(�����ȣ == 2) {
			temp = new ��������("0", ��й�ȣ, ������, 0);
		}//else if end
		
		else if(�����ȣ == 3) {
			temp = new �ϳ�����("0", ��й�ȣ, ������, 0);
		}//else if end
		
		
		//3.�迭�� ���� [DB]
		int i = 0;	//�ε���
		for(���� temp2 : Day09_06_����������α׷�.���¸���Ʈ) {
			if(temp2 == null) {	//�ش� temp2�� �����̸�
				Day09_06_����������α׷�.���¸���Ʈ[i] = temp;	//���� �ε����� ����
				System.out.println("*** ���� ��� ***");
				return ���¹�ȣ;
			}//if end
			i++;
		}//for end
		return null;	//false�̸� �����ߴٴ� �ǹ�
	}//���»��� boolean
		
		//2.�Ա�[u]
	public boolean �Ա�(String ���¹�ȣ, int �Աݾ�) {
		int i = 0;
		for(���� temp : Day09_06_����������α׷�.���¸���Ʈ) {
			if(temp != null && temp.get���¹�ȣ().equals(���¹�ȣ)) {
				
			}
		}
		return false;}//�Ա� boolean end
	
		//3.���[u]
	public boolean ���(String ���¹�ȣ, String ��й�ȣ, int ��ݾ�) {return false;}//��� boolean end
	
		//4.��ü[u]
	public boolean ��ü() {
		return false;}//��ü boolean end
		
		//5.�����¸��[r]
	public boolean �����¸��(String ������) {
		//�Է¹��� �������� ���¸�� ���� ��ȯ
		����[] �����¸�� = new ����[100];
		for(���� temp : Day09_06_����������α׷�.���¸���Ʈ) {
			if(temp != null && temp.get������().equals(������)) {
				//�ش� ���³� �����ֿ� �μ��� �����ֿ� �����ϸ�
				//�����¸�� �迭�� ������� ã�Ƽ� �����¸�Ͽ� �ֱ�
				int i = 0;
				for(���� temp2 : �����¸��) {
					if(temp2 == null) {
						�����¸��[i] = temp;	break;
					}
					i++;
				}
			}
		}
		return false;}//�����¸�� boolean end
		
		//6.����[u]
	public boolean ����() {return false;}//���� boolean end
	
}//ce

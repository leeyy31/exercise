
public class VarEx3 {

	public static void main(String[] args) {
		final int score; //=100;
		score=200;
		boolean power = true;
		
		byte b = 127; // byte Ÿ���� ���� -128~127
		
		int oct = 010; //���λ� 0�� �پ� 8�����̰�, 10������ 8
		int hex = 0x10; //���λ� 0x�� �پ� 16������, 10�����δ� 16
		System.out.println(oct);
		System.out.println(hex); // println method�� ���� 10������ ��°���, ���λ�� ���̻�� ��� X
		//���� ������ 10������ �ƴ� 8������ 16������ ����Ϸ���
		// println�� �ƴ� printf method�� ��� �ؾ��Ѵ�. 
		
		long l = 1_000_000_000 ; //10���� ���̻簡 ������ Ÿ���� int
		//������ int���� longŸ�� ������ ���� ����. 
		//int ���ͷ��� ������ ����� �Ǹ�, �� ���ͷ��� ���̻� L�� �ٿ� longŸ������ ����� ��
		long u = 100_000_000_000L ; 
		
		float f = 3.14f; // f ���� �Ұ��� (���ָ� type mismatch ���� �߻�)
		double d = 3.14d; //d ���� ����, ���̻� d��� f ���� ����
		//���ͷ��� ������ Ÿ���� ��ġ���� ������ ������ Ÿ���� double�� ���ͷ��� Ÿ���� float���� �� �б� ������
		//�� ���� ������ ū �׸��� ��� ��. 
		
		System.out.println(10.0); //10.0
		System.out.println(.10);  //0.1
		System.out.println(10f);  //10.0 (���̻�� ��µ��� �ʾƼ� 10f�� �ƴ϶� 10.0��µ�)
		System.out.println(1e3);  //1000.0 

		char ch = 'A';
		System.out.println(ch);//��� A
		int i = 'A'; 
		System.out.println(i);//��� 65 //��ǻ�ʹ� ���� ���ڷ� ������.������ ��쵵. 
		//���ڸ� �����Ϸ��� ���ڸ� ���ڷ� �ٲ�� �ϴµ�, ��ӵ� ǥ�� ����  A�� 65�� �ٲ�.
		
		String str = ""; // �� ���ڿ�(empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);
		
		System.out.println(""+7+7);
		System.out.println(7+7+"");
	}

}

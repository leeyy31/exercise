
public class VarEx3 {

	public static void main(String[] args) {
		final int score; //=100;
		score=200;
		boolean power = true;
		
		byte b = 127; // byte 타입의 범위 -128~127
		
		int oct = 010; //접두사 0이 붙어 8진수이고, 10진수로 8
		int hex = 0x10; //접두사 0x가 붙어 16진수고, 10진수로는 16
		System.out.println(oct);
		System.out.println(hex); // println method는 값을 10진수로 출력가능, 접두사와 접미사는 출력 X
		//만일 정수를 10진수가 아닌 8진수나 16진수로 출력하려면
		// println이 아닌 printf method를 사용 해야한다. 
		
		long l = 1_000_000_000 ; //10억은 접미사가 없으니 타입이 int
		//여전히 int값을 long타입 변수에 저장 가능. 
		//int 리터럴의 범위가 벗어나게 되면, 그 리터럴에 접미사 L을 붙여 long타입으로 만들면 됨
		long u = 100_000_000_000L ; 
		
		float f = 3.14f; // f 생략 불가능 (없애면 type mismatch 에러 발생)
		double d = 3.14d; //d 생략 가능, 접미사 d대신 f 삽입 가능
		//리터럴과 변수의 타입이 일치하지 않지만 변수의 타입인 double인 리터럴의 타입인 float보다 더 넓기 때문에
		//즉 작은 물건을 큰 그릇에 담는 꼴. 
		
		System.out.println(10.0); //10.0
		System.out.println(.10);  //0.1
		System.out.println(10f);  //10.0 (접미사는 출력되지 않아서 10f가 아니라 10.0출력됨)
		System.out.println(1e3);  //1000.0 

		char ch = 'A';
		System.out.println(ch);//결과 A
		int i = 'A'; 
		System.out.println(i);//결과 65 //컴퓨터는 모든걸 숫자로 저장함.문자의 경우도. 
		//문자를 저장하려면 문자를 숫자로 바꿔야 하는데, 약속된 표에 의해  A가 65로 바뀜.
		
		String str = ""; // 빈 문자열(empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);
		
		System.out.println(""+7+7);
		System.out.println(7+7+"");
	}

}

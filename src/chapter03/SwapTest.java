package chapter03;

public class SwapTest {
	
	public static void main(String[] args) {
		
		int i = 10; // 지역변수, 스택에 들어감  
		int j = 20; // 객체의 경우 call by ref, 원시형 변수는 call by val
		
		System.out.println("i=" + i + "j="+j);
		swap(i,j);  // static은 static 호출 가능 
		System.out.println("i=" + i + "j="+j);
		
		Value v1 = new Value();
		v1.setVal(10);
		Value v2 = new Value();
		v2.setVal(20);
		
		
		
		System.out.println("v1=" + v1.getVal() + "v2="+v2.getVal());
		swap2(v1,v2); 
		System.out.println("v1=" + v1.getVal() + "v2="+v2.getVal());
		
		
		
	} // 메인함수 끝
	
	public static void swap(int a, int b) { //a, b도 스택에 들어감, 지역변수 
		
		int temp = a; // temp도 지역변수 , 지역변수는 스택에 들어가기 때문에 스택 윗부분에서 a와 b의 값이 바뀌어도 swap 함수를 나오면서 스택 윗부분의 값들이 삭제되고 i,j의 값은 그대로다. 
		a = b;
		b = temp ; 
		
		
	}
	
	public static void swap2( Value a, Value b) {
		
		int temp = a.getVal();
		a.setVal(b.getVal());
		b.setVal(temp);
		
	}

}

package t2;

class MyClass<T> {
	private T t;  // 타입 T 변수명 t
	
	public T getT() {
		return t;
	}
	public void setT(T t) {  // 타입을 안줬기에 생성할때 타입을 줌 밑에서 받고 
		this.t = t;
	}
}

// 하위 타입을 정한다 => 제너릭
public class Test1 {
	public static void main(String[] args) {
		//MyClass<String> mc1 = new MyClass<String>();  // 숫자 Integer Double <객체>가 들어가야함
		MyClass<String> mc1 = new MyClass<>();  // 앞의 타입과 같으므로 뒤에 생략가능	
		mc1.setT("안녕하세요");
		System.out.println("mc1 : " + mc1.getT());
		System.out.println();
		
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.setT(100);  // 미리 타입을 지정해서 잘못 넣으면 미리 오류 방지
		System.out.println("mc2 : " + mc2.getT());
	}
}

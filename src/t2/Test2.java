package t2;

class MyClass2<T, V> {
	private T t;
	private V v;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
}

// 하위 타입을 정한다 => 제너릭
public class Test2 {
	public static void main(String[] args) {
		//MyClass<String> mc1 = new MyClass<String>();
		MyClass2<String, Integer> mc1 = new MyClass2<>();
		// mc1.setT(100);
		mc1.setT("안녕하세요");  // T는 String으로 했으니 에러 안남, V가 Integer
		//mc1.setV("안녕");
		mc1.setV(100);
		System.out.println("key : " + mc1.getT() + ", value : " + mc1.getV());
		System.out.println();
		
		MyClass2<Integer, String> mc2 = new MyClass2<>();
		mc2.setT(404);  // 에러메시지 출력할 때 사용
		mc2.setV("Page Not Found(요청한 페이지를 찾을 수 없습니다.");
			System.out.println("key : " + mc2.getT() + ", value : " + mc2.getV());
	}
}

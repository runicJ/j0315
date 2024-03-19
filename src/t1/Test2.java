package t1;

class Apple2 {}
class Food2 {}

class Goods {  // 하나에 담는 그릇
	private Object object = new Object();  // 가장 큰 그릇

	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}

public class Test2 {
	public static void main(String[] args) {
		// Goods1을 통해서 Apple객체/Food객체를 추가 및 가져오기
		Goods goods = new Goods();
		goods.setObject(new Apple2());
		Apple2 apple = (Apple2) goods.getObject();  // 강제 다운 캐스팅
		System.out.println("apple : " + apple);
		System.out.println();

		Goods goods2 = new Goods();
		goods2.setObject(new Food2());
		Food2 food = (Food2) goods2.getObject();
		System.out.println("food : " + food);
		
		// 잘못된 casting
		Goods goods3 = new Goods();
		goods3.setObject(new Apple2());
		Food2 food2 = (Food2) goods3.getObject();  // 하위타입이 업 캐스팅이 된 적이 없다  // 미리 선언
		System.out.println("food2 : "  + food2);
	}
}

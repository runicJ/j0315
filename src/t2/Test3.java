package t2;

class Apple {}
class Food {}

class Goods<T> {
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class Test3 {
	public static void main(String[] args) {
		Goods<Apple> goods1 = new Goods<>();
		goods1.setT(new Apple());
		Apple apple = goods1.getT();
		System.out.println("apple : " + apple);
		System.out.println();

		Goods<Food> goods2 = new Goods<>();
		goods2.setT(new Food());
		Food food = goods2.getT();
		System.out.println("food : " + food);
		System.out.println();
		
		Goods<Apple> goods3 = new Goods<>();
		goods3.setT(new Apple());
//		Food food2 = (Food) goods3.getT();  // 하위 타입 결정 후 다운 캐스팅 안됨 에러 표시됨  // 제너릭 설정
//		System.out.println("apple : " + apple);
		System.out.println();
	}
}

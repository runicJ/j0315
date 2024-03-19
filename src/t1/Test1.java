package t1;

class Apple {}  // 객체
class Goods1 {  // 사과를 담는 vo 객체 같은
	private Apple apple = new Apple();  //필드 객체 생성
	public Apple getApple() {
		return apple;
	}
	public void setApple(Apple apple) {  // 사과 객체 타입으로 넣음
		this.apple = apple;
	}
}

class Food {}
class Goods2 {  // 음식 담는 vo
	private Food food = new Food();
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
}

public class Test1 {
	public static void main(String[] args) {
		// Goods1을 통해서 Apple객체를 추가 및 가져오기
		Goods1 goods1 = new Goods1();  // 이 객체는 사과를 담으려고 생성
		goods1.setApple(new Apple());  // 사과 객체 생성
		Apple apple = goods1.getApple();  // 사과를 꺼냄
		System.out.println("apple : " + apple);  // 객체 주소 출력
		System.out.println();

		Goods2 goods2 = new Goods2();
		goods2.setFood(new Food());  // food로 읽어서
		Food food = goods2.getFood();
		System.out.println("food : " + food);
	}
}

package StrategyPattern;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();		//꽥꽥 거리는 Quack 클래스 멤버변수 인스턴스화
		flyBehavior = new FlyWithWings();	//날수 있는 FlyWightWings 클래스 멤버변수 인스턴스화

		//멤버변수의 set get method가 없을 경우 생성자에서 셋팅된 멤버변수만 고정이고 동적으로 변경될 수 없다.
	}
	
	public void display(){
		System.out.println("저는 물오리입니다.");
	}
	
}

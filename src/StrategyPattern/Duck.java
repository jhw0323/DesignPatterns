package StrategyPattern;

public abstract class Duck {

	//멤버변수의 set get method가 없을 경우 상속받은 클래스의 생성자에서 셋팅된 멤버변수만 고정이고 동적으로 변경될 수 없다.
	//setFlyBehavior() , setQuackBehavior()를 추가하여 동적으로 상속받은 클래스에서 flyBehavior , quackBehavior를 동적으로 교환할 수 있도록 한다.
	//위 방식이 스트래티지 패턴 (Strategy Pattern) 이다.
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	/**
	 * 오리의 비행을 구현하는 함수
	 * */
	public void performFly(){
		flyBehavior.fly();	//행동 클래스에 FlyBehavior의 fly에 대한 처리를 위임하는
	}
	
	/**
	 * 오리의 울음소리를 구현하는 함수 
	 * */
	public void pefromQuack(){
		quackBehavior.quack();	//행동클래스 에서 QuackBehavior의 quack에 대한 처리를 위임하는
	}
	
	
	/**
	 * 오리의 수영에 대한 구현을 하는 함수
	 * */
	public void swim(){
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		this.quackBehavior = qb;
	}
	
}

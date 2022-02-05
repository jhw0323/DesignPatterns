package StrategyPattern;

/**
 * 오리의 울음을 "꽥" 울도록 행동을 구현하는 클래스
 * */
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("꽥");
	}

}

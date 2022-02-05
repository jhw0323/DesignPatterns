package StrategyPattern;

/**
 * 고무 오리의 울음 "삑" 울도록 행동을 구현하는 클래스
 * */
public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("삑");
	}

}

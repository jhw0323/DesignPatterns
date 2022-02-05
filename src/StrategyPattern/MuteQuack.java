package StrategyPattern;

/**
 * 오리의 울음이 없는 행동을 구현하는 클래스
 * */
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("<< 조용 ~ >>");
	}

}

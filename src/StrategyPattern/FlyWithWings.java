package StrategyPattern;

/**
 * 실제로 날 수 있는 오리들의 나는 행동을 구현하는 클래스
 * */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날고 있어요!!");
	}

}

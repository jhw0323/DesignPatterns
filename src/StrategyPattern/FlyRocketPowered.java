package StrategyPattern;

/**
 * 로켓의 추진력으로 날아가는 행동을 구현하는 클래스
 * */
public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("로켓 추진으로 날아갑니다.");
	}

}

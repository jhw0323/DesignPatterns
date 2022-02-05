package StrategyPattern;

/**
 * Duck에 대한 테스트하는 시뮬레이션 클래스
 * */
public class MiniDuckSimulator {
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		
		mallard.performFly();
		
		System.out.println("오리에게 로켓이 장책되었습니다.");
		//물오리에 로켓이 장착되어 물오리가 물로켓으로 장착이 되도록 변경한다. 
		mallard.setFlyBehavior(new FlyRocketPowered());
		mallard.performFly();
		
		mallard.pefromQuack();
	}
}

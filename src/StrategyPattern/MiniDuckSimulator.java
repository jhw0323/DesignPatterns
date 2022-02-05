package StrategyPattern;

/**
 * Duck�� ���� �׽�Ʈ�ϴ� �ùķ��̼� Ŭ����
 * */
public class MiniDuckSimulator {
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		
		mallard.performFly();
		
		System.out.println("�������� ������ ��å�Ǿ����ϴ�.");
		//�������� ������ �����Ǿ� �������� ���������� ������ �ǵ��� �����Ѵ�. 
		mallard.setFlyBehavior(new FlyRocketPowered());
		mallard.performFly();
		
		mallard.pefromQuack();
	}
}

package StrategyPattern;

public abstract class Duck {

	//��������� set get method�� ���� ��� ��ӹ��� Ŭ������ �����ڿ��� ���õ� ��������� �����̰� �������� ����� �� ����.
	//setFlyBehavior() , setQuackBehavior()�� �߰��Ͽ� �������� ��ӹ��� Ŭ�������� flyBehavior , quackBehavior�� �������� ��ȯ�� �� �ֵ��� �Ѵ�.
	//�� ����� ��Ʈ��Ƽ�� ���� (Strategy Pattern) �̴�.
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	/**
	 * ������ ������ �����ϴ� �Լ�
	 * */
	public void performFly(){
		flyBehavior.fly();	//�ൿ Ŭ������ FlyBehavior�� fly�� ���� ó���� �����ϴ�
	}
	
	/**
	 * ������ �����Ҹ��� �����ϴ� �Լ� 
	 * */
	public void pefromQuack(){
		quackBehavior.quack();	//�ൿŬ���� ���� QuackBehavior�� quack�� ���� ó���� �����ϴ�
	}
	
	
	/**
	 * ������ ������ ���� ������ �ϴ� �Լ�
	 * */
	public void swim(){
		System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ����.");
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		this.quackBehavior = qb;
	}
	
}

package StrategyPattern;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();		//�в� �Ÿ��� Quack Ŭ���� ������� �ν��Ͻ�ȭ
		flyBehavior = new FlyWithWings();	//���� �ִ� FlyWightWings Ŭ���� ������� �ν��Ͻ�ȭ

		//��������� set get method�� ���� ��� �����ڿ��� ���õ� ��������� �����̰� �������� ����� �� ����.
	}
	
	public void display(){
		System.out.println("���� �������Դϴ�.");
	}
	
}

package cwb.honor.集合.collect.list.wildcard;
/*
 *  ���徭����
 *    ����Ա��һ��,û��VIP����
 *    �Լ��н�������
 */
public class JingLi extends Employee {
	//�ղ����췽��
	public JingLi(){}
	
	//������췽��
	public JingLi(String name,String id,double money){
		super(name, id);
		this.money = money;
	}
	
	//���影������
	private double money;
	
	
	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	//��д���󷽷�
	public void work(){
		System.out.println("经理work");
	}
}

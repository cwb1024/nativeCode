package cwb.honor.集合.collect.list.wildcard;


/*
 *  �����ʦ��
 *    ����Ա��һ��,���ж��������
 *    �̳�Employee,ʵ��VIP�ӿ�
 */
public class ChuShi extends Employee implements VIP{
	//�ղ����췽��
	public ChuShi(){}
	
	//�в����췽��
	public ChuShi(String name,String id){
		super(name,id);
	}
	
	//���󷽷���д
	public void work(){
		System.out.println("厨师work");
	}
	public void services(){
		System.out.println("厨师services");
	}
}

package cwb.honor.集合.collect.list.wildcard;
/*
 *  �����ʦ��
 *    ����Ա��һ��,���ж��������
 *    �̳�Employee,ʵ��VIP�ӿ�
 */
public class FuWuYuan extends Employee implements VIP{
	//�ղ����췽��
	public FuWuYuan() {
		super();
		
	}
   //������췽��
	public FuWuYuan(String name, String id) {
		super(name, id);
		
	}
	
	//���󷽷���д
	public void work(){
		System.out.println("服务员work");
	}
	


	public void services(){
		System.out.println("服务员services");
	}
}

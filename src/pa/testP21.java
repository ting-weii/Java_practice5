package pa;
//109360127_�q�l�T��_�\�ʺ�/**/
public class testP21 {

	public static void main(String[] args) 
	{
		try {
		int test[] = new int[5];
		
		System.out.println("�N�ȫ��w��test[10]");
		
		test[10] = 80;
		System.out.println("�N80���w��test[10]");
		System.out.println("���Q���槹��");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("�W�L�}�C���d��F");
		}
		
		System.out.println("���Q���槹���F");		
	}
}
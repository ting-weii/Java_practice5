package pa;
//109360127_電子三甲_許廷維/**/
public class testP21 {

	public static void main(String[] args) 
	{
		try {
		int test[] = new int[5];
		
		System.out.println("將值指定給test[10]");
		
		test[10] = 80;
		System.out.println("將80指定給test[10]");
		System.out.println("順利執行完畢");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("超過陣列的範圍了");
		}
		
		System.out.println("順利執行完畢了");		
	}
}
package pa;
//109360127_�q�l�T��_�\�ʺ�
import java.io.*;
public class testP34 {

	public static void main(String[] args) 
	{
		System.out.println("�п�J�r��");
		
		try {
			BufferedReader br1=new BufferedReader(
					new InputStreamReader(System.in));

			String str1 = br1.readLine();
	
			System.out.println("�w��J�r��"+str1);
		}
		
		catch(IOException e){
			System.out.println("��J��X���~");
		}
	}
}
/**/
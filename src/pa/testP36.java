package pa;
//109360127_�q�l�T��_�\�ʺ�
import java.io.*;
public class testP36 {

	public static void main(String[] args) 
	{
		try {
			BufferedReader br1=new BufferedReader(
					new FileReader("test1.txt"));
			
			String str1 = br1.readLine();
			String str2 = br1.readLine();		
		
			System.out.println("�g�J���ɮפ�����Ӧr��O:");
			System.out.println(str1);
			System.out.println(str2);
			
			br1.close();
		}
		
		catch(IOException e){
			System.out.println("��J��X���~");
		}
	}
}
/**/
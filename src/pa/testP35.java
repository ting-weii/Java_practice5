package pa;
//109360127_�q�l�T��_�\�ʺ�
import java.io.*;
public class testP35 {

	public static void main(String[] args) 
	{
		try {
			FileWriter fw1 = new FileWriter("test1.txt");
			PrintWriter pw1 = new PrintWriter(
					new BufferedWriter(fw1));
			
			pw1.println("Hello!");
			pw1.println("GoodBye!");
			pw1.close();
		
			System.out.println("��Ƥw�g�g�J�ɮפF");
		}
		
		catch(IOException e){
			System.out.println("��J��X���~");
		}
	}
}
/**/
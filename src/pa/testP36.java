package pa;
//109360127_電子三甲_許廷維
import java.io.*;
public class testP36 {

	public static void main(String[] args) 
	{
		try {
			BufferedReader br1=new BufferedReader(
					new FileReader("test1.txt"));
			
			String str1 = br1.readLine();
			String str2 = br1.readLine();		
		
			System.out.println("寫入到檔案中的兩個字串是:");
			System.out.println(str1);
			System.out.println(str2);
			
			br1.close();
		}
		
		catch(IOException e){
			System.out.println("輸入輸出有誤");
		}
	}
}
/**/
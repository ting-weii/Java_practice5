package pa;
//109360127_電子三甲_許廷維
import java.io.*;
public class testP40 {

	public static void main(String[] args) 
	{
		if(args.length !=1) {
			System.out.println("請指定正確的檔案名稱");
			System.exit(1);
		}
		
		try {
			BufferedReader br1=new BufferedReader(
					new FileReader(args[0]));
			
			String str1 ;
			while((str1= br1.readLine())!=null) {
				System.out.println(str1);
			}
			br1.close();
		}
		
		catch(IOException e){
			System.out.println("輸入輸出有誤");
		}
	}
}
/**/
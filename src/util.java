import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;
public class util {
	public int readDataFile(String filename) throws IOException{
		BufferedReader in;
		Pattern pattern = Pattern.compile("(\\{.+?\\})");
		in = new BufferedReader(new FileReader(filename));
		String s;

		while((s=in.readLine())!=null){
			Matcher matcher = pattern.matcher(s);
			int num=0;
	
			while(matcher.find(num)){
				String group = matcher.group();
				String record = group.substring(1, group.length()-1);
				String arr[] = record.split(",");
				for(int i=0; i < arr.length; i++){
					System.out.printf("%s ",arr[i].replaceAll(" ", ""));
				}
				System.out.printf("||");
				num+=group.length();
			}
			System.out.println();
		}
	in.close();
	return 0;
	}
	
	public int readParaFile(String filename) throws IOException{
		BufferedReader in_para;
		Pattern pattern1 = Pattern.compile("MIS\\(([0-9]+)\\) = ([^\r\n]*)");
		Pattern pattern2 = Pattern.compile("SDC = (.*)");
		in_para = new BufferedReader(new FileReader(filename));
		String s;
		while((s = in_para.readLine())!=null){
			Matcher matcher1 = pattern1.matcher(s);
			Matcher matcher2 = pattern2.matcher(s);	
			int num = 0;
			while(matcher1.find(num)){
				String group = matcher1.group();
				//System.out.println(group);
				int indexStart = group.indexOf("(");
				int indexEnd = group.indexOf(")");
				String subGroup1 = group.substring(indexStart+1, indexEnd);
				int num1 = Integer.parseInt(subGroup1);
				int index = group.indexOf("=");
				String subGroup2 = group.substring(index+2);
				float num2 = Float.parseFloat(subGroup2);
				System.out.printf("%d,%f\n",num1, num2);
				num+=group.length();
			}
			num=0;
			while(matcher2.find(num)){
				String group = matcher2.group();
				//System.out.println(group);
				int index = group.indexOf("=");
				String subGroup = group.substring(index+2);
				float value = Float.parseFloat(subGroup);
				System.out.printf("SCD=%f\n",value);
				num += group.length();
			}
			System.out.println();
		}
		
		return 0;
	}
}

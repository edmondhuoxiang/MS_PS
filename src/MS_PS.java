import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class MS_PS {
	public static HashMap<Integer, Float> MIS;
	public ArrayList<Transaction> T;
	public static int N; //the number of transaction in T;
	public static Float SDC;
	
	MS_PS(String paraFile, String dataFile) throws IOException{
		util utils = new util();
		T = utils.readDataFile(dataFile);
		MIS = util.readParaFile(paraFile);
		SDC = utils.getSDC();
	}
	
	public static void main(String [ ] args) throws IOException{
		String dataFile = "/Users/edmond/Downloads/cse514-msprefixspan/src/dataTest.txt";
		String paraFile = "/Users/edmond/Downloads/cse514-msprefixspan/src/paraTest.txt";
		
		MS_PS msps = new MS_PS(paraFile, dataFile);
		
		
		for(int i=0; i < msps.T.size(); i++){
			Transaction tran = msps.T.get(i);
			tran.print();
		}
		for(Integer id : msps.MIS.keySet()){
			System.out.println(id + ":" + msps.MIS.get(id));
		}
		System.out.print(msps.SDC);
		
		
	}
}

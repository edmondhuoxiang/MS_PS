import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;


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
		N = T.size();
	}
	
	public static void main(String [ ] args) throws IOException{	
		//Data Initialization
		String dataFile = "/Users/edmond/Downloads/cse514-msprefixspan/src/dataTest.txt";
		String paraFile = "/Users/edmond/Downloads/cse514-msprefixspan/src/paraTest.txt";
		MS_PS msps = new MS_PS(paraFile, dataFile);	
		for(int i=0; i < msps.T.size(); i++){
			Transaction tran = msps.T.get(i);
			tran.print();
		}
		for(Integer id : msps.MIS.keySet()){
			System.out.println("MIS("+ id + "):" + msps.MIS.get(id));
		}
		System.out.println("SDC=" + msps.SDC);
		util utils = new util();
		
		List<Integer> M = utils.sortMIS(msps.MIS);
		System.out.print("M: {");
		for(int i=0; i<M.size();i++){
			System.out.print(M.get(i));
			if(i == M.size()-1)
				System.out.println("}");
			else
				System.out.print(",");
		}
		
		System.out.println("N: "+msps.N);
		HashMap<Integer, Integer>L = utils.contFreq(msps.MIS, msps.T);
		System.out.print("L: {");
		for(Integer key: L.keySet()){
			System.out.print(key+":"+L.get(key)+" ");
		}
		System.out.println("}");
		HashMap<Integer, Integer>freqL = utils.findFreqL(msps.MIS, L, M, msps.N);
		System.out.print("FreqL: {");
		for(Integer key: freqL.keySet()){
			System.out.print(key+":"+freqL.get(key)+" ");
		}
		System.out.println("}");
		
		HashMap<Integer, Float> freqMIS = new HashMap<Integer, Float>();
		for(Integer key: freqL.keySet()){
			freqMIS.put(key, msps.MIS.get(key));
		}
		List<Integer> freqM = utils.sortMIS(freqMIS);
		System.out.print("freqM: {");
		for(int i=0; i<freqM.size(); i++){
			System.out.print(freqM.get(i));
			if(i == freqM.size()-1)
				System.out.println("}");
			else
				System.out.print(",");
		}
		
		System.out.println("*******************************");
	}
}

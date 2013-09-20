import java.io.IOException;
import java.util.ArrayList;


public class MS_PS {
	public static void main(String [ ] args) throws IOException{
		ArrayList<Transaction> trans;
		String dataFile = "/Users/edmond/Downloads/cse514-msprefixspan/src/data.txt";
		String paraFile = "/Users/edmond/Downloads/cse514-msprefixspan/src/paraTest.txt";
		util utils = new util();
		trans = utils.readDataFile(dataFile);
		
		for(int i=0; i<trans.size(); i++){
			Transaction tran = trans.get(i);
			tran.print();
		}
		//utils.readParaFile(paraFile);
	}
}

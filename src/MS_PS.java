import java.io.IOException;


public class MS_PS {
	public static void main(String [ ] args) throws IOException{
		String dataFile = "/Users/edmond/Downloads/cse514-msprefixspan/src/data.txt";
		String paraFile = "/Users/edmond/Downloads/cse514-msprefixspan/src/paraTest.txt";
		util utils = new util();
		//utils.readDataFile(dataFile);
		utils.readParaFile(paraFile);
	}
}

import java.util.ArrayList;
public class ItemSet {
	//Use ArrayList to hold all items in one items in one set;
	public ArrayList<Integer> items;
	
	public ItemSet(){
		items = new ArrayList<Integer>();
	}
	
	public boolean isSubset(ItemSet set){
		return set.items.containsAll(this.items);
	}
	
	public ItemSet copy(){
		//return a copy of this Transaction
		ItemSet cp = new ItemSet();
		cp.items.addAll(this.items);
		return cp;
	}
	
	public void deleteFirstNItems(int N){
		for(int i=0; i < N; i++)
			this.items.remove(0);
	}
	public void delItemOfindex(int ind){
		this.items.remove(ind);
	}
}

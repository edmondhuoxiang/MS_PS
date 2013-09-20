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
}

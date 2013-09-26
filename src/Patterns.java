public class Patterns<A,B,C>{
	private A first;
	private B second;
	private C third;
	
	public Patterns(A first,B second,C third){
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public int hashCode() {
    	int hashFirst = first != null ? first.hashCode() : 0;
    	int hashSecond = second != null ? second.hashCode() : 0;
    	int hashThird = third != null ? third.hashCode() : 0;
    	return (hashFirst + hashSecond + hashThird) * hashSecond + hashFirst + hashThird;
    }
	
    public A getFirst() {
    	return first;
    }

    public void setFirst(A first) {
    	this.first = first;
    }

    public B getSecond() {
    	return second;
    }

    public void setSecond(B second) {
    	this.second = second;
    }
    
    public C getThird() {
    	return third;
    }
    
    public void setThird(C third) {
    	this.third = third;
    }
}
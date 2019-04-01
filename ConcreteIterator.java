import java.util.ArrayList;

public class ConcreteIterator implements IteratorInterface {

     int cursor;
     ArrayList<CompositeInterface> copyoflist;
	
     public ConcreteIterator(ArrayList<CompositeInterface> anotherlist) {
    	 this.copyoflist=anotherlist;
     }
	public boolean hasNext() {
		
		return cursor<copyoflist.size();
	}

	@Override
	public CompositeInterface getNext() 
	{
		 return copyoflist.get(cursor++);
		 
	}

}

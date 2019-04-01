import java.util.ArrayList;
import java.util.Collections;
import java. util.*;
public class CompositeClient {

	public static <E> void main(String args[]) 
	{
	
		//ArrayList<String> List= new ArrayList<String>();
		CompositeInterface leaf1= new Leaf("Morning wakeup");
		CompositeInterface leaf2= new Leaf("Look good");
		CompositeInterface Composite1= new Composite("Making Good Breakfast");
		
		
		CompositeInterface composite2= new Composite("Going to GYM");
		CompositeInterface leaf3= new Leaf("warm_Up");
		CompositeInterface composite3 = new Composite("Do something");
		CompositeInterface leaf4= new Leaf("Read books");
		composite2.addTask(leaf3);
		composite2.printfun();
		composite3.addTask(leaf4);
		composite3.printfun();
		IteratorInterface newlist= composite2.getList();
		
		System.out.println(newlist.hasNext());
		while(newlist.hasNext())
		{
			CompositeInterface item=newlist.getNext();
			item.printfun();
		}
		
		
	}
}

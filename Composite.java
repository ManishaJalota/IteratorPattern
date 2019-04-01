import java.util.*;

class Composite implements CompositeInterface
{
	
	ArrayList<CompositeInterface> multitodo= new ArrayList<CompositeInterface>();
	String singleTodo;

	Composite(String singleToDo)
	{
		this.singleTodo=singleToDo;
		this.multitodo= new ArrayList<CompositeInterface>();
	
	}

	
	@Override
	
	public String getToDo() {
		// TODO Auto-generated method stub
		return singleTodo;
	}

	
	


	@Override
	public void addTask(CompositeInterface singleTask) 
	{
		multitodo.add(singleTask);
		
}
	public void printfun() 
	{
		System.out.println(singleTodo);
		for( CompositeInterface task: multitodo)
		{
			task.printfun();
			
		}
	}


	@Override
	public IteratorInterface getList() {
		
		return  new ConcreteIterator(multitodo);
	}
	
	
}
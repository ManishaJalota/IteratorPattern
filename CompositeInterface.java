import java.util.ArrayList;

public interface CompositeInterface {

	String getToDo();
	void addTask(CompositeInterface task);
	void printfun();
	IteratorInterface getList();

}
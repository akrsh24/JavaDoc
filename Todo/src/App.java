import com.todo.desc.TodoDesc;
import com.todo.model.TodoService;

public class App {

	public static void main(String[] args) {
		TodoService service = new TodoService();

		TodoDesc desc = new TodoDesc("Had Lunch");
		// TodoDesc desc1 = new TodoDesc(25, "Code", false);
		// TodoDesc desc2 = new TodoDesc(78, "Sleep", false);
		// TodoDesc desc3 = new TodoDesc(18, "Work completed", false);
		// TodoDesc desc4 = new TodoDesc(19, "sayonara", true);
		service.addTodo("code");
		service.addTodo("lunch");
		service.addTodo("eat");
        service.editTodo(1,"work");
        service.completeAll();
        service.viewAll("inactive");
        
		
	}
}

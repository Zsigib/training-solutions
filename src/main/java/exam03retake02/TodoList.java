package exam03retake02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public int getNumberOfItemsLeft() {
        List<Todo> result = new ArrayList<>();
        for (Todo todo: todos){
            if (todo.getState().equals(State.NON_COMPLETED) )
                result.add(todo);

        }
        int number = result.size();
        return number;
    }

    public List<Todo> getMostImportantTodosText() {
        List<Todo> importance = new ArrayList<>();


        return (List<Todo>) importance;
    }

    public void deleteCompleted() {
        List<Todo> result = new ArrayList<>();
        for (Todo todo: todos){
            if (todo.getState().equals(State.COMPLETED)){
                result.remove(todo);
            }
        }


    }


    public List<Todo> getTodos() {

        return todos;
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }
}

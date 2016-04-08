package monsh.com.todort.Models;

/**
 * Created by monsh on 08/04/2016.
 */
public class ToDoItem {
    String username;
    String item;
    boolean completed;

    public ToDoItem(){ }

    public ToDoItem(String item, String username) {
        this.username = username;
        this.item = item;
        this.completed = false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}

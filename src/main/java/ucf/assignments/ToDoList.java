package ucf.assignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToDoList {

    private List <Items> items;
    private String toDoListTitle;

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public String getToDoListTitle() {
        return toDoListTitle;
    }

    public void setToDoListTitle(String toDoListTitle) {
        this.toDoListTitle = toDoListTitle;
    }

    public ToDoList() {
        items = new ArrayList<Items>();
    }

    public void removeItem (String itemName){
        //items.remove(itemName);
    }

    public void viewList (String title, int option){

        /*System.out.println("To Do List Title: " + toDoListTitle);

        if (option == 1){
            for (Items o : getItems())
                System.out.println("Description: "+o.getDescription()+"\tDueDate: "+ o.getDueDate()+"\tCompleted: "+o.isCompleted());
        }

        if (option == 2){
            for (Items o : getItems())
                if (o.isCompleted())
                    System.out.println("Description: "+o.getDescription()+"\tDueDate: "+ o.getDueDate());
        }

        if (option == 3){
            for (Items o : getItems())
                if (!(o.isCompleted()))
                    System.out.println("Description: "+o.getDescription()+"\tDueDate: "+ o.getDueDate());
        }*/
    }

    public void storeList (String listTitle) throws IOException {

        /*FileWriter myWriter = new FileWriter(listTitle+".txt");
        for (Items o : getItems())
            myWriter.write("Description: "+o.getDescription()+"\tDueDate: "+o.getDueDate()+"\tCompleted: "+o.isCompleted());

        myWriter.close();*/

    }


}


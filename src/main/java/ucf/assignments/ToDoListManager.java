package ucf.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListManager {

    private List<ToDoList> lists;

    public List<ToDoList> getLists() {
        return lists;
    }

    public void setLists(List<ToDoList> lists) {
        this.lists = lists;
    }

    public ToDoListManager() {
        //lists = new ArrayList<ToDoList>();
    }

    public void newList(String title) {

        /*ToDoList tempList = new ToDoList();


        tempList.setToDoListTitle(title);


        lists.add(tempList);*/
    }

    public void removeList (String title){

        //lists.remove(title);
    }

    public void loadList (String listTitle){

            /*File f = new File(listTitle + ".txt");
            try{
                Scanner scanner = new Scanner(f);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }*/

    }



}



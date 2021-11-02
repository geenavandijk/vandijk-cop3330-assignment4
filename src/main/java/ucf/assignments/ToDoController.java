package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.text.ParseException;

public class ToDoController {


    private ToDoListManager data;

    @FXML
    private TextField descriptionItem;

    @FXML
    private TextField editAddListTitle;

    @FXML
    private MenuItem editDate;

    @FXML
    private MenuItem editDeleteItem;

    @FXML
    private MenuItem editDeleteList;

    @FXML
    private MenuItem editDescription;

    @FXML
    private TextField editListAddItem;

    @FXML
    private TextField editSearchList;

    @FXML
    private MenuItem loadAll;

    @FXML
    private TextField loadSelectList;

    @FXML
    private TextField searchItem;

    @FXML
    private MenuItem storeAll;

    @FXML
    private TextField storeSingleList;

    @FXML
    private TextField titleList;

    @FXML
    private MenuItem viewAll;

    @FXML
    private TextField viewSelectList;

    @FXML
    private MenuItem viewSelectListAllItems;

    @FXML
    private MenuItem viewSelectListCompletedItems;

    @FXML
    private MenuItem viewSelectListIncompletedItems;

    @FXML
    void editAddListTitleClicked(ActionEvent event) {
        /*Create new list inside ToDoListManager
        toDoListTitle = editAddListTitle.getText();*/

        /*data.newList(editAddListTitle.getText());*/
    }

    @FXML
    void editDateClicked(ActionEvent event) throws ParseException {

        /* Search through lists and find toDoListTitle == editSearchList
        * Search through items and find description = searchItem
        * update dueDate = editDate */

        /*for( ToDoList o : data.getLists()){
            if (o.getToDoListTitle().equals(editSearchList.getText()))
            {
                for (Items q : o.getItems()){
                    if (q.getDescription().equals(searchItem.getText()))
                        q.setDueDate(editDate.getText());
                }
            }*/

    }

    @FXML
    void editDeleteItemClicked(ActionEvent event) {

        /* Search through lists and find toDoListTitle == editSearchList
         * Search through items and find description = searchItem
         * delete item */

        /*for( ToDoList o : data.getLists()){
            if (o.getToDoListTitle().equals(editSearchList.getText()))
            {
                o.removeItem(searchItem.getText());
            }*/

    }

    @FXML
    void editDeleteListClicked(ActionEvent event) {
        /* call removeList function and pass title*/

        /* data.removeList(editSearchList.getText());*/

    }

    @FXML
    void editDescriptionClicked(ActionEvent event) {

        /* Search through lists and find toDoListTitle == editSearchList
         * Search through items and find description = searchItem
         * update description = editDescription */

        /*for( ToDoList o : data.getLists()){
            if (o.getToDoListTitle().equals(editSearchList.getText()))
            {
                for (Items q : o.getItems()){
                    if (q.getDescription().equals(searchItem.getText()))
                        q.setDescription(editDescription.getText());
                }
            }
        }*/

    }

    @FXML
    void completedClicked(ActionEvent event) {

        /* Search through lists and find toDoListTitle == editSearchList
         * Search through items and find description = searchItem
         * completed = true */

       /* for( ToDoList o : data.getLists()){
            if (o.getToDoListTitle().equals(editSearchList.getText()))
            {
                for (Items q : o.getItems()){
                    if (q.getDescription().equals(searchItem.getText()))
                        q.setCompleted(true);
                }
            }
        }*/

    }

    @FXML
    void editListAddItemClicked(ActionEvent event) {
        /* Search through lists and find toDoListTitle == editSearchList
         * create new item
         * description = editListAddItem */

        /*for( ToDoList o : data.getLists()){
            if (o.getToDoListTitle().equals(editSearchList.getText()))
            {
                Items newItem = new Items();
                o.getItems().add(newItem);
                newItem.setDescription(editListAddItem.getText());
            }
         }*/

    }


    @FXML
    void loadAllClicked(ActionEvent event) {
        /* call load function for all lists*/

        /* for (ToDoList o : data.getLists()){
            data.loadList(o.getToDoListTitle());
        }*/

    }

    @FXML
    void loadSelectListClicked(ActionEvent event) {
        /*open file to do lists
        * read through file for folder = loadSelectList
        * call loadList*/

        /*for( ToDoList o : data.getLists()){
            if (o.getToDoListTitle().equals(loadSelectList.getText()))
            {
                data.loadList(loadSelectList.getText());
            }*/

    }

    @FXML
    void storeAllClicked(ActionEvent event) throws IOException {
        /*Call storeList for all lists*/

        /*for( ToDoList o : data.getLists()) {
            o.storeList(viewSelectList.getText());
        }*/
    }

    @FXML
    void storeSingleListClicked(ActionEvent event) throws IOException {
        /*find list and call storeList function */

        /*for( ToDoList o : data.getLists()) {
            if (o.getToDoListTitle().equals(viewSelectList.getText())) {
                o.storeList(viewSelectList.getText());
            }
        }*/
    }

    @FXML
    void viewAllClicked(ActionEvent event) {
        /*Call viewList for all lists*/

        /*for( ToDoList o : data.getLists())
                o.viewList(viewSelectList.getText(), 1);*/


    }

    @FXML
    void viewSelectListAllItemsClicked(ActionEvent event) {
        /*search through toDoListTitle = viewSelectList
        * call view list*/

        /*for( ToDoList o : data.getLists()) {
            if (o.getToDoListTitle().equals(viewSelectList.getText())) {
                o.viewList(viewSelectList.getText(), 1);
            }
        }*/

    }


    @FXML
    void viewSelectListCompletedItemsClicked(ActionEvent event) {

        /*search through toDoListTitle = viewSelectList
         * call view list*/

        /*for( ToDoList o : data.getLists()) {
            if (o.getToDoListTitle().equals(viewSelectList.getText())) {
                o.viewList(viewSelectList.getText(), 2);
            }
        }*/

    }

    @FXML
    void viewSelectListIncompletedClicked(ActionEvent event) {

        /*search through toDoListTitle = viewSelectList
         * call view list*/

        /*for( ToDoList o : data.getLists()) {
            if (o.getToDoListTitle().equals(viewSelectList.getText())) {
                o.viewList(viewSelectList.getText(), 3);
            }
        }*/

    }

}

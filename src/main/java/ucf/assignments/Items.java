package ucf.assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Items{
    private String description;
    private Date dueDate;
    private boolean completed;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        this.dueDate = formatter.parse(dueDate);
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


    public void editDescription (String newName){
        /*change description to newName
        * description = newName */
    }

    public void editDueDate (Date newDate){
        /* change dueDate to newDate
        * dueDate = newDate*/
    }

    public void completed (){
        /* set completed to true
        * completed = true*/
    }
}

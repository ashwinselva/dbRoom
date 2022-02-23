package android.example.dbroom;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Todo {

    @PrimaryKey
    public int tid;
    public String title;
    public String notes;

    public Todo(){}

    public Todo(String mTitle, String mNotes) {
        this.title=mTitle;
        this.notes=mNotes;
    }
}

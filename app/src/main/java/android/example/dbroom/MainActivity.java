package android.example.dbroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText etTitle, etNotes;
    TodoRoomDb todoRoomDb;
    TodoDao todoDao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        todoRoomDb = TodoRoomDb.getDatabase(this);
        todoDao = todoRoomDb.todoDao();  //not sure about this



        etTitle = findViewById(R.id.etTitle);
        etNotes = findViewById(R.id.etNotes);

    }

    public void dbHandler(View view) {
        switch(view.getId()){
            case R.id.btncommit:
                String title = etTitle.getText().toString();
                String notes = etNotes.getText().toString();
                insertAsync(title,notes);
                etTitle.setText("");
                etNotes.setText("");
                break;
            case R.id.btnretrieve:
                //searchTodo(etTitle.getText().toString());
                break;
        }
    }

    public void insertAsync(String title, String notes) {

        new InsertTask(title,notes).execute();
    }

    class InsertTask extends AsyncTask<Void,Void,Void> {
        String mTitle, mNotes;

        public InsertTask(String title, String notes) {
            mTitle=title;
            mNotes=notes;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            todoDao.insert(new Todo( mTitle,mNotes));
            return null;
        }
    }


}
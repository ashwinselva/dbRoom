package android.example.dbroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dbHandler(View view) {
        switch(view.getId()){
            case R.id.btncommit:
                break;
            case R.id.btnretrieve:
                break;
        }
    }
}
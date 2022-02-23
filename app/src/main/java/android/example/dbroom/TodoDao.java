package android.example.dbroom;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface TodoDao {

    @Insert
    void insert(Todo todo);
}

package repositori;

import lombok.Getter;
import model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
@Getter
public class TodoRepository {
    ArrayList<Todo>todos=new ArrayList<>();
}

package Dao;

import Model.User;
import com.company.Main;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public static List<User> spisok = new ArrayList<>();

    public static List<User> getSpisok() {
        return spisok;
    }
}

package Model;

import Dao.UserDao;
import Gender.Gender;

public class User extends UserDao {
    Gender gender;
    int id;
    String name;
    int age;

    @Override
    public String toString() {
        return name+",  age="+age+",  "+gender+",  id="+id;
    }

    public User(int id, String name, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender=gender;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package Service;

import Model.User;
import com.company.MyException;

public interface UserService {
    void addUser(User x);

    public void searchID(int x) throws MyException;
    public void  deleteID(int x);
    public  void allUsers();
}

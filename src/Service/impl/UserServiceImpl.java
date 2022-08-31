package Service.impl;

import Dao.UserDao;
import Model.User;
import Service.UserService;
import com.company.MyException;

import java.util.Scanner;

public class UserServiceImpl implements UserService {

    @Override
    public void addUser(User x) {
        UserDao.spisok.add(x);
    }

    @Override
    public void searchID(int x) throws MyException {
       for (User a:UserDao.spisok){
           if(a.getId()==x){
               System.out.println(a);
               break;
           }
           throw new MyException("Mynday id jok");
       }
       }


    @Override
    public void deleteID(int x) {
        for (User a:UserDao.spisok){
            if(a.getId()==x){
                UserDao.spisok.remove(a);
            }
    }}
    @Override
    public void  allUsers() {
        System.out.println(UserDao.getSpisok());
    }
}

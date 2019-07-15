package lesson7;

import com.alibaba.fastjson.JSON;
import lesson7.info.Group;
import lesson7.info.User;

import java.util.ArrayList;

public class JSONEx {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList();

        users.add(new User("Tom", User.Gender.male, 23));
        users.add(new User("Ginger", User.Gender.female, 30));
        users.add(new User("Roben", User.Gender.male, 45));

        Group group = new Group("triplefok", "fok-fok", users);


        String json = JSON.toJSONString(group);
        System.out.println(json);

        Group groupClone = JSON.parseObject(json, Group.class);
        System.out.println(groupClone);




    }
}

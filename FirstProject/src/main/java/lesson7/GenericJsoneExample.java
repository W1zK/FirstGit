package lesson7;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lesson7.info.DogEntity;
import lesson7.info.Node;
import lesson7.info.User;

import java.util.ArrayList;

public class GenericJsoneExample {
    public static void main(String[] args) {
        ArrayList<Node<User>> nodes = new ArrayList<>();

        nodes.add(new Node<>(new User(
                "Grisha", User.Gender.male, 28),
                "Agent_007"));
        nodes.add(new Node<>(new User(
                "Petro", User.Gender.male, 32),
                "Agent_008"));
        nodes.add(new Node<>(new User(
                "Zoya", User.Gender.female, 22),
                "Agent_009"));

        String json = JSON.toJSONString(nodes);
        System.out.println(json);
        TypeReference<ArrayList<Node<User>>> typeRef = new TypeReference<ArrayList<Node<User>>>() {};
        ArrayList<Node<User>> nodesClone = JSON.parseObject(json, typeRef);
        System.out.println(nodesClone);


        ArrayList<Node<DogEntity>> nodes2 = new ArrayList<>();

        nodes2.add(new Node<>(new DogEntity("weedman", 5), "pitbull"));
        nodes2.add(new Node<>(new DogEntity("piffy", 3), "stuff"));
        nodes2.add(new Node<>(new DogEntity("snoopy", 1), "bestDog"));

        String json2 = JSON.toJSONString(nodes2);
        System.out.println(json2);

    }
}

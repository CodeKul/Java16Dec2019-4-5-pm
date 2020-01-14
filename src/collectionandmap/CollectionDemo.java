package collectionandmap;

import java.util.*;

public class CollectionDemo {

    List<Integer> listData(){

        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2,6);
        list.remove(2);

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list.addAll(3,list1);
        return list;
     /*   list.forEach(l->{
            System.out.println(l);
        });*/

    }

    Set<String> setData(){
        Set<String> set=new TreeSet<>();

        set.add("hanuman");
        set.add("ruman");
        set.add("sonali");
        set.add("ranjana");
        set.add("aishwarya");
        set.add("nidhi");
        set.add("archana");
        set.add("rashmi");
        set.add("shweta");
        set.add("rajan");
        set.add("hanuman");
        set.add("ruman");
        set.add("sonali");
        set.add("ranjana");
        set.add("aishwarya");
        set.add("nidhi");
        set.add("archana");
        set.add("rashmi");
        set.add("shweta");
        set.add("rajan");
        return set;

    }


    public static void main(String[] args) {
        CollectionDemo demo=new CollectionDemo();
      /*  demo.listData().forEach(l->{
            System.out.println(l);
                }
        );*/

      demo.setData().forEach(l->{
          System.out.println(l);
      });
    }
}

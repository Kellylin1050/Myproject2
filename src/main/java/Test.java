import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*ArrayList list = new ArrayList();
        list.add("abc");
        list.add(true);
        list.add(2);
        System.out.println(list);*/
        List<Integer> list = new ArrayList<Integer>();  //同質
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(1);
        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(1);
        System.out.println(n1+"\t"+n2);
    }
}

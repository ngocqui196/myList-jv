public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(0,3);
        System.out.println(list.size());
        list.add(0,8);
        System.out.println(list.size());
        list.add(0,6);
        System.out.println(list.size());

        list.add(0,9);
//        System.out.println(list);
        System.out.println(list.remove(3));
        System.out.println(list.remove(1));
        System.out.println(list.size());
    }
}

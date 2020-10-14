import java.util.ArrayList;

public class Main {
    private static Fruit[] fruit;

    public static <Fruit> void main(String[] args, Fruit[] fruit, Object remove) {
        Fruit[] apple = new Fruit[13];
        for (int i = 0; i < fruit.length; i++) fruit[i] = new Fruit();

        ArrayList<Apple> arAppleList = new ArrayList<>();
        arAppleList.add((Apple) apple[0]);
        arAppleList.add((Apple) apple[1]);
        arAppleList.add((Apple) apple[2]);
        arAppleList.add((Apple) apple[3]);
        arAppleList.add((Apple) apple[4]);


        apple.remove(0);
        apple.remove(1);
        apple.remove(2);
        apple.remove(3);
        apple.remove(4);

        

        BoxWithFruits<Apple> box = new BoxWithFruits<>("Apple",arAppleList);


        ArrayList<Orange> arOrangeList = new ArrayList<>();
        Orange[] orange;
        arOrangeList.add(orange[0]);
        arOrangeList.add(orange[1]);
        arOrangeList.add(orange[2]);
        arOrangeList.add(orange[3]);
        arOrangeList.add(orange[4]);
        arOrangeList.add(orange[5]);
        arOrangeList.add(orange[6]);
        arOrangeList.add(orange[7]);

        BoxWithFruits<Orange> box = new BoxWithFruits<>("Orange",arOrangeList);
    }


}

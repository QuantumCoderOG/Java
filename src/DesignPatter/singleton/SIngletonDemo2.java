package src.DesignPatter.singleton;

public class SIngletonDemo2 {
    public static void main(String[] args) {

        SingletonWithObject singleton = SingletonWithObject.getInstance(26,"Sushant");
        System.out.println(singleton.toString());
        System.out.println(singleton.hashCode());
        singleton.updateValues(28,"Sushant");
        System.out.println(singleton.hashCode());
        SingletonWithObject singleton1 = SingletonWithObject.getInstance(2,"Sushant");
        System.out.println(singleton1.hashCode());

    }
}

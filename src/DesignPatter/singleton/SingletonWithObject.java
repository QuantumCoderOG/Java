package src.DesignPatter.singleton;

import java.util.Objects;

public class SingletonWithObject {
    private  Integer age;
    private  String name;

    private static SingletonWithObject instance;

    private SingletonWithObject(Integer age ,String name){
        this.age =age;
        this.name=name;
    }

    public static  SingletonWithObject getInstance(Integer age, String name){
        if(instance==null){
            instance = new SingletonWithObject(age,name);
        }
        return instance;
    }

    public  void  updateValues(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SingletonWithObject singleton = (SingletonWithObject) o;
        return Objects.equals(age, singleton.age) && Objects.equals(name, singleton.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "SingletonWithObject{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

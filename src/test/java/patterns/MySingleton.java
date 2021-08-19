package patterns;

public class MySingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
        singleton.managerRecruiter = "Петр Котиков";
        System.out.println(singleton1.managerRecruiter);
        System.out.println("//////////////////////////////////////////////////");

        SingletonEnum singletonEnum = SingletonEnum.MANAGER_RECRUITER;
        SingletonEnum singletonEnum1 = SingletonEnum.MANAGER_RECRUITER;
        System.out.println(singletonEnum.hashCode());
        System.out.println(singletonEnum1.hashCode());
        System.out.println(singletonEnum.hello());
    }
}

class Singleton {
    String managerRecruiter;
    private static Singleton instance;
    private  Singleton() {
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

enum SingletonEnum {
    MANAGER_RECRUITER;

    public String hello() {
        return "Singleton from enum";
    }
}

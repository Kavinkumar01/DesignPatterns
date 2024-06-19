package Singleton.FirstForm;

public class SingletonWithInitialization {
    private static SingletonWithInitialization singletonObj=new SingletonWithInitialization();

    private SingletonWithInitialization(){

    }

    public static SingletonWithInitialization getInstance(){
        return singletonObj;
    }


}

package Singleton.SecondForm;

public class SingletonLazyLoading {
    private static SingletonLazyLoading singletonObj;

    private SingletonLazyLoading(){

    }

    public static SingletonLazyLoading getInstance(){
        if(singletonObj==null){
            singletonObj=new SingletonLazyLoading();
        }
        return singletonObj;
    }
}

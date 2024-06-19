package Singleton.thirdForm;

public class SingletonThreadSafe {
    private static SingletonThreadSafe singletonObj;

    private SingletonThreadSafe(){

    }

    public static SingletonThreadSafe getInstance(){
        synchronized (SingletonThreadSafe.class){
            if(singletonObj==null){
                singletonObj=new SingletonThreadSafe();
            }
            return singletonObj;
        }
    }
}

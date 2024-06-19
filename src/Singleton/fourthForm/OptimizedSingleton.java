package Singleton.fourthForm;

public class OptimizedSingleton {
    private static volatile OptimizedSingleton singletonObj;
    //As volatile objects are read directly from main memory we can use temp variable to improve performance
    private static OptimizedSingleton temp;

    private OptimizedSingleton(){

    }

    public static OptimizedSingleton getInstance(){
        temp=singletonObj;//null//t1  t2-null
        if(temp==null) {//t1-null //t2-null
            synchronized (OptimizedSingleton.class) {
                //If we don't check this again thread 1 might have created an object and based on temp value the another object will be created
                temp=singletonObj;//t1=null //t2=singletonClass
                if (temp == null) {
                    singletonObj = new OptimizedSingleton();
                }

            }
        }
        return singletonObj;
    }
}

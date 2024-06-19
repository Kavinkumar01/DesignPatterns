package Singleton;

import Singleton.FirstForm.SingletonWithInitialization;
import Singleton.SecondForm.SingletonLazyLoading;
import Singleton.fourthForm.OptimizedSingleton;
import Singleton.thirdForm.SingletonThreadSafe;

public class SingletonMain {
    public static void main(String[] args) {
        //Basic Pesudo code for Singleton Design pattern
        /*
        Create a class(not final)
        Make as private static variable of the class
        Make the constructor private
        Create a static method which will be the only access point for creating object
        which will return the same object whenever called.
         */

        /*
        Usage:
        In an application we will have multiple DB connection if multiple objects are created for each DB connections
        it will be hectic and memory intensive, So singleton is the solution for it.
         */

        //The issue with singleton with Initialization is it creates object when the class is loaded and it is memory
        SingletonWithInitialization singletonObj= SingletonWithInitialization.getInstance();
        SingletonWithInitialization singletonObj2= SingletonWithInitialization.getInstance();
        System.out.println(singletonObj2.equals(singletonObj));

        //The issue with singleton LazyLoading is it is not thread safe and when two threads access try to create object it will be possible
        SingletonLazyLoading singletonlazyLoadingObj= SingletonLazyLoading.getInstance();
        SingletonLazyLoading singletonlazyLoadingObj2= SingletonLazyLoading.getInstance();
        System.out.println(singletonlazyLoadingObj2.equals(singletonlazyLoadingObj));

        //The issue with below is the static object may be read differently by different threads and we can improve this by using volatile keyword also performance can be improved by double checking
        SingletonThreadSafe singletonThreadSafe= SingletonThreadSafe.getInstance();
        SingletonThreadSafe singletonThreadSafe2= SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe2.equals(singletonThreadSafe));

        //The below is the final and optimized singleton object
        OptimizedSingleton optimizedSingleton= OptimizedSingleton.getInstance();
        OptimizedSingleton optimizedSingleton2= OptimizedSingleton.getInstance();
        System.out.println(optimizedSingleton2.equals(optimizedSingleton));
    }
}

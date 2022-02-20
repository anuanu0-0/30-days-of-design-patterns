package com.anuanu00.Singleton;

public class ThreadSafeSingleton {
    // Reduces performance but works for multithreaded environment
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if(instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    // Double checked locking mechanism
    // Avoids extra overhead
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if(instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}

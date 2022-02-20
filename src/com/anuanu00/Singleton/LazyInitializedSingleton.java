package com.anuanu00.Singleton;

public class LazyInitializedSingleton {
    // Works good for single threaded environment
    // Not thread safe
    // Can use synchronized keyword
    private static LazyInitializedSingleton instance;
    private LazyInitializedSingleton() {}
    public static LazyInitializedSingleton getInstance() {
        if(instance==null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}

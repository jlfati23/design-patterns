package org.jl.singleton;

//DCL stands for Double-Checked Locking
public class LazyRegistryDCL {

    private LazyRegistryDCL() {
    }

    private static volatile LazyRegistryDCL instance;

    public static LazyRegistryDCL getInstance() {
        if (instance == null) {
            synchronized (LazyRegistryDCL.class) {
                if (instance == null) {
                    instance = new LazyRegistryDCL();

                }
            }
        }
        return instance;
    }
}

package org.jl.singleton;

public class LazyRegistryIODH {
    private LazyRegistryIODH() {
        System.out.println("This constructor is called");
    }

    private static class LazyRegistryIODHHolder {
        private static final LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance() {
        return LazyRegistryIODHHolder.INSTANCE;
    }
}

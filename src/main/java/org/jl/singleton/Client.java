package org.jl.singleton;

public class Client {
    public static void main(String[] args) {
        EagerRegistry instance1 = EagerRegistry.getInstance();
        EagerRegistry instance2 = EagerRegistry.getInstance();
        System.out.println(instance1 == instance2);

        LazyRegistryDCL lazyInstance1 = LazyRegistryDCL.getInstance();
        LazyRegistryDCL lazyInstance2 = LazyRegistryDCL.getInstance();
        System.out.println(lazyInstance1 == lazyInstance2);

        //the constructor is called only once
        LazyRegistryIODH lazyRegistryIODH = LazyRegistryIODH.getInstance();
        LazyRegistryIODH lazyRegistryIODH1 = LazyRegistryIODH.getInstance();
        LazyRegistryIODH lazyRegistryIODH2 = LazyRegistryIODH.getInstance();

        EnumRegistry enumRegistry = EnumRegistry.INSTANCE;
        enumRegistry.myMethod();
    }
}

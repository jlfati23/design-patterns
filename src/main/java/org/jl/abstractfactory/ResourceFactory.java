package org.jl.abstractfactory;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {



    Storage createStorage(int capacityInMib);

    Instance createInstance(Instance.Capacity capacity);

}

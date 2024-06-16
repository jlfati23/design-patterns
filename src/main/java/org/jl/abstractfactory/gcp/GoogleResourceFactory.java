package org.jl.abstractfactory.gcp;


import org.jl.abstractfactory.Instance;
import org.jl.abstractfactory.ResourceFactory;
import org.jl.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Storage createStorage(int capacityInMib) {
        return new GoogleCloudStorage(capacityInMib);
    }

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }
}

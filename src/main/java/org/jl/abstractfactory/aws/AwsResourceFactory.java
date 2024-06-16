package org.jl.abstractfactory.aws;

import org.jl.abstractfactory.Instance;
import org.jl.abstractfactory.ResourceFactory;
import org.jl.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {


    @Override
    public Storage createStorage(int capacityInMib) {
        return new S3Storage(capacityInMib);
    }

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }
}

package org.jl.abstractfactory;


import org.jl.abstractfactory.aws.AwsResourceFactory;

public class Client {

    public static void main(String[] args) {
        AwsResourceFactory factory = new AwsResourceFactory();
        Instance instance = factory.createInstance(Instance.Capacity.large);
        instance.attachStorage(factory.createStorage(10));
        System.out.println(instance);
        instance.start();
        instance.stop();
    }

}

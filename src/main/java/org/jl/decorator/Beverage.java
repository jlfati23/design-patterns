package org.jl.decorator;

public abstract class Beverage {

    String description = "Unknown Beverage";
    Size size = Size.TALL;
    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public enum Size {TALL, GRANDE, VENT};

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return size;
    }
}

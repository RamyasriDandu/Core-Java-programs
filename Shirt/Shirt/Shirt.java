package com.assessment;

public class Shirt {
	
    float collarSize;
    float length;
    String material;

 


    //default con
    public Shirt() {
        collarSize = 0.0f;
        length = 0.0f;
        material = "Cotton";    }

 

    //parameter con
    public Shirt(float collarSize, float length, String material) {
        super();
        this.collarSize = collarSize;
        this.length = length;
        this.material = material;
    }

 

    //getters & setters

 

    public float getCollarSize() {
        return collarSize;
    }
    public void setCollarSize(float collarSize) {
        this.collarSize = collarSize;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

 

    //displayDetails(): 
    public String displayDetails() {
        return "Shirt [collarSize=" + collarSize + ", length=" + length + ", material=" + material + "]";
    }

 

}
 












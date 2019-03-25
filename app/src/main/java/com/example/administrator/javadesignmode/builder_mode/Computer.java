package com.example.administrator.javadesignmode.builder_mode;

/**
 * 产品抽象类，表明产品具有的所有属性
 */
public abstract class Computer {

    int mCPUCore = 1;
    int mRamSize = 0;
    String mOS = "Dos";

    public abstract void setCPUCore(int mCPUCore);
    public abstract void setRamSize(int mRamSize);
    public abstract void setOS(String mOS);

    @Override
    public String toString() {
        return "\ncpuCore:"+mCPUCore+"\nramSize:"+mRamSize+"\nos:"+mOS;
    }
}

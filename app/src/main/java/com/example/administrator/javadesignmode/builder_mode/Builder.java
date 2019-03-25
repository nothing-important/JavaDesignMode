package com.example.administrator.javadesignmode.builder_mode;


/**
 * builder抽象类
 */
public abstract class Builder {

    public abstract Builder buildCPU(int cpu);
    public abstract Builder buildRam(int ram);
    public abstract Builder buildOS(String os);

    public abstract Computer create();

}

package com.example.administrator.javadesignmode.builder_mode;

public class TestBuilder {

    public static void main(String [] args){
        Builder builder = new AppleComputerBuilder();
        AppleComputer appleComputer = (AppleComputer) builder.buildCPU(8)
                .buildRam(1204)
                .buildOS("doc")
                .create();
        System.out.print(appleComputer.toString());
    }

}

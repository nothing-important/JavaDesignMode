package com.example.administrator.javadesignmode.builder_mode;

import android.os.Build;

/**
 * 具体Builder
 */
public class AppleComputerBuilder extends Builder {

    private Computer computer = new AppleComputer();

    @Override
    public Builder buildCPU(int cpu) {
        computer.setCPUCore(cpu);
        return this;
    }

    @Override
    public Builder buildRam(int ram) {
        computer.setRamSize(ram);
        return this;
    }

    @Override
    public Builder buildOS(String os) {
        computer.setOS(os);
        return this;
    }

    @Override
    public Computer create() {
        return computer;
    }
}

package com.example.administrator.javadesignmode.builder_mode;

/**
 * 具体产品
 */
public class AppleComputer extends Computer {

    AppleComputer(){}

    @Override
    public void setCPUCore(int mCPUCore) {
        super.mCPUCore = mCPUCore;
    }

    @Override
    public void setRamSize(int mRamSize) {
        super.mRamSize = mRamSize;
    }

    @Override
    public void setOS(String mOS) {
        super.mOS = mOS;
    }
}

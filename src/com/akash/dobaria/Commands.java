package com.akash.dobaria;

public abstract class Commands {
    private VirtualMachine virtualMachineImage;

    public Commands(VirtualMachine anImage){
        this.virtualMachineImage = anImage;
    }

    public abstract void execute(Instruction instruction);
}

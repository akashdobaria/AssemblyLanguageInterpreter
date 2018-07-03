package com.akash.dobaria;

import java.util.HashMap;

public class VirtualMachine {
    private MemoryBlock[] virtualMemory;
    private HashMap<String, Byte> symbolTable;
    private int registerA;
    private int registerB;
    private byte programCounter;
    private boolean zeroResultBit;
    private boolean overflowBit;

    public VirtualMachine(){
        virtualMemory = new MemoryBlock[256];
        symbolTable = new HashMap<String, Byte>();
        registerA = 0;
        registerB = 0;
        programCounter = 0;
        zeroResultBit = false;
        overflowBit = false;
    }

    public int getRegisterA() {
        return registerA;
    }

    public int getRegisterB() {
        return registerB;
    }

    public byte getProgramCounter() {
        return programCounter;
    }

    public boolean getZeroResultBit() {
        return zeroResultBit;
    }

    public boolean getOverflowBit() {
        return overflowBit;
    }

    public int getIndex(String symbol){
        if(!symbolTable.containsKey(symbol)) return -1;
        return symbolTable.get(symbol);
    }

    public MemoryBlock getMemoryatIndex(int index){
        if(index<0 || index>virtualMemory.length) return null;
        return virtualMemory[index];
    }

    public void setRegisterA(int registerA) {
        this.registerA = registerA;
    }

    public void setRegisterB(int registerB) {
        this.registerB = registerB;
    }

    public void setProgramCounter(byte programCounter) {
        this.programCounter = programCounter;
    }

    public void setZeroResultBit(boolean zeroResultBit) {
        this.zeroResultBit = zeroResultBit;
    }

    public void setOverflowBit(boolean overflowBit) {
        this.overflowBit = overflowBit;
    }

    public void addSymbol(String symbol, byte index) {
        this.symbolTable.put(symbol,index);
    }

    public void storeInMemory(MemoryBlock ablock, int index){
        this.virtualMemory[index] = ablock;
    }
}

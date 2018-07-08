package com.akash.dobaria;

enum TYPE{
    NULL, INSTRUCTION, VALUE;
}

public class MemoryBlock {
    private int data;
    private String instruction;
    private TYPE dataType;

    public MemoryBlock(){
        data = 0;
        instruction = null;
        dataType = TYPE.NULL;
    }

    public MemoryBlock(int aNumber){
        data = aNumber;
        instruction = null;
        dataType = TYPE.VALUE;
    }

    public MemoryBlock(String anInstruction){
        data = -1;
        instruction = anInstruction;
        dataType = TYPE.INSTRUCTION;
    }

    public int getData() {
        return data;
    }

    public String getInstruction() {
        return instruction;
    }

    public TYPE getDataType() {
        return dataType;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public void setDataType(TYPE dataType) {
        this.dataType = dataType;
    }
}

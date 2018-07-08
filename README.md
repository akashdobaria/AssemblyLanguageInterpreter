# AssemblyLanguageInterpreter

<b><u> The project is still in progress!! </u></b>

This repository is to simulate an Assembly Language Interpreter. 

Right now the project supports following commands:

<b>DEC <i>aSymbol</i></b> - Declares a symbolic variable consisting of a single letter (e.g., X). The variable is stored at the memory location of this instruction.<br>
<b>LDA <i>aSymbol</i></b> - Loads byte at data memory address of symbol into the accumulator. <br>
<b>LDB <i>aSymbol</i></b> - Loads byte at data memory address symbol into B. <br>
<b>LDI <i>aValue</i></b> - Loads the integer value into the accumulator register. The value could be negative but must be in the range of 30-bit 2's complement numbers. <br>
<b>ST <i>aSymbol</i></b> - Stores content of accumulator into data memory at address of symbol. <br>
<b>XCH</b> Exchanges the content registers A and B. <br>
<b>JMP <i>aValue</i></b> - Transfers control to instruction at address number in program memory. <br>
<b>JZS <i>aValue</i></b> - Transfers control to instruction at address number if the zero-result bit is set. <br>
<b>JVS <i>aValue</i></b> - Transfers control to instruction at address number if the overflow bit is set. <br>
<b>ADD </b> - Adds the content of registers A and B. The sum is stored in A. The overflow and zero-result bits are set or cleared as needed. <br>
<b>HLT</b> - Terminates program execution. <br>

The project also implements Singleton design pattern for virtual machine and Command design pattern for executing the instructions.

package rnd.mate00.codewars;

import java.util.Stack;

/**
 * https://www.codewars.com/kata/my-smallest-code-interpreter-aka-brainf-star-star-k/train/java
 *
 */
public class BrainLuck {

    private char[] mem;

    private char[] code;

    public BrainLuck(String code) {
        mem = new char[512];
        initMemoryBlock();
        this.code = code.toCharArray();
        System.out.println("Loaded code: " + code);
    }

    public String process(String input) {
        System.out.println("Processing input " + input);
        char[] inputs = input.toCharArray();
        StringBuilder console = new StringBuilder();

        int ptr = 0;
        int inNo = 0;
        Stack<Integer> currentLoopIndex = new Stack<>();
        for (int c = 0; c < code.length; c++) {
            char instruction = code[c];
            System.out.println(String.format("code[%d] - %s, mem - %s (%d)", c, instruction, mem[0], (int) mem[0]));
            for (char z : mem) {
                System.out.print((int)z + "|");
            }
            System.out.println();
            switch (instruction) {
                case '>':
                    ptr++;
                    break;
                case '<':
                    ptr--;
                    break;
                case '+':
                    if (mem[ptr] == (char) 255) {
                        mem[ptr] = 0;
                    } else {
                        mem[ptr]++;
                    }
                    break;
                case '-':
                    if (mem[ptr] == 0) {
                        mem[ptr] = (char) 255;
                    } else {
                        mem[ptr]--;
                    }
                    break;
                case '.':
                    console.append(mem[ptr]);
                    break;
                case ',':
                    if (inNo < inputs.length) {
                        mem[ptr] = inputs[inNo++];
                    }
                    break;
                case '[':
                    currentLoopIndex.push(c);
//                    if (mem[ptr] != 0) {
//                        continue;
//                    }
                    break;
                case ']':
                    if (mem[ptr] != 0) {
                        c = currentLoopIndex.peek();
                    } else {
                        currentLoopIndex.pop();
                    }
                    break;
            }
        }

        return console.toString();
    }

    private void initMemoryBlock() {
        for (int i = 0; i < mem.length; i++) {
            mem[i] = 0;
        }
    }

    public char[] getMem() {
        return mem;
    }

    public void setMem(char[] mem) {
        this.mem = mem;
    }
}

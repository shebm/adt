/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author Shebzy
 */
public class Stack {
   
    private int[] stack = new int[10];
    private int numItems = 0;
    
    public void push(int i) {
        if (numItems < stack.length) {
            this.stack[0] = i;
            expandArray();
        }
    }
    
    public int pop() {
        return this.stack[0];
        for (int i = 0; i < stack.length(); i++) {
          tempStack[i - 1] =   
        }
    }
    

public void expandArray(); {
int[] newStack = new int[numItems + 1];
for(int i =0; i < numItems; i++) {
    newStack[i] = stack[i];
    
}

}
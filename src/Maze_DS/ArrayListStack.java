/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;
import DataStructures.EmptyCollectionException;
import DataStructures.StackADT;
import java.util.ArrayList;

/**
 *
 * @author subhanmangi
 */
public class ArrayListStack<T> implements StackADT {
    
    ArrayList<T> stack;
    
    int count;
    
    ArrayListStack(){
        stack = new ArrayList();
        count=0;
    }
    

    @Override
    public void push(Object element) {
        stack.add((T)element);
        count++;
    }

    @Override
    public Object pop() throws EmptyCollectionException {
        
        if(count==0){
            return null;
        }
        
        Object Temp = stack.get(count-1);
        stack.remove(count-1);
        count--;
        return Temp;
    }

    @Override
    public Object peek() throws EmptyCollectionException {
        
        if(count==0){
            return null;
        }
    return stack.get(count-1);
    }

   

    @Override
    public boolean isEmpty() {
        
        if(count==0){
            return false;
        }
        else return true;
        }

    @Override
    public int size() {
    return count;
    }

    @Override
    public String toString() {
        return "ArrayListStack{" + "stack=" + stack + ", count=" + count + '}';
    }
    
    
    
    
    
    
}

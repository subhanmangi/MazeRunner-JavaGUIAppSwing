/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;

/**
 *
 * @author subhanmangi
 */
public class TestMain {
    
    public static void main(String[] args) throws EmptyCollectionException{
        ArrayListStack als = new ArrayListStack();
        Object o = new Object();
        als.push(o);
        als.push(new Object());
        als.pop();
          als.pop();
        System.out.println(als.toString());
    }
    
}

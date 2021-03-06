package org.yaosheng.algorithm.Linked;

import org.yaosheng.algorithm.Data_Structures.Stack;

/**
 * Created by yaosheng on 2022/6/13.
 * 使用链表实现栈
 */
public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> list;

    public LinkedListStack(){
        list = new LinkedList<> ();
    }

    @Override
    public int getSize(){
        return list.getSize ();
    }

    @Override
    public boolean isEmpty(){
        return list.isEmpty ();
    }

    @Override
    public void push(E e){
        list.addFirst (e);
    }

    @Override
    public E pop(){
        return list.removeFirst ();
    }

    @Override
    public E peek(){
        return list.getFirst ();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder ();
        res.append ("stack: top ");
        res.append (list);
        return res.toString ();
    }
}

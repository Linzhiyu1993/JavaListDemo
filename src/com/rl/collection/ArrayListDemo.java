package com.rl.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args)
    {
    	method();
    }
    public static void method()
    {
    	//������ֻ����洢�ַ�������������
    	List<String> a1=new ArrayList<String>();
    	a1.add("��ͬѧ");
    	a1.add("˾��ͬѧ");
    	a1.add("����ͬѧ");
    	Iterator<String> iter=a1.iterator();
    	while(iter.hasNext())
    	{
    		String str=iter.next();
    		System.out.println(str);
    	}
    }
}

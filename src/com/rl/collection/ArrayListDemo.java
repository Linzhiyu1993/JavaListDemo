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
    	//集合中只允许存储字符串的数据类型
    	List<String> a1=new ArrayList<String>();
    	a1.add("张同学");
    	a1.add("司马同学");
    	a1.add("东方同学");
    	Iterator<String> iter=a1.iterator();
    	while(iter.hasNext())
    	{
    		String str=iter.next();
    		System.out.println(str);
    	}
    }
}

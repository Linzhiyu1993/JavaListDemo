package com.rl.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListDemo1 {
  public static void main(String[] args)
  {
	  List list=new ArrayList();
	  list.add("��ͬѧ");
	  list.add("��ͬѧ");
	  list.add("��ͬѧ");
	  ListIterator iter=list.listIterator();
	  while(iter.hasNext())
	  {
		  String result=(String)(iter.next());
		  System.out.println(result);
	  }
	  String str1=(String)iter.previous();
	  System.out.println(str1);
	  
	  Integer pIndex=iter.previousIndex();
	  System.out.println(pIndex);
	  
	  
	  
  }
}

package com.rl.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ListDemo2 {
  public static void main(String[] args)
  {
	  List list=new ArrayList();
	  list.add("李同学");
	  list.add("张同学");
	  list.add("王同学");
	  ListIterator iter=list.listIterator();
	  
	  while(iter.hasNext()) 
	  {
		  String result=(String)iter.next();
		  if("张同学".equals(result))
		  {
			  //新添加的数据不会被当前的这次循环遍历出来
			  iter.add("司马同学");
		  }
		  System.out.println(result);
      }  
	  System.out.println(list);

//	  Iterator iter=list.iterator();
//	  while(iter.hasNext()) {
//		  String result=(String)iter.next();
//		  list.add("shdkshude");
//		  System.out.println(result);
//	  }
	  /**
	   * 存在并发访问集合时建议使用for
	   */
	  for(int i =0;i<list.size();i++)
	  {
		  String result=(String)list.get(i);
		  if("张同学".equals(result))
		  {
			  //新添加的数据会被当前的这次循环遍历出来
			  list.add("司马同学");
		  }
		  System.out.println(result);
	  }
  }
}

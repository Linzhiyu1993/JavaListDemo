package com.rl.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ListDemo2 {
  public static void main(String[] args)
  {
	  List list=new ArrayList();
	  list.add("��ͬѧ");
	  list.add("��ͬѧ");
	  list.add("��ͬѧ");
	  ListIterator iter=list.listIterator();
	  
	  while(iter.hasNext()) 
	  {
		  String result=(String)iter.next();
		  if("��ͬѧ".equals(result))
		  {
			  //����ӵ����ݲ��ᱻ��ǰ�����ѭ����������
			  iter.add("˾��ͬѧ");
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
	   * ���ڲ������ʼ���ʱ����ʹ��for
	   */
	  for(int i =0;i<list.size();i++)
	  {
		  String result=(String)list.get(i);
		  if("��ͬѧ".equals(result))
		  {
			  //����ӵ����ݻᱻ��ǰ�����ѭ����������
			  list.add("˾��ͬѧ");
		  }
		  System.out.println(result);
	  }
  }
}

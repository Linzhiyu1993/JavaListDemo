package com.rl.collection;

public class ArrayDemo {
   public static void main(String[] args)
   {
	   Student[] students=new Student[10];
	   for(int i=0;i<10;i++)
	   {
		   Student s=new Student("ÕÅÈý"+i,20);
		   students[i]=s;
	   }
	   printArray(students);
   }
   public static void printArray(Student[] students)
   {
	   for(int i=0;i<students.length;i++) {
		   System.out.println(students[i].toString());
	   }
   }
}

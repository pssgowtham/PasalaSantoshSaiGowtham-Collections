package com.epam.collection;

public class App 
{
    public static void main( String[] args )
    {
		Clist<Integer> list = new Clist<>();
		 
	    //Add elements
	    list.add(100);
	    list.add(101);
	    list.add(102);
	    list.add(103);
	    list.add(104);
	    list.add(105);
	    list.add(106);
	    list.add(107);
	    list.add(108);
	    list.add(109);
	    list.add(110);
	    list.add(111);
	    System.out.println(list);
	     
	    //Remove elements from index
	    list.remove(2);
	    System.out.println(list);
	     
	    //Get element with index
        System.out.println(list.get(0));
        System.out.println(list.get(1));
	 
	    //List Size
	    System.out.println(list.size());
    }
}

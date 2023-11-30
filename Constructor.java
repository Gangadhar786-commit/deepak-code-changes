package com.sumit.practice;

public class Constructor {
     String name;
     int empid;  
    	Constructor(String name,int empid)
    	{
    		this.name=name;
    		this.empid=empid;
    	}
    	
	public static void main(String[] args) {
		
  Constructor c1=new Constructor("Sumit",101);
  Constructor c2=new Constructor("Anuj",102);
	}

}

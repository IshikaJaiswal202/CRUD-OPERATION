package com.ishika.crud;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception 
  {
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("LIST OF OPERATION : ");
		System.out.println("1.ADD");
		System.out.println("2.DELETE");
		System.out.println("3.UPDATE");
		System.out.println("4.LIST");
		System.out.println("5.EXIT");
		System.out.println("Enter Your Choice : ");
		int key=sc.nextInt();
		switch (key) {
		case 1:
			   System.out.println("ENTER YOUR ID : ");
			   int id=sc.nextInt();
			   sc.nextLine();
			   System.out.println("ENTER YOUR NAME  : ");
			   String name=sc.nextLine();
			   System.out.println("ENTER YOUR AGE  : ");
			   int age=sc.nextInt();
			   System.out.println("ENTER YOUR ADDRESS  : ");
			   String address=sc.next();
			   Crud.insertValue(id, name, age, address);
			break;
		case 2:
			  System.out.println("ENTER YOUR ID : ");
			  int Id=sc.nextInt();
			  Crud.deleteValue(Id);
			break;
		case 3:
			  System.out.println("ENTER YOUR ID : ");
			  int ids=sc.nextInt();
			  sc.nextLine();
			  System.out.println("ENTER YOUR NAME  : ");
			   String Name=sc.nextLine();
			  Crud.updateValue(ids, Name);
			break;
		case 4:
			Crud.listValue();
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("INVAILD CHOICE ");
			break;
		}
	}
  }
}

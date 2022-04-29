package myproject;

public class TheClassProject {
	//*********************This is another class which is extended by main class******************
		//save this class  as  GrossaryManage
		//package practice2;

		import java.util.ArrayList;
		import java.util.ListIterator;
		import java.util.Scanner;
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;
		import java.io.ObjectInputStream;
		import java.io.ObjectOutputStream;
		import java.io.Serializable;
		import java.util.Scanner;

		class Product1 implements Serializable {
			String item;
			int qty=0;
			double price;
			public Product1(String item, int qty, double price) {
				super();
				this.item = item;
				this.qty = qty;
				this.price = price;
			}
			@Override
			public String toString() {
				
				return item+"                "+qty+"                 "+price;
			}
			
		}
		
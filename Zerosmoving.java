package com.bufferpollproject;
import java.util.Scanner;


public class Zerosmoving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=in.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the element");
         for(int i=0;i<size;i++) {
        	 arr[i]=in.nextInt();
         }
         int index=0;
         for(int i=0;i<size;i++) {
        	 if(arr[i]!=0) {
        		 arr[index]=arr[i];
        		 index++;
        	 }
         }
         for(int i=index;i<size;i++) {
        	 arr[i]=0;
         }System.out.println("The result array is");
         for(int i=0;i<size;i++)
         {
        	System.out.print(arr[i]+" ");
         }
         in.close();
	}
}
         
	



package com.epam.task4;
/*PROBLEM STATEMENT
Find the middle of a given linked list in C# or Java
_____________________________________________________

Given a singly linked list, find the middle of the linked list. 
For example, if given linked list is 1->2->3->4->5 then output should be 3.

If there are even nodes, then there would be two middle nodes, we need to print the second middle element. 
For example, if given linked list is 1->2->3->4->5->6 then output should be 4. 

 */
import java.util.Scanner; 
public class Middle_Element 
{
	Node head;  // head of list 
	
    class Node //Linked list Node
    { 
        int data; 
        Node next; 
        Node(int d) 
        {
        	data = d; 
        	next = null; 
        } 
    } 
	 public void append(int new_data) 
	    { 
		 
	        Node new_node = new Node(new_data); //Allocate the Node & Put in the data  Set next as null
	  
	        if (head == null) // If the Linked List is empty, then make new node as head
	        { 
	            head = new Node(new_data); 
	            return ; 
	        } 
	  
	        new_node.next = null; //This new node is going to be the last node, so  make next of it as null
	        Node last = head;  	  //assigning head to last
	        while (last.next != null) //iterating it till it reaches the end of the list
	            last = last.next; 
	  
	        /* After reaching the last node change the next of last node */
	        last.next = new_node; 
	        
	     
	        return ; 
	    } 
	 public void display(int middle) //function to display the middle element
	 { 
	        Node temperory_node = head; //assigning head to tnode
	        int h=0;
	        while (temperory_node != null) //iterating it till reaches the mid element

	        { 
	        	h++;
	        	if(h==middle)
	        	{
	        		System.out.print(temperory_node.data); //printing the middle value
	        		break;	        	
	        	}
	        	temperory_node = temperory_node.next; //Assigning next node to tnode
	        } 
	  } 
	 

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Middle_Element middle_element=new Middle_Element();//creating object for class Middle_Element
		   		int count=0;//initializing Count to 0
		        Scanner sc=new Scanner(System.in);
		        int no_of_nodes=sc.nextInt();//reading no of nodes
		        for(long i=0;i<no_of_nodes;i++)
		        {
		        	int node=sc.nextInt();//reading each node
		        	count++;
		        	middle_element.append(node);//passing the node to the append function
		        }
		        int middle=count/2+1;
		        middle_element.display(middle);//Passing middle variable to dispaly function it will find out the middle element
		        
		        sc.close();	        
	}
	

}

package bt;

import java.util.*;
import java.io.*;
class Node{
	int data;
	Node left,right;
	Node(int key){
		data=key;
		left=right=null;
	}
	
}

class evenodddiff{
	  int difference(Node root) {
		if(root==null)
			return 0;
		int level=0;
		int evensum=0;
		int oddsum=0;
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(q.size()!=0) {
			int size=q.size();
			level++;
			while(size>0) {
				Node temp=q.remove();
				if(level%2==0) {
					evensum+=temp.data;
				}
				else {
					oddsum+=temp.data;
				}
				if(temp.left!=null) {
					q.add(temp.left);
				}
				if(temp.right!=null) {
					q.add(temp.right);
				}
				size--;
			}
		}
		return oddsum-evensum;
	}
}
   class prg2{
	public static void main(String []args) {
	   Node root=new Node(5);
	   root.left=new Node(2);
	   root.right=new Node(1);
	   root.right.left=new Node(3);
	   root.right.right=new Node(6);
	   root.right.left.left=new Node(4);
	   evenodddiff o=new evenodddiff();
		int result=o.difference(root);	
		System.out.println("difference between sum of even level and odd level elements is:"+result);
}
}

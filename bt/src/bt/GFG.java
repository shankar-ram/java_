package bt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
 
class GFG{
 
// Structure of a node
// of an n-ary tree
static class Node
{
    int val;
    ArrayList<Node> children;
 
    public Node(int val) 
    {
        this.val = val;
        this.children = new ArrayList<Node>();
    }
};
 
static class Pair
{
    Node first;
    int second;
 
    public Pair(Node node, int val)
    {
        this.first = node;
        this.second = val;
    }
}
 
// Function to find the difference
// between of sums node values of
// odd and even levels in an N-ary tree
static int evenOddLevelDifference(Node root) 
{
     
    // Store the sums of nodes at
    // even and odd levels
    int evenSum = 0, oddSum = 0;
 
    // Initialize a queue to store
    // pair of node and level
    Queue<Pair> q = new LinkedList<>();
 
    // Push the root into the
    // queue with level 1
    q.add(new Pair(root, 1));
 
    // Iterate all levels
    // of tree are traversed
    while (!q.isEmpty())
    {
         
        // Store the node at the
        // front of the queue
        Pair currNode = q.poll();
 
        // Store the current level
        int currLevel = currNode.second;
 
        // Store the current node value
        int currVal = currNode.first.val;
 
        // If current node
        // level is odd
        if (currLevel % 2 == 1)
         
            // Add to odd sum
            oddSum += currVal;
        else
         
            // Add to even sum
            evenSum += currVal;
 
        // Push all the children of current node
        // with increasing current level by 1
        for(Node child : currNode.first.children) 
        {
            q.add(new Pair(child, currLevel + 1));
        }
    }
 
    // Return the difference
    return (oddSum - evenSum);
}
 
// Driver Code
public static void main(String[] args)
{
     
    // Create the N-ary Tree
    Node root = new Node(4);
    root.children.add(new Node(2));
    root.children.add(new Node(3));
    root.children.add(new Node(-5));
    root.children.get(0).children.add(new Node(-1));
    root.children.get(0).children.add(new Node(3));
    root.children.get(2).children.add(new Node(-2));
    root.children.get(2).children.add(new Node(6));
 
    System.out.println(evenOddLevelDifference(root));
}
}

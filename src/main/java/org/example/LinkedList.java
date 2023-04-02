package org.example;


public class LinkedList {
   private Node head;
   private Node tail;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public void addAtEnding(int val){
        if(head == null){
            head = new Node(val);
            tail = head;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(val);
            tail = current.next;
        }
    }

    public void addAtBeginning(int val){
        if(head == null) {
            head = new Node(val);
            tail = head;
        }else{
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }

    }

    public void insertAtPosition(int val, int position){
        int count = 0;
        Node newNode = new Node(val);
        Node prev = null;
        Node current = head;
        while(current.next!= null){
            prev = current;
            current = current.next;
            count++;
            if(count == position){
                break;
            }
        }
        prev.next = newNode;
        newNode.next = current;
    }
}

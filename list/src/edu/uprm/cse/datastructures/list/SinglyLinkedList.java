package edu.uprm.cse.datastructures.list;

import java.util.Iterator;

public class SinglyLinkedList<E> implements List<E> {
	
	private static class Node<E> {
		private E element;
		private Node<E> next;
		
		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public Node() {
			super();
		}
		
		public E getElement() {
			return element;
		}
		public void setElement(E element) {
			this.element = element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}

		
	}

	private Node<E> header;
	private int currentSize;
	
	public SinglyLinkedList() {
		this.header = new Node<>();
		this.currentSize = 0;
	}
	
	
	@Override
	public int size() {
		return this.currentSize;
	}

	@Override
	public boolean isEmpty() {
		return this.size() == 0;
	}

	@Override
	public boolean isMember(E e) {
		return this.indexOf(e) >= 0;
	}

	@Override
	public int indexOf(E e) {
		int i = 0;
		for (Node<E> temp = this.header.getNext(); temp != null; 
				temp = temp.getNext(), ++i) {
			if (temp.getElement().equals(e)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void add(E e) {
		Node<E> temp = null;
		for (temp = this.header; temp.getNext() != null; temp = temp.getNext()) {
			// do nothing
		}
		Node<E> temp2 = new Node<>(e, null);
		temp.setNext(temp2);
		this.currentSize++;
	}

	@Override
	public void add(E e, int position) {
		// TODO Auto-generated method stub

	}

	@Override
	public E get(int position) {
		
//		for (Node<E> temp = this.header.getNext(); ) {
//			
//		}
		return null;
	}

	
	@Override
	public E remove(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E replace(int position, E newElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		while(!this.isEmpty()) {
			this.remove(0);
		}
	}

	@Override
	public E[] toArray() {
		E[] result = (E[]) new Object[this.size()];
		return result;
	}


	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
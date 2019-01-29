package assign03;

import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class SimplePriorityQueue<E> implements PriorityQueue<E>{
	
	private E[] queue;
	private int queueLength;
	private Comparator<? super E> compare;
	
	@SuppressWarnings("unchecked")
	public SimplePriorityQueue() {
		queue = (E[]) new Object[11];
		queueLength = 0;
		compare = null;
	}
	
	@SuppressWarnings("unchecked")
	public SimplePriorityQueue(Comparator<? super E> comparator) {
		queue = (E[]) new Object[11];
		queueLength = 0;
		compare = comparator;
	}
	
	

	@Override
	public E findMin() throws NoSuchElementException {
		if (queue.length == 0) {
			throw new NoSuchElementException("The queue is empty");
		}
		return queue[queueLength-1];
	}

	@Override
	public E deleteMin() throws NoSuchElementException {
		if (queue.length == 0) {
			throw new NoSuchElementException("The queue is empty");
		}
		queueLength -= 1;
		return queue[queueLength-1];
	}

	@Override
	public void insert(Object E) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAll(Collection<? extends E> coll) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		return queueLength;
	}

	@Override
	public boolean isEmpty() {
		if (queueLength == 0){
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		queueLength = 0;
	}

}

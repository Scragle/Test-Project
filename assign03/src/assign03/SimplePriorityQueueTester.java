package assign03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SimplePriorityQueueTester {
	
	private SimplePriorityQueue<Integer> intQueue;
	private SimplePriorityQueue<String> stringQueue;
	private SimplePriorityQueue<Integer> emptyQueue;
	
	@BeforeEach
	void setUp() {
		intQueue = new SimplePriorityQueue<Integer>();
		ArrayList<Integer> nums = new ArrayList<>();
		for(int i = 1; i < 10; i++) {
			nums.add(i);
		}
		intQueue.insertAll(nums);
		
		emptyQueue = new SimplePriorityQueue<Integer>();
		
		stringQueue = new SimplePriorityQueue<String>();
	}
	
	@Test
	public void findMin() {
		assertEquals((Integer)1,intQueue.findMin());
	}
	
	@Test
	public void deleteMin() {
		assertEquals((Integer)1,intQueue.deleteMin());
		assertEquals((Integer)2,intQueue.deleteMin());
	}
	
	@Test
	public void size() {
		assertEquals(9,intQueue.size());
	}
	
	@Test
	public void isEmpty() {
		assertFalse(intQueue.isEmpty());
		assertTrue(emptyQueue.isEmpty());
		
	}
	
	@Test
	public void clear() {
		assertFalse(intQueue.isEmpty());
		intQueue.clear();
		assertTrue(intQueue.isEmpty());
		
	}
	
	

}

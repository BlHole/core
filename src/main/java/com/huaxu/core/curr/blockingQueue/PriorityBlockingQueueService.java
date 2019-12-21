package com.huaxu.core.curr.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueService {
 
	
	public static void main(String[] args) throws Exception{
		
		
		PriorityBlockingQueue<Task> priorityBlockingQueue = new PriorityBlockingQueue<Task>();
		ArrayBlockingQueue<Task> arrayBlockingQueue = new ArrayBlockingQueue<>(5);

		Task t1 = new Task();
		t1.setId(1);
		t1.setName("id为1");
		Task t2 = new Task();
		t2.setId(2);
		t2.setName("id为2");
		Task t3 = new Task();
		t3.setId(3);
		t3.setName("id为3");

		priorityBlockingQueue.add(t3);
		priorityBlockingQueue.add(t2);
		priorityBlockingQueue.add(t1);

		arrayBlockingQueue.add(t3);
		arrayBlockingQueue.add(t2);
		arrayBlockingQueue.add(t1);

		System.out.println("Priority 容器：" + priorityBlockingQueue);
		System.out.println("Priority 弹出：" + priorityBlockingQueue.take());
		System.out.println("Priority 容器：" + priorityBlockingQueue);

		System.out.println("Array 容器：" + arrayBlockingQueue);
		System.out.println("Array 弹出：" + arrayBlockingQueue.take());
		System.out.println("Array 容器：" + arrayBlockingQueue);
	}
}
class Task implements Comparable<Task>{
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Task{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	@Override
	public int compareTo(Task task) {
		return this.id > task.id ? 1 : (this.id < task.id ? -1 : 0);
	}
}
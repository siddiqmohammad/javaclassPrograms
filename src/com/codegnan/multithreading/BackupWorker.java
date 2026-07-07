package com.codegnan.multithreading;

public class BackupWorker implements Runnable{
	private final String WorkerName;
	
	public BackupWorker(String WorkerName){
		this.WorkerName=WorkerName;
	}

	@Override
	public void run() {
		System.out.println(WorkerName + "Starting work");
		for(int i=1;i<=5;i++) {
			System.out.println(WorkerName + "Processing file back");
			if(i%2==0) {
				System.out.println(WorkerName + "yielding control...");
				Thread.yield();
			}
		}
		System.out.println(WorkerName+ " finished it's Cycle");
		
	}

}

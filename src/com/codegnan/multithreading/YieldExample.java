package com.codegnan.multithreading;

public class YieldExample {
	public static void main(String[] args) {
		BackupWorker backupTask1= new BackupWorker("Backup-Worker- A");
		BackupWorker backupTask2= new BackupWorker("Backup-Worker- B");
		Thread workerA= new Thread(backupTask1);
		Thread workerB =new Thread(backupTask2);
		workerA.setPriority(Thread.NORM_PRIORITY);
		workerB.setPriority(Thread.NORM_PRIORITY); 



	}

}

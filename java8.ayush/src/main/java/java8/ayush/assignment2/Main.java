package java8.ayush.assignment2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ayush.singh
 * 
 * Java Concurrency : Assignment 2
 * 
•	You are working on creating the validation server where you need to execute 100 rules. Simulate this scenario using executor service.
•	Decide on number of threads as number of rules to be executed can vary.
•	Every thread should not take more than 2 sec to execute the rule. if it is taking more then handle it in code
•	Each thread should return boolean to confirm whether rule is exeucted or not
•	For business logic just keep thread. sleep for 1 sec
•	consider your main from where you will be executing and generating threads. 
 * */

class Rule{
	public boolean execRule() {
		return Boolean.TRUE;
	}
}
public class Main {

	public static void createThread(ExecutorService exec,Rule r) throws InterruptedException, ExecutionException {
			long d1 = System.currentTimeMillis();
			Future<Boolean> f = exec.submit(()->{
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
				return r.execRule();
			});
			Thread.sleep(2000);
			long diff = System.currentTimeMillis()-d1;
			if(f.isDone()) {
				if(diff<=2000) {
					System.out.println("Is rule executed : "+f.get()+" time taken to execute task : "+diff);
				}
				else {
					System.out.println("Thread took more time than 2 secs wait time");
				}
			}
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Rule r = new Rule();
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<100;i++) {
			createThread(exec, r);
		}
		exec.shutdown();
	}
}


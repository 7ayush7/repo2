package com.ayush.coding.test;

import java.io.IOException;

class AutoClose implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing down test");
		//throw new Exception("close this");
	}
}

public class NestedTryDemo {

	public static void main(String[] args) throws Exception{
		try(AutoClose a = new AutoClose();){
			System.out.println("Inside Try");
		}
		try{
			try{
				try{
					throw new IOException("throwing from child");
				}
				finally{
					
				}
			}
			finally{
				
			}
		}
		catch(IOException e2){
			System.out.println(e2.getMessage());
			System.out.println("Handled Outside");
		}
		finally{
			
		}
	}
}

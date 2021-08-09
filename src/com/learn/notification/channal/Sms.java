package com.learn.notification.channal;
import com.learn.notification.channal.interf.Notifiable;
public class Sms implements Notifiable {
	@Override
	
 public void send() {
	 System.out.println("SEND SMS TO CUSTOMER");
 }

	

	
}

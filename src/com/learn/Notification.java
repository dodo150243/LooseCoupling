package com.learn;
import com.learn.notification.channal.Sms;
import com.learn.notification.channal.interf.Notifiable;

public class Notification{
	public static void main(String[] args) {
		Sms notification = new Sms();
		((Notifiable) notification).send();
	}
}







	

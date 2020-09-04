package com.learning.ayush.collections.designpattern.behavioraldesignpattern;

import java.util.ArrayList;
import java.util.List;

class Channel {
	String name;
	String title;
	List<Subscriber> list = new ArrayList<>();

	Channel(String name) {
		this.name = name;
	}

	public List<Subscriber> getSubs() {
		return list;
	}

	public void addSub(Subscriber sub) {
		list.add(sub);
	}

	public void uploadVideo(String title) {
		this.title = title;
		notifySubs();
	}

	public void notifySubs() {
		for (Subscriber s : list) {
			s.notification(this.title, this.name);
		}
	}
}

class Subscriber {
	String name;
	List<Channel> chList = new ArrayList<>();

	public Subscriber(String name) {
		this.name = name;
	}

	public void notification(String title, String channel) {
		System.out.println("Hi " + this.name + ", new video title : " + title + " is uploaded by :" + channel);
	}

	public void subscribe(Channel c) {
		chList.add(c);
		c.addSub(this);
	}

	public String toString() {
		return this.name;
	}
}

public class ObserverDesignPatternExample {

	public static void main(String[] args) {
		Channel c1 = new Channel("AyushSinghYT");
		Channel c2 = new Channel("AnimeshSinghYT");

		Subscriber s1 = new Subscriber("user1");
		Subscriber s2 = new Subscriber("user2");
		Subscriber s3 = new Subscriber("user3");
		Subscriber s4 = new Subscriber("user4");

		s1.subscribe(c1);
		s2.subscribe(c1);
		s3.subscribe(c2);
		s4.subscribe(c2);

		c1.uploadVideo("FirstVideo");
		c2.uploadVideo("New Video");

		System.out.println("Subscriber list for Channel :" + c1.name + " is: " + c1.getSubs());
		System.out.println("Subscriber list for Channel :" + c2.name + " is: " + c2.getSubs());

	}
}

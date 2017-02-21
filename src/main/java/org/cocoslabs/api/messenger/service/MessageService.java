package org.cocoslabs.api.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.cocoslabs.api.messenger.model.Message;

public class MessageService {
	
	 public List<Message> getAllMessages()
	 {
		 Message m1 = new Message(1L, "welcome", "XYZ");
		 Message m2 = new Message(2L, "jersey", "ABC");
		 List<Message> list = new ArrayList<>();
		 list.add(m1);
		 list.add(m2);
		 return list;
	 }

}

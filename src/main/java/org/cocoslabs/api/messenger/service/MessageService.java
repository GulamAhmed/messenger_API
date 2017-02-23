package org.cocoslabs.api.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.cocoslabs.api.messenger.database.DatabaseClass;
import org.cocoslabs.api.messenger.model.Message;

public class MessageService {
	//@RolesAllowed("ADMIN")
	
	private Map <Long , Message> messages = DatabaseClass.getMessages();
	
	public MessageService()
	{
		messages.put(1L, new Message(1, "hey","o"));
		messages.put(2L, new Message(1, "goy","p"));
	}
	
	 public List<Message> getAllMessages()
	 {
		/* Message m1 = new Message(1L, "welcome", "XYZ");
		 Message m2 = new Message(2L, "jersey", "ABC");
		 List<Message> list = new ArrayList<>();
		 list.add(m1);
		 list.add(m2);
		 return list;*/
		 
		 return new ArrayList<Message>(messages.values());
	 }

	 /*public Message getMessage(long  messageId)
	 {
		 return messages.get(messageId);
	 }*/

	public Message getMessage(long id) {
		// TODO Auto-generated method stub
		return messages.get(id);
}
}

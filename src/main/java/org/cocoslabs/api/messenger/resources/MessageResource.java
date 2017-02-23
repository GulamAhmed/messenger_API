  package org.cocoslabs.api.messenger.resources;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.cocoslabs.api.messenger.model.Message;
import org.cocoslabs.api.messenger.service.MessageService;

@Path("/messages")
 
public class MessageResource {
	
   MessageService  messageService =  new MessageService();
	
// @RolesAllowed("ADMIN")
 @GET
 @Produces(MediaType.APPLICATION_JSON)
  
	public List<Message> getMessages()
	{
		return messageService.getAllMessages();
	}

	 @Path("/{messageId}")
	 @Produces(MediaType.APPLICATION_XML)
	 @GET
	 public Message getMessage(@PathParam("messageId") long id )
	 {
		 
	 	return messageService.getMessage(id);
	 }
}


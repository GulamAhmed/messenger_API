  package org.cocoslabs.api.messenger.resources;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.cocoslabs.api.messenger.model.Message;
import org.cocoslabs.api.messenger.service.MessageService;

@Path("/messages")
 
public class MessageResource {
	
   MessageService  messageService =  new MessageService();
	
// @RolesAllowed("ADMIN")
 @GET
 @Produces(MediaType.APPLICATION_JSON)
  
	public List<Message> getMessages(@QueryParam("year")int year)
	{
	 if(year > 0)
	 {
		 return messageService.getAllMessagesForYear(year);
	 }
		return messageService.getAllMessages();
	}

	 @Path("/{messageId}")
	 @Produces(MediaType.APPLICATION_JSON)
	 @GET
	 public Message getMessage(@PathParam("messageId") long id )
	 {
		 
	 	return messageService.getMessage(id);
	 }
	 /*@Path("/test")
	 @Produces(MediaType.TEXT_HTML)
	 @GET
	  public String test()
	  {
		 return "<p> HTML form </p>"
		 		+ "<h1> Header test </h1> ";
	  }*/
}


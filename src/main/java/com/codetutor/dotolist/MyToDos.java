package com.codetutor.dotolist;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codetutor.dotolist.model.ToDoItem;
import com.codetutor.dotolist.service.ToDoService;

@Path("todolists")
public class MyToDos {
	
	ToDoService toDoService;
	
	public MyToDos() {
		// TODO Auto-generated constructor stub
		super();
		toDoService = ToDoService.getInstance();
	}
	
	/*@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ToDoItem> getAllToDos(@FormParam("authorEmailId") String authorEmailId){
		return toDoService.getMessages(authorEmailId);
	}*/
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ToDoItem getToDoItems(ToDoItem toDoItem){
		return toDoService.addToDoItem(toDoItem);
	}
}
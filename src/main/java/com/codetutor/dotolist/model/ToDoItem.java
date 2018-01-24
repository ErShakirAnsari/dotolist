package com.codetutor.dotolist.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ToDoItem{
	
	private static int ID_COUNT = 0;

	private long id;
	private String todoString;
	private long date;
	private String place;
	
	private String authorEmailId;
	
	public ToDoItem() {
		super();
	}
	
	public ToDoItem(ToDoItem doItem) {
		this(doItem.todoString, doItem.authorEmailId, doItem.place);
	}
	
	public ToDoItem(String todoString, String authorEmailId,String place) {
		super();
		this.id = ++ID_COUNT;
		this.todoString = todoString;
		this.date = new Date().getTime();
		this.authorEmailId = authorEmailId;
		this.place = place;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTodoString() {
		return todoString;
	}
	public void setTodoString(String todoString) {
		this.todoString = todoString;
	}
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	
	public String getAuthorEmailId() {
		return authorEmailId;
	}
	
	public void setAuthorEmailId(String authorEmailId) {
		this.authorEmailId = authorEmailId;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof ToDoItem) {
			ToDoItem doItem = (ToDoItem) obj;
			if(this.authorEmailId.equals(doItem.authorEmailId) && this.id==doItem.id && this.date==doItem.date && this.todoString.equals(doItem.todoString) && this.place.equals(doItem.place)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (id+""+authorEmailId+todoString+place).hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+this.id+", "+this.todoString+", "+this.date+", "+this.place+", "+this.authorEmailId+")";
	}
}

package com.todo.desc;

public class TodoDesc {
	static int idst = 0;
	int id;
	String title;
	boolean Status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "TodoDesc [id=" + id + ", title=" + title + ", Status=" + Status + "]";
	}

	public TodoDesc(String title) {
		super();
		
		this.title = title;
		this.Status = false;
		this.id = idst;
		idst=idst+1;
	}

	public TodoDesc(boolean Status) {
		super();
		this.Status = Status;
	}

	public TodoDesc(int id, String title) {
		super();
		this.id = id;
		this.title = title;

	}

	public TodoDesc() {
	}

}

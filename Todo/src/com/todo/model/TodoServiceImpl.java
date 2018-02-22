package com.todo.model;

import java.util.Map;

import com.todo.desc.TodoDesc;

public interface TodoServiceImpl {

	public void editTodo(int id, String newTitle);

	public void deleteTodo(int id);

	public void completeTodo(int id);

	public void completeAll();

	public void clearCompleted();

	public void viewAll(String filter);

	public void showKey();

	void addTodo(String title);

}

// -addTodo(title)
// -editTodo(id,newTititle)
// -deleteTodo(id)
// -completeTodo(id)
// -completeAll()
// -clearCompleted()
// -viewAll(filter) ==> filter : all | active | completed
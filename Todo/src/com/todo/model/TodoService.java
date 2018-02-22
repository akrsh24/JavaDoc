package com.todo.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import com.todo.desc.TodoDesc;

public class TodoService implements TodoServiceImpl {

	Map<Integer, TodoDesc> my = new HashMap<Integer, TodoDesc>();
	Map<Integer, TodoDesc> newmap1 = new HashMap<Integer, TodoDesc>();
	Map<Integer, TodoDesc> newmap2 = new HashMap<Integer, TodoDesc>();

	public void addTodo(String title) {

		TodoDesc desc = new TodoDesc(title);
		my.put(desc.getId(), desc);

		// TODO Auto-generated method stub

	}

	@Override
	public void editTodo(int id, String newTitle) {

		TodoDesc desc = new TodoDesc();
		if (my.containsKey(id)) {
			desc = my.get(id);
			desc.setTitle(newTitle);
		} else
			System.out.println("Id not correct");
	}

	@Override
	public void deleteTodo(int id) {

		if (my.containsKey(id)) {
			my.remove(id);
		} else
			System.out.println("Id not correct");
		// TODO Auto-generated method stub

	}

	@Override
	public void completeTodo(int id) {

		TodoDesc desc = new TodoDesc(true);
		if (my.containsKey(id)) {
			my.put(id, desc);
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void completeAll() {

		TodoDesc desc = new TodoDesc(true);
		Set<Integer> keyset = my.keySet();
		for (int key : keyset) {
			my.put(key, desc);
		}

	}

	@Override
	public void clearCompleted() {
		TodoDesc desc;
		Set<Integer> keyset = my.keySet();
		for (int key : keyset) {
			{
				desc = my.get(key);
				if (desc.isStatus() == true)
					my.remove(key);
			}
		}

	}

	@Override
	public void viewAll(String filter) {
		TodoDesc desc;
		Set<Integer> keyset = my.keySet();
		for (int key : keyset) {
			desc = my.get(key);
			if (desc.isStatus() == true) {
				newmap1.put(key, desc);
			} else if(desc.isStatus() == false) {
				newmap2.put(key, desc);
			}
		}

		Iterator<Map.Entry<Integer, TodoDesc>> itr;
		if (filter.equals("active")) {
			itr = newmap1.entrySet().iterator();
			while (itr.hasNext()) {
				Entry<Integer, TodoDesc> entry = itr.next();
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		} else if (filter.equals("inactive")) {
			itr = newmap2.entrySet().iterator();
			while (itr.hasNext()) {
				Entry<Integer, TodoDesc> entry = itr.next();
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		} else {
			itr = my.entrySet().iterator();
			while (itr.hasNext()) {
				Entry<Integer, TodoDesc> entry = itr.next();
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		}
	}

	public void showKey() {
		Set<Integer> keyset = my.keySet();
		for (int key : keyset) {
			System.out.println(key);
		}
	}
}


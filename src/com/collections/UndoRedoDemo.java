package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class UndoRedoDemo {

	public static void main(String[] args) {
		Deque<String> undoStack=new ArrayDeque<>();
		Deque<String> redoStack=new ArrayDeque<>();
		
		undoStack.push("Type A");
		undoStack.push("Type b");
		undoStack.push("Type c");
		
		System.out.println("Undo Stack: "+undoStack);
		
		//undo operation
		String action=undoStack.pop();
		redoStack.push(action);
		
		System.out.println("After undo: "+undoStack);
		System.out.println("After redo: "+redoStack);
		
		//redo
		action=redoStack.pop();
		undoStack.push(action);
		
		System.out.println("After redo operation: "+undoStack);
		
	}

}

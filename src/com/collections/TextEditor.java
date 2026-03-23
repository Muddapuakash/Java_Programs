package com.collections;

import java.util.Stack;

public class TextEditor 
{

	Stack<String> stack=new Stack<>();
	String text="";
	//type - method to type text
	public void type(String str)
	{
		text=text+str;
		stack.push(text);
		System.out.println("Typed elemenst: "+text);
		
	}
	
	//undo - method to undo last operation
	public void undo() 
	{
		if(!stack.isEmpty()) 
		{
			stack.pop(); //remove the top element
			if(!stack.isEmpty()) 
			{
				text=stack.peek();			
				}
			}else {
				text="";
			}
		System.out.println("After undo operation: "+text);
		}
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		editor.type("A");
		editor.type("B");
		editor.type("C");
		editor.undo();
	}


}


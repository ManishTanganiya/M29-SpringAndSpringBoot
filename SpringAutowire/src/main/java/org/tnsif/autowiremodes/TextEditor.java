package org.tnsif.autowiremodes;

public class TextEditor {
	
	//DI in form of objects
	private SpellChecker checker;
	
	//DI in form of literals
	private String name;
	
	

	public TextEditor(SpellChecker checker) {
		super();
		this.checker = checker;
		System.out.println("DI using constructor");
	}

	//getters and setters
	public SpellChecker getChecker() {
		return checker;
	}

	public void setChecker(SpellChecker checker) {
		this.checker = checker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		checker.checkSpelling();
	}
	

}

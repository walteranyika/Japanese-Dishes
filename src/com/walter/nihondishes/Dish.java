package com.walter.nihondishes;

public class Dish {
	private int id;
	private int image;
	private String title;
	private String desc;

	public Dish(int id, int image, String title, String desc) {
		super();
		this.id = id;
		this.image = image;
		this.title = title;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public int getImage() {
		return image;
	}

	public String getTitle() {
		return title;
	}

	public String getDesc() {
		return desc;
	}

	
	
	
	
	
}

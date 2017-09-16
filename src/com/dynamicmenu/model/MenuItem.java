package com.dynamicmenu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuItem {

	private Integer			itemID;
	private String			itemName;
	private String			itemURI;
	private String			author;
	private Integer			itemParent;
	private Date			creationDate;
	private Date			modificationDate;
	private Boolean			hasChildren;
	private List<MenuItem>	pageChildren;

	protected MenuItem() {

		super();

		this.itemID = 0;
		this.itemName = "BlankPage";
		this.itemURI = "/";
		this.author = "JohnSmith";
		this.itemParent = 0;
		this.creationDate = new Date();
		this.modificationDate = new Date();
		this.hasChildren = false;
		this.pageChildren = new ArrayList<>();
	}

	public MenuItem(Integer itemID, String itemName, String itemURI, Integer itemParent) {

		this();

		this.itemID = itemID;
		this.itemName = itemName;
		this.itemURI = itemURI;
		this.itemParent = itemParent;
	}

	public MenuItem(Integer itemID, String itemName, String itemURI, Integer itemParent, Boolean hasChildren,
			List<MenuItem> pageChildren) {

		this(itemID, itemName, itemURI, itemParent);

		this.hasChildren = hasChildren;
		this.pageChildren = pageChildren;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemURI() {
		return itemURI;
	}

	public void setItemURI(String itemURI) {
		this.itemURI = itemURI;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getItemParent() {
		return itemParent;
	}

	public void setItemParent(Integer itemParent) {
		this.itemParent = itemParent;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public Boolean getHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(Boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

	public List<MenuItem> getPageChildren() {
		return pageChildren;
	}

	public void setPageChildren(List<MenuItem> pageChildren) {
		this.pageChildren = pageChildren;
	}

}

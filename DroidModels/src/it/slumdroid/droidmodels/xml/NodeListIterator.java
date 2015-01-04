/* This file is part of SlumDroid <https://code.google.com/p/slumdroid/>.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License <http://www.gnu.org/licenses/gpl-3.0.txt>
 * for more details.
 * 
 * Copyright (C) 2013-2015 Gennaro Imparato
 */

package it.slumdroid.droidmodels.xml;

import java.util.Iterator;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class NodeListIterator implements Iterator<Element>, Iterable<Element> {
	
	private NodeList items = null;
	private int currentItem;

	public NodeListIterator (Element element) {
		this (element.getChildNodes());
	}

	public NodeListIterator(NodeList list) {
		setItems(list);
	}

	public Iterator<Element> iterator() {
		return this;
	}

	public boolean hasNext() {
		int item = this.getItems().getLength();
		return this.currentItem < item;
	}

	public Element next() {
		Element trace = (Element) this.getItems().item(this.currentItem);
		this.currentItem++;
		return trace;
	}

	public void remove() {
		// Doesn't actually remove anything
		this.currentItem++;
	}

	private NodeList getItems() {
		if (this.items instanceof NodeList)
			return this.items;
		return null;
	}

	private void setItems (NodeList list) {
		this.items = list;
		this.currentItem = 0;
	}

}

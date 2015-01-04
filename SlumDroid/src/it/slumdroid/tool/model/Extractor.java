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

package it.slumdroid.tool.model;

import android.app.Activity;
import android.view.View;

// TODO: Auto-generated Javadoc
/**
 * The Interface Extractor.
 */
public interface Extractor {

	/**
	 * Describe activity.
	 *
	 * @return the activity description
	 */
	public ActivityDescription describeActivity ();
	
	/**
	 * Gets the activity.
	 *
	 * @return the activity
	 */
	public Activity getActivity ();
	
	/**
	 * Extract state.
	 */
	public void extractState ();
	
	/**
	 * Gets the widget.
	 *
	 * @param key the key
	 * @return the widget
	 */
	public View getWidget (int key);

}

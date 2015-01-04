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

package it.slumdroid.tool.utilities.interactors;

import static it.slumdroid.droidmodels.model.InteractionType.DRAG;
import it.slumdroid.tool.utilities.adapters.SimpleInteractorAdapter;

// TODO: Auto-generated Javadoc
/**
 * The Class Drager.
 */
public class Drager extends SimpleInteractorAdapter {

	/**
	 * Instantiates a new drager.
	 *
	 * @param simpleTypes the simple types
	 */
	public Drager (String ... simpleTypes) {
		super (simpleTypes);
	}

	/* (non-Javadoc)
	 * @see it.slumdroid.tool.utilities.adapters.SimpleInteractorAdapter#getInteractionType()
	 */
	public String getInteractionType () {
		return DRAG;
	}

}

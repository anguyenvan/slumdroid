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

package it.slumdroid.tool.utilities.interactors.editor;

import static it.slumdroid.droidmodels.model.InteractionType.ENTER_TEXT;
import static it.slumdroid.droidmodels.model.SimpleType.SEARCH_BAR;

// TODO: Auto-generated Javadoc
/**
 * The Class AdditionalEnterEditor.
 */
public class AdditionalEnterEditor extends AdditionalWriteEditor {

	/**
	 * Instantiates a new additional enter editor.
	 */
	public AdditionalEnterEditor() {
		this(SEARCH_BAR);
	}

	/**
	 * Instantiates a new additional enter editor.
	 *
	 * @param simpleTypes the simple types
	 */
	public AdditionalEnterEditor(String ... simpleTypes) {
		super(simpleTypes);
	}

	/* (non-Javadoc)
	 * @see it.slumdroid.tool.utilities.interactors.editor.AdditionalWriteEditor#getInteractionType()
	 */
	public String getInteractionType() {
		return ENTER_TEXT;
	}

}
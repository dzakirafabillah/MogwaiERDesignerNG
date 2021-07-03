/**
 * Mogwai ERDesigner. Copyright (C) 2002 The Mogwai Project.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 */
package de.erdesignerng.visual.editor.about;

import de.erdesignerng.ERDesignerBundle;
import de.erdesignerng.io.GenericFileFilter;
import de.erdesignerng.util.ApplicationPreferences;
import de.erdesignerng.visual.editor.BaseEditor;
import de.mogwai.common.client.looks.UIInitializer;
import de.mogwai.common.client.looks.components.action.DefaultAction;
import de.mogwai.common.client.looks.components.list.DefaultListModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

/**
 * Editor for the class path entries.
 * 
 * @author $Author: dzakira
 * @version $Date: 2021-06-19 16:20:33 $
 */
public class About extends BaseEditor {

	private final AboutView view = new AboutView();

	private File lastDir;

	private String ABOUTERDESIGNER = "The Mogwai ERDesigner is an entity relationship " +
										" modeling/design tool(ERD) such as ERWin and co. "+
										"The only difference is that it is Open Source and does "+
										" not cost anything. It was designed to make database "+
										" modeling as easy as it can be and to support the developer "+
										" in the whole development process, from database design to "+
										" schema and code generation. ";

	public About(Component aParent) {
		super(aParent, ERDesignerBundle.ABOUT);

		initialize();

		view.getAboutText().setText(ABOUTERDESIGNER);

	}

	private void initialize() {
		setSize(300,600);

		setContentPane(view);
		setResizable(false);

		pack();

		UIInitializer.getInstance().initialize(this);
	}

    @Override
	public void applyValues() throws Exception {}

}
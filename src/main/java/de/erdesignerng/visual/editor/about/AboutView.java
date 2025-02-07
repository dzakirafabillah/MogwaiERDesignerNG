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

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import de.mogwai.common.client.looks.components.DefaultButton;
import de.mogwai.common.client.looks.components.DefaultList;
import de.mogwai.common.client.looks.components.DefaultTextField;
import de.mogwai.common.client.looks.components.DefaultLabel;
import de.mogwai.common.client.looks.components.DefaultTextArea;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class AboutView extends JPanel {

	private DefaultTextArea aboutText = new DefaultTextArea();

	public AboutView() {
		initialize();
		aboutText.setLineWrap(true);
        aboutText.setWrapStyleWord(true);
        aboutText.setOpaque(false);
		aboutText.setEditable(false);
		aboutText.setBackground(Color.red);
	}

	private void initialize() {
		
		 String theColDef = "2dlu,fill:150dlu:grow,2dlu,p,2dlu";
		 String theRowDef = "2dlu,fill:150dlu,p,2dlu,p,10dlu,p,2dlu";

		FormLayout theLayout = new FormLayout(theColDef, theRowDef);
		setLayout(theLayout);

		CellConstraints cons = new CellConstraints();

		add(aboutText.getScrollPane(), cons.xywh(2, 2, 1, 1));
		JPanel thePanel = new JPanel();

		theColDef = "60dlu,fill:2dlu:grow,60dlu";
		theRowDef = "p";

		theLayout = new FormLayout(theColDef, theRowDef);
		thePanel.setLayout(theLayout);

		add(thePanel, cons.xywh(2, 7, 3, 1));

	}

	public DefaultTextArea getAboutText() {
        return aboutText;
    }

}
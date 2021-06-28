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

	//private final DefaultTextField about = new DefaultTextField();

	private final DefaultButton okButton = new DefaultButton();

	private final DefaultButton testButton = new DefaultButton();

	private DefaultTextArea aboutText = new DefaultTextArea();

	//private final JTextArea textarea = new JTextArea();
	
	private String ABOUTERDESIGNER = "The Mogwai ERDesigner is an entity relationship \n" +
										" modeling/design tool(ERD) such as ERWin and co. \n"+
										"The only difference is that it is Open Source and does \n"+
										" not cost anything. It was designed to make database \n"+
										" modeling as easy as it can be and to support the developer \n"+
										" in the whole development process, from database design to \n"+
										" schema and code generation. \n";
	 //private String ABOUTERDESIGNER = "testtt";

	public AboutView() {
		initialize();
		aboutText.setLineWrap(true);
        aboutText.setWrapStyleWord(true);
        aboutText.setOpaque(false);
		aboutText.setEditable(false);
	}

	private void initialize() {
		
		 String theColDef = "2dlu,fill:150dlu:grow,2dlu,p,2dlu";
		 String theRowDef = "2dlu,fill:150dlu,p,2dlu,p,10dlu,p,2dlu";
		// String theColDef = "2dlu,p,2dlu,fill:150dlu:grow,2";
        // String theRowDef = "2dlu,p,10dlu,p,2dlu,p,2dlu,p,2dlu,p,2dlu,p,2dlu,p,10dlu,p,2dlu";

		FormLayout theLayout = new FormLayout(theColDef, theRowDef);
		setLayout(theLayout);

		CellConstraints cons = new CellConstraints();

		//add(new DefaultLabel(this.ABOUTERDESIGNER), cons.xy(2, 4));
		add(aboutText.getScrollPane(), cons.xywh(2, 2, 1, 1));
		JPanel thePanel = new JPanel();

		theColDef = "60dlu,fill:2dlu:grow,60dlu";
		theRowDef = "p";

		theLayout = new FormLayout(theColDef, theRowDef);
		thePanel.setLayout(theLayout);

		//thePanel.add(okButton, cons.xy(1, 1));
		//okButton.setText("Ok");

		// textarea.setFont(textarea.getFont().deriveFont(Font.BOLD));
		// textarea.setOpaque(false);
		
		// textarea.setSize(new Dimension(300,600));

  		// textarea.setText("aboutMogwaiaaaa");

		// thePanel.add(textarea, cons.xy(5, 5));
		

		thePanel.add(testButton, cons.xy(1, 1));
        testButton.setText("Ok");

		add(thePanel, cons.xywh(2, 7, 3, 1));

		

	}

	public JButton getOkButton() {
		return okButton;
	}

	public DefaultButton getTestButton() {
        return testButton;
    }

	public DefaultTextArea getAboutText() {
        return aboutText;
    }

}
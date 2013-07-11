package org.mmsh.vaadin.table.autogenerate;

import com.osb.vacation.entity.State;
import com.vaadin.ui.Panel;

public class GenerateTableInPanel extends Panel {

	private static final long serialVersionUID = 4661895296440961807L;

	public GenerateTableInPanel(Class<State> clazz) {
		GenerateTable gt = new GenerateTable(clazz);
		this.setContent(gt);
		this.setCaption(gt.getTableInfo().getCaption());
	}

}
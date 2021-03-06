package org.vaadin.mytablegenerator.windows;

import org.vaadin.mytablegenerator.table.TableInfo;

import com.vaadin.ui.Window;

/**
 * Description: The Edit pop-up window.<br>
 * <br>
 * Filename: EditPopupWindow.java <br>
 * 
 * @since 18.06.2013 <br>
 * @version <br>
 *          $LastChangedRevision: 150 $ <br>
 *          $LastChangedDate: 2013-06-19 19:34:16 +0200 (Mi, 19 Jun 2013) $
 * @author <a href="mailto:m.m.shahabi@gmail.com">$Author: mohammad.shahabi $</a><br>
 */
public class EditPopupWindow extends Window {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -328730814145776633L;

	/** The Constant MIN_HEIGHT. */
	private static final int MIN_HEIGHT = 60;

	/** The Constant MIN_WIDTH. */
	private static final int MIN_WIDTH = 20;

	public EditPopupWindow(final TableInfo tableInfo, Type type) {
		this(tableInfo, null, type);
	}
	/**
	 * Instantiates a new EditPopupWindow object.
	 * 
	 * @param tableInfo
	 *            The table info
	 */
	public EditPopupWindow(final TableInfo tableInfo, Object itemId, Type type) {
		center();
		setCaption(tableInfo.getPopupEditCaption());
		setResizable(tableInfo.isPopupEditResizable());
		switch (type) {
		case NEW:
			setWidth(tableInfo.getPopupEditWidth() + MIN_WIDTH, Unit.PIXELS);
			setHeight(tableInfo.getPopupEditHeight() + MIN_HEIGHT, Unit.PIXELS);
			setContent(tableInfo.getNewComponent());
			getContent().setWidth(tableInfo.getPopupEditWidth(), Unit.PIXELS);
			getContent().setHeight(tableInfo.getPopupEditHeight(), Unit.PIXELS);
			break;
		case EDIT:
			setWidth(tableInfo.getPopupEditWidth() + MIN_WIDTH, Unit.PIXELS);
			setHeight(tableInfo.getPopupEditHeight() + MIN_HEIGHT, Unit.PIXELS);
			setContent(tableInfo.getEditComponent(itemId));
			getContent().setWidth(tableInfo.getPopupEditWidth(), Unit.PIXELS);
			getContent().setHeight(tableInfo.getPopupEditHeight(), Unit.PIXELS);
			break;
		case IMPORT:
			setWidth(tableInfo.getPopupImportWidth() + MIN_WIDTH, Unit.PIXELS);
			setHeight(tableInfo.getPopupImportHeight() + MIN_HEIGHT, Unit.PIXELS);
			setContent(tableInfo.getImportComponent());
			getContent().setWidth(tableInfo.getPopupImportWidth(), Unit.PIXELS);
			getContent().setHeight(tableInfo.getPopupImportHeight(), Unit.PIXELS);
			break;
		default:
			break;
		}
	}

	
}


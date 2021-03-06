package org.vaadin.mytablegenerator.table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.vaadin.mytablegenerator.components.MyEdit;
import org.vaadin.mytablegenerator.components.MyImport;

import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.data.Container.Filter;

/**
 * Description: The specific information about each {@link MyTable} that is supposed to be created.<br>
 * The visible columns, generated columns, searchability of each column, ...<br>
 * Filename: TableInfo.java <br>
 * 
 * @since 18.06.2013 <br>
 * @version <br>
 *          $LastChangedRevision: 151 $ <br>
 *          $LastChangedDate: 2013-06-20 12:39:55 +0200 (Do, 20 Jun 2013) $
 * @author <a href="mailto:m.m.shahabi@gmail.com">$Author: mohammad.shahabi $</a><br>
 */
public abstract class TableInfo implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5093351693855012202L;
	
	/** The id. */
	private int id;
	
	/** The caption. */
	private String caption;
	
	/** The clazz. */
	private Class<?> clazz;
	
	/** The jpa container. */
	private JPAContainer<?> jpaContainer;
	
	/** The nested properties. */
	private String[] nestedProperties = new String[] {};
	
	/** The JPA filters. */
	private Filter[] jPAFilters = new Filter[] {};
	
	/** The columns. */
	private List<MyColumn> columns = new ArrayList<MyColumn>();
	
	/** The generated columns. */
	private List<CustomColumn> generatedColumns;
	
	/** The is immediate search. */
	private boolean isImmediateSearch = true;
	
	/** The is popup. */
	private boolean isPopup = false;
	
	/** The popup width. */
	private int popupEditWidth;
	private int popupListWidth;

	private int popupImportWidth;
	
	/** The popup height. */
	private int popupEditHeight;
	private int popupListHeight;
	private int popupImportHeight;
	
	/** The popup resizable. */
	private boolean popupEditResizable = false;
	private boolean popupListResizable = false;
	private boolean popupImportResizable = false;

	/** The popup caption. */
	private String popupEditCaption;
	private String popupListCaption;
	private String popupImportCaption;
	
	/** The is editable. */
	private boolean isEditable = true;
	
	/** The is deletable. */
	private boolean isDeletable = true;
	
	/** The is nested. */
	private boolean isNested = false;
	
	/** The is inline edit. */
	private boolean isInlineEdit = false;
	
	/** The is inline edit. */
	private boolean isImportable = false;
	
	/** The is export enabled. */
	private boolean isExportEnabled = true;
	
	/** The is selection export. */
	private boolean isSelectionExport = false;
	
	/** The selectable. */
	private boolean selectable = true;
	
	/** The multi select. */
	private boolean multiSelect = true;

	private boolean autoGenerate = false;

	private boolean forSelection = false;

	/**
	 * Define edit.
	 * 
	 * @param itemId
	 *            The item id
	 * @param duplicate
	 *            The duplicate
	 * @return 
	 */
	public abstract MyEdit getEditComponent(Object itemId);
	
	public abstract MyImport getImportComponent();
	
	public abstract MyEdit getNewComponent();

	/**
	 * Gets the id.
	 * 
	 * @return The id
	 */
	public final int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param pId
	 *            The new id
	 */
	public final void setId(final int pId) {
		this.id = pId;
	}

	/**
	 * Gets the caption.
	 * 
	 * @return The caption
	 */
	public final String getCaption() {
		return caption;
	}

	/**
	 * Sets the caption.
	 * 
	 * @param pCaption
	 *            The new caption
	 */
	public final void setCaption(final String pCaption) {
		this.caption = pCaption;
	}

	/**
	 * Gets the clazz.
	 * 
	 * @return The clazz
	 */
	public final Class<?> getClazz() {
		return clazz;
	}

	/**
	 * Sets the clazz for the table. This is used to differentiate between different tables.<br>
	 * Also used for the containerDataSource.
	 * 
	 * @param pClazz
	 *            The new clazz
	 */
	public final void setClazz(final Class<?> pClazz) {
		this.clazz = pClazz;
	}

	/**
	 * Gets the JPA container.
	 * 
	 * @return The JPA container
	 */
	@SuppressWarnings("rawtypes")
	public final JPAContainer getJpaContainer() {
		return jpaContainer;
	}

	/**
	 * Sets the jpa container.
	 * 
	 * @param pJpaContainer
	 *            The new jpa container
	 */
	public final void setJpaContainer(final JPAContainer<?> pJpaContainer) {
		this.jpaContainer = pJpaContainer;
	}

	/**
	 * Gets the nested properties.
	 * 
	 * @return The nested properties
	 */
	public final String[] getNestedProperties() {
		return nestedProperties;
	}

	/**
	 * Sets the nested properties.
	 * 
	 * @param pNestedProperties
	 *            The new nested properties
	 */
	public final void setNestedProperties(final String... pNestedProperties) {
		this.nestedProperties = pNestedProperties;
	}

	/**
	 * Gets the JPA filters.
	 * 
	 * @return The jPA filters
	 */
	public final Filter[] getJPAFilters() {
		return jPAFilters;
	}

	/**
	 * Sets the JPA filters.
	 * 
	 * @param pJPAFilters
	 *            The new jPA filters
	 */
	public final void setJPAFilters(final Filter... pJPAFilters) {
		jPAFilters = pJPAFilters;
	}

	/**
	 * Gets the columns.
	 * 
	 * @return The columns
	 */
	public final List<MyColumn> getColumns() {
		return columns;
	}

	/**
	 * Sets the columns.
	 * 
	 * @param pColumns
	 *            The new columns
	 */
	public final void setColumns(final List<MyColumn> pColumns) {
		this.columns = pColumns;
	}

	/**
	 * Gets the generated columns.
	 * 
	 * @return The generated columns
	 */
	public final List<CustomColumn> getGeneratedColumns() {
		return generatedColumns;
	}

	/**
	 * Sets the generated columns.
	 * 
	 * @param pGeneratedColumns
	 *            The new generated columns
	 */
	public final void setGeneratedColumns(final List<CustomColumn> pGeneratedColumns) {
		this.generatedColumns = pGeneratedColumns;
	}

	/**
	 * Checks if is popup.
	 * 
	 * @return true, if is popup
	 */
	public final boolean isPopup() {
		return isPopup;
	}

	/**
	 * Sets the popup.
	 * 
	 * @param pIsPopup
	 *            The new popup
	 */
	public final void setPopup(final boolean pIsPopup) {
		this.isPopup = pIsPopup;
	}

	/**
	 * Gets the popup width.
	 * 
	 * @return The popup width
	 */
	public final int getPopupEditWidth() {
		return popupEditWidth;
	}

	/**
	 * Sets the popup width.
	 * 
	 * @param pPopupWidth
	 *            The new popup width
	 */
	public final void setPopupEditWidth(final int pPopupWidth) {
		this.popupEditWidth = pPopupWidth;
	}

	/**
	 * Gets the popup height.
	 * 
	 * @return The popup height
	 */
	public final int getPopupEditHeight() {
		return popupEditHeight;
	}

	/**
	 * Sets the popup height.
	 * 
	 * @param pPopupHeight
	 *            The new popup height
	 */
	public final void setPopupEditHeight(final int pPopupHeight) {
		this.popupEditHeight = pPopupHeight;
	}

	/**
	 * Gets the popup caption.
	 * 
	 * @return The popup caption
	 */
	public final String getPopupEditCaption() {
		return popupEditCaption;
	}

	/**
	 * Sets the popup caption.
	 * 
	 * @param pPopupCaption
	 *            The new popup caption
	 */
	public final void setPopupEditCaption(final String pPopupCaption) {
		this.popupEditCaption = pPopupCaption;
	}

	/**
	 * Checks if is selectable.
	 * 
	 * @return true, if is selectable
	 */
	public final boolean isSelectable() {
		return selectable;
	}

	/**
	 * Sets the selectable. Makes the table to enable selection.
	 * 
	 * @param pSelectable
	 *            The new selectable
	 */
	public final void setSelectable(final boolean pSelectable) {
		this.selectable = pSelectable;
	}

	/**
	 * Checks if is multi select.
	 * 
	 * @return true, if is multi select
	 */
	public final boolean isMultiSelect() {
		return multiSelect;
	}

	/**
	 * Sets the multi select. Makes the table to enable multi selection.
	 * 
	 * @param pMultiSelect
	 *            The new multi select
	 */
	public final void setMultiSelect(final boolean pMultiSelect) {
		this.multiSelect = pMultiSelect;
	}

	/**
	 * Gets the serialversionuid.
	 * 
	 * @return The serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Checks if is editable.
	 * 
	 * @return true, if is editable
	 */
	public final boolean isEditable() {
		return isEditable;
	}


	/**
	 * Sets the editable. Checks to create the "Edit" Column
	 * 
	 * @param pIsEditable
	 *            The new editable
	 */
	public final void setEditable(final boolean pIsEditable) {
		this.isEditable = pIsEditable;
	}


	/**
	 * Checks if is deletable.
	 * 
	 * @return true, if is deletable
	 */
	public final boolean isDeletable() {
		return isDeletable;
	}


	/**
	 * Sets the deletable. Checks to create the "Delete" Column
	 * 
	 * @param pIsDeletable
	 *            The new deletable
	 */
	public final void setDeletable(final boolean pIsDeletable) {
		this.isDeletable = pIsDeletable;
	}

	/**
	 * Checks if is nested.
	 * 
	 * @return true, if is nested
	 */
	public final boolean isNested() {
		return isNested;
	}

	/**
	 * Sets the nested. When there is a table inside another layout rather than a normal layout.
	 * 
	 * @param pIsNested
	 *            The new nested
	 */
	public final void setNested(final boolean pIsNested) {
		this.isNested = pIsNested;
	}

	/**
	 * Checks if is inline edit.
	 * 
	 * @return true, if is inline edit
	 */
	public final boolean isInlineEdit() {
		return isInlineEdit;
	}


	/**
	 * Sets the inline edit. If the table that is intended is editable or not.
	 * 
	 * @param pIsInlineEdit
	 *            The new inline edit
	 */
	public final void setInlineEdit(final boolean pIsInlineEdit) {
		this.isInlineEdit = pIsInlineEdit;
	}

	/**
	 * Checks if is immediate search.
	 * 
	 * @return true, if is immediate search
	 */
	public final boolean isImmediateSearch() {
		return isImmediateSearch;
	}

	/**
	 * Sets the immediate search. Useful when with change in the {@link SearchText} the filter applies. <br>
	 * If <code>false</code> the "Search" button will be visible. 
	 * 
	 * @param pIsImmediateSearch
	 *            The new immediate search
	 */
	public final void setImmediateSearch(final boolean pIsImmediateSearch) {
		this.isImmediateSearch = pIsImmediateSearch;
	}

	/**
	 * Checks if is export enabled.
	 * 
	 * @return true, if is export enabled
	 */
	public final boolean isExportEnabled() {
		return isExportEnabled;
	}

	/**
	 * Sets the exportEnabled value. Is useful when there is export available for a <br>
	 * table or not. Not all tables are supposed to have export enabled.
	 * 
	 * @param pIsExportEnabled
	 *            The new export enabled
	 */
	public final void setExportEnabled(final boolean pIsExportEnabled) {
		this.isExportEnabled = pIsExportEnabled;
	}

	/**
	 * Checks if selection export is set to <code>true</code> or <code>false</code>.
	 * 
	 * @return true, if is selection export
	 */
	public final boolean isSelectionExport() {
		return isSelectionExport;
	}

	/**
	 * Sets the selectionExport value. This is useful when
	 * only selected values are intended to be exported <br>
	 * or the whole table is supposed to be exported. 
	 * 
	 * @param pIsSelectionExport
	 *            The new selection export value.
	 */
	public final void setSelectionExport(final boolean pIsSelectionExport) {
		this.isSelectionExport = pIsSelectionExport;
	}

	public boolean isAutoGenerate() {
		return autoGenerate;
	}

	public void setAutoGenerate(boolean autoGenerate) {
		this.autoGenerate = autoGenerate;
	}

	public boolean isForSelection() {
		return forSelection;
	}

	public void setForSelection(boolean forSelection) {
		this.forSelection = forSelection;
	}

	public boolean isImportable() {
		return isImportable;
	}

	public void setImportable(boolean isImportable) {
		this.isImportable = isImportable;
	}

	public int getPopupListWidth() {
		return popupListWidth;
	}

	public void setPopupListWidth(int popupListWidth) {
		this.popupListWidth = popupListWidth;
	}

	public int getPopupImportWidth() {
		return popupImportWidth;
	}

	public void setPopupImportWidth(int popupImportWidth) {
		this.popupImportWidth = popupImportWidth;
	}

	public int getPopupListHeight() {
		return popupListHeight;
	}

	public void setPopupListHeight(int popupListHeight) {
		this.popupListHeight = popupListHeight;
	}

	public int getPopupImportHeight() {
		return popupImportHeight;
	}

	public void setPopupImportHeight(int popupImportHeight) {
		this.popupImportHeight = popupImportHeight;
	}

	public boolean isPopupEditResizable() {
		return popupEditResizable;
	}

	public void setPopupEditResizable(boolean popupEditResizable) {
		this.popupEditResizable = popupEditResizable;
	}

	public boolean isPopupListResizable() {
		return popupListResizable;
	}

	public void setPopupListResizable(boolean popupListResizable) {
		this.popupListResizable = popupListResizable;
	}

	public boolean isPopupImportResizable() {
		return popupImportResizable;
	}

	public void setPopupImportResizable(boolean popupImportResizable) {
		this.popupImportResizable = popupImportResizable;
	}

	public String getPopupListCaption() {
		return popupListCaption;
	}

	public void setPopupListCaption(String popupListCaption) {
		this.popupListCaption = popupListCaption;
	}

	public String getPopupImportCaption() {
		return popupImportCaption;
	}

	public void setPopupImportCaption(String popupImportCaption) {
		this.popupImportCaption = popupImportCaption;
	}


}

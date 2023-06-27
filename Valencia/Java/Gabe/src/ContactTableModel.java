import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ContactTableModel extends AbstractTableModel{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final int indexNo = 0;
	private static final int colFirstName = 1;
	private static final int colLastName = 2;
	private static final int colPhone = 3;
	private static final int colCity = 4;
	private String[] colTitle = { "First Name", "Last Name", "Phone", "City" };
	List<Person> listPersons;

	public ContactTableModel(List<Person> listPersons) {
		this.listPersons = listPersons;
		int indexCount = 1;
		for (Person person : listPersons) {
			person.setIndex(indexCount++);
		}
	}

	@Override
	public int getColumnCount() {
		return colTitle.length;
	}

	@Override
	public int getRowCount() {
		return listPersons.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Person person = listPersons.get(rowIndex);
		Object returnValue = null;
		switch (columnIndex) {
		case colFirstName:
			returnValue = person.getFirstName();
			break;
		case colLastName:
			returnValue = person.getLastName();
			break;
		case colPhone:
			returnValue = Person.phoneNumber;
			break;
		case colCity:
			returnValue = person.getCity();
			break;
		default:
			throw new IllegalArgumentException();
		}
		return returnValue;
	}

	public String getColumnName(int columnIndex) {
		return colTitle[columnIndex];
	}

	public Class<?> getColumnClass(int columnIndex) {
		if (listPersons.isEmpty())
			return Object.class;
		else
			return getValueAt(0, columnIndex).getClass();
	}

	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		Person person = listPersons.get(rowIndex);
		if (columnIndex == indexNo) {
			person.setIndex((int) value);
		}
	}


}

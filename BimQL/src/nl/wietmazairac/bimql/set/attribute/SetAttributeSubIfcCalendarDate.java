package nl.wietmazairac.bimql.set.attribute;


public class SetAttributeSubIfcCalendarDate {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcCalendarDate() {
	}

	public SetAttributeSubIfcCalendarDate(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("DayComponent")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("MonthComponent")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("YearComponent")) {
			//1NoEList
			 //1void
			 //1int
		}
	}
}

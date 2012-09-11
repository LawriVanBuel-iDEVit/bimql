package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcWorkControl;

public class SetAttributeSubIfcWorkControl {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcWorkControl() {
	}

	public SetAttributeSubIfcWorkControl(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("CreationDate")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("TotalFloatAsString")) {
			//1NoEList
			((IfcWorkControl) object).setTotalFloatAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TotalFloat")) {
			//1NoEList
			((IfcWorkControl) object).setTotalFloat(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Duration")) {
			//1NoEList
			((IfcWorkControl) object).setDuration(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DurationAsString")) {
			//1NoEList
			((IfcWorkControl) object).setDurationAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FinishTime")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("WorkControlType")) {
			//1NoEList
			 //1void
			 //1IfcWorkControlTypeEnum
		}
		else if (attributeName.equals("UserDefinedControlType")) {
			//1NoEList
			((IfcWorkControl) object).setUserDefinedControlType(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Purpose")) {
			//1NoEList
			((IfcWorkControl) object).setPurpose(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("StartTime")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("Identifier")) {
			//1NoEList
			((IfcWorkControl) object).setIdentifier(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcWorkControl) object).setObjectType(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcWorkControl) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcWorkControl) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcRelOccupiesSpaces;

public class SetAttributeSubIfcRelOccupiesSpaces {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRelOccupiesSpaces() {
	}

	public SetAttributeSubIfcRelOccupiesSpaces(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("RelatingActor")) {
			//2NoEList
			 //2void
			 //2IfcActor
		}
		else if (attributeName.equals("ActingRole")) {
			//2NoEList
			 //2void
			 //2IfcActorRole
		}
		else if (attributeName.equals("RelatedObjectsType")) {
			//5NoEList
			 //5void
			 //5IfcObjectTypeEnum
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
			((IfcRelOccupiesSpaces) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcRelOccupiesSpaces) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}

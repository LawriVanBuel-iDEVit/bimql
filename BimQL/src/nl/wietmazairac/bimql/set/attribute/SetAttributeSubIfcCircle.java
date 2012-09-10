package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcCircle;

public class SetAttributeSubIfcCircle {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcCircle() {
	}

	public SetAttributeSubIfcCircle(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Radius")) {
			//1NoEList
			((IfcCircle) object).setRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RadiusAsString")) {
			//1NoEList
			((IfcCircle) object).setRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Position")) {
			//2NoEList
			 //2void
			 //2IfcAxis2Placement
		}
		else if (attributeName.equals("Dim")) {
			//5NoEList
			 //5void
			 //5int
		}
		else {
		}
	}
}

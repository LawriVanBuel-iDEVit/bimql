package nl.wietmazairac.bimql.set.attribute;


public class SetAttributeSubIfcCurveBoundedPlane {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcCurveBoundedPlane() {
	}

	public SetAttributeSubIfcCurveBoundedPlane(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Dim")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("BasisSurface")) {
			//1NoEList
			 //1void
			 //1IfcPlane
		}
		else if (attributeName.equals("OuterBoundary")) {
			//1NoEList
			 //1void
			 //1IfcCurve
		}
	}
}

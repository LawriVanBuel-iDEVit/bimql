package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcWindowPanelProperties;

public class SetAttributeSubIfcWindowPanelProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcWindowPanelProperties() {
	}

	public SetAttributeSubIfcWindowPanelProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ShapeAspectStyle")) {
			//1NoEList
			 //1void
			 //1IfcShapeAspect
		}
		else if (attributeName.equals("PanelPosition")) {
			//1NoEList
			 //1void
			 //1IfcWindowPanelPositionEnum
		}
		else if (attributeName.equals("OperationType")) {
			//1NoEList
			 //1void
			 //1IfcWindowPanelOperationEnum
		}
		else if (attributeName.equals("FrameDepthAsString")) {
			//1NoEList
			((IfcWindowPanelProperties) object).setFrameDepthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FrameThicknessAsString")) {
			//1NoEList
			((IfcWindowPanelProperties) object).setFrameThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FrameDepth")) {
			//1NoEList
			((IfcWindowPanelProperties) object).setFrameDepth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FrameThickness")) {
			//1NoEList
			((IfcWindowPanelProperties) object).setFrameThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
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
			((IfcWindowPanelProperties) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcWindowPanelProperties) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}

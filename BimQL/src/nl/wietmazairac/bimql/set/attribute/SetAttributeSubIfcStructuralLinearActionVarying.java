package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcStructuralLinearActionVarying;

public class SetAttributeSubIfcStructuralLinearActionVarying {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralLinearActionVarying() {
	}

	public SetAttributeSubIfcStructuralLinearActionVarying(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("VaryingAppliedLoadLocation")) {
			//1NoEList
			 //1void
			 //1IfcShapeAspect
		}
		else if (attributeName.equals("ProjectedOrTrue")) {
			//2NoEList
			 //2void
			 //2IfcProjectedOrTrueLengthEnum
		}
		else if (attributeName.equals("DestabilizingLoad")) {
			//5NoEList
			 //5void
			 //5Tristate
		}
		else if (attributeName.equals("CausedBy")) {
			//5NoEList
			 //5void
			 //5IfcStructuralReaction
		}
		else if (attributeName.equals("AssignedToStructuralItem")) {
			//5NoEList
			 //5void
			 //5IfcRelConnectsStructuralActivity
		}
		else if (attributeName.equals("AppliedLoad")) {
			//5NoEList
			 //5void
			 //5IfcStructuralLoad
		}
		else if (attributeName.equals("GlobalOrLocal")) {
			//5NoEList
			 //5void
			 //5IfcGlobalOrLocalEnum
		}
		else if (attributeName.equals("ObjectPlacement")) {
			//5NoEList
			 //5void
			 //5IfcObjectPlacement
		}
		else if (attributeName.equals("Representation")) {
			//5NoEList
			 //5void
			 //5IfcProductRepresentation
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcStructuralLinearActionVarying) object).setObjectType(attributeNewValue);
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
			((IfcStructuralLinearActionVarying) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcStructuralLinearActionVarying) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}

package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDoorPanelProperties;

public class GetAttributeSubIfcDoorPanelProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDoorPanelProperties(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("PanelDepth")) {
			resultList.add(((IfcDoorPanelProperties) object).getPanelDepth());
			 //1double
		}
		else if (string.equals("PanelOperation")) {
			resultList.add(((IfcDoorPanelProperties) object).getPanelOperation());
			 //1IfcDoorPanelOperationEnum
		}
		else if (string.equals("PanelWidth")) {
			resultList.add(((IfcDoorPanelProperties) object).getPanelWidth());
			 //1double
		}
		else if (string.equals("PanelPosition")) {
			resultList.add(((IfcDoorPanelProperties) object).getPanelPosition());
			 //1IfcDoorPanelPositionEnum
		}
		else if (string.equals("ShapeAspectStyle")) {
			resultList.add(((IfcDoorPanelProperties) object).getShapeAspectStyle());
			 //1IfcShapeAspect
		}
		else if (string.equals("PanelDepthAsString")) {
			resultList.add(((IfcDoorPanelProperties) object).getPanelDepthAsString());
			 //1String
		}
		else if (string.equals("PanelWidthAsString")) {
			resultList.add(((IfcDoorPanelProperties) object).getPanelWidthAsString());
			 //1String
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcDoorPanelProperties) object).getDefinesType().size(); i++) {
				resultList.add(((IfcDoorPanelProperties) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcDoorPanelProperties) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcDoorPanelProperties) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDoorPanelProperties) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDoorPanelProperties) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDoorPanelProperties) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDoorPanelProperties) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDoorPanelProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDoorPanelProperties) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDoorPanelProperties) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}

package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPresentationLayerAssignment;

public class GetAttributeSubIfcPresentationLayerAssignment {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPresentationLayerAssignment(Object object, String string) {
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
		if (string.equals("AssignedItems")) {
			//3xxx
			for (int i = 0; i < ((IfcPresentationLayerAssignment) object).getAssignedItems().size(); i++) {
				resultList.add(((IfcPresentationLayerAssignment) object).getAssignedItems().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPresentationLayerAssignment) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPresentationLayerAssignment) object).getDescription());
			 //1String
		}
		else if (string.equals("Identifier")) {
			resultList.add(((IfcPresentationLayerAssignment) object).getIdentifier());
			 //1String
		}
		return resultList;
	}
}

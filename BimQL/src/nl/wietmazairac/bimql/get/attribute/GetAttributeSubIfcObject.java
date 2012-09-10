package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcObject;

public class GetAttributeSubIfcObject {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcObject(Object object, String string) {
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
		if (string.equals("ObjectType")) {
			resultList.add(((IfcObject) object).getObjectType());
			 //1String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcObject) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcObject) object).getIsDefinedBy().get(i));
			}
			 //1EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcObject) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcObject) object).getHasAssignments().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcObject) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcObject) object).getIsDecomposedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcObject) object).getDecomposes().size(); i++) {
				resultList.add(((IfcObject) object).getDecomposes().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcObject) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcObject) object).getHasAssociations().get(i));
			}
			 //2EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcObject) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcObject) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcObject) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcObject) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcObject) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}

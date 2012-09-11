package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcGeometricSet;

public class GetAttributeSubIfcGeometricSet {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcGeometricSet(Object object, String string) {
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
		if (string.equals("Dim")) {
			resultList.add(((IfcGeometricSet) object).getDim());
			 //1int
		}
		else if (string.equals("Elements")) {
			//3xxx
			for (int i = 0; i < ((IfcGeometricSet) object).getElements().size(); i++) {
				resultList.add(((IfcGeometricSet) object).getElements().get(i));
			}
			 //1EList
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcGeometricSet) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcGeometricSet) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcGeometricSet) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcGeometricSet) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
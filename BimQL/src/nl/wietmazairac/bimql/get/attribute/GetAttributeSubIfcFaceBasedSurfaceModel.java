package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcFaceBasedSurfaceModel;

public class GetAttributeSubIfcFaceBasedSurfaceModel {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFaceBasedSurfaceModel(Object object, String string) {
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
			resultList.add(((IfcFaceBasedSurfaceModel) object).getDim());
			 //1int
		}
		else if (string.equals("FbsmFaces")) {
			//3xxx
			for (int i = 0; i < ((IfcFaceBasedSurfaceModel) object).getFbsmFaces().size(); i++) {
				resultList.add(((IfcFaceBasedSurfaceModel) object).getFbsmFaces().get(i));
			}
			 //1EList
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcFaceBasedSurfaceModel) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcFaceBasedSurfaceModel) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFaceBasedSurfaceModel) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcFaceBasedSurfaceModel) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}

package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcHalfSpaceSolid;

public class GetAttributeSubIfcHalfSpaceSolid {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcHalfSpaceSolid(Object object, String string) {
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
			resultList.add(((IfcHalfSpaceSolid) object).getDim());
			 //1int
		}
		else if (string.equals("BaseSurface")) {
			resultList.add(((IfcHalfSpaceSolid) object).getBaseSurface());
			 //1IfcSurface
		}
		else if (string.equals("AgreementFlag")) {
			resultList.add(((IfcHalfSpaceSolid) object).getAgreementFlag());
			 //1Tristate
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcHalfSpaceSolid) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcHalfSpaceSolid) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcHalfSpaceSolid) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcHalfSpaceSolid) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}

package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDraughtingPreDefinedTextFont;

public class GetAttributeSubIfcDraughtingPreDefinedTextFont {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDraughtingPreDefinedTextFont(Object object, String string) {
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
		if (string.equals("Name")) {
			resultList.add(((IfcDraughtingPreDefinedTextFont) object).getName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}

package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTextStyle;

public class GetAttributeSubIfcTextStyle {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTextStyle(Object object, String string) {
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
		if (string.equals("TextFontStyle")) {
			resultList.add(((IfcTextStyle) object).getTextFontStyle());
			 //1IfcTextFontSelect
		}
		else if (string.equals("TextCharacterAppearance")) {
			resultList.add(((IfcTextStyle) object).getTextCharacterAppearance());
			 //1IfcCharacterStyleSelect
		}
		else if (string.equals("TextStyle")) {
			resultList.add(((IfcTextStyle) object).getTextStyle());
			 //1IfcTextStyleSelect
		}
		return resultList;
	}
}

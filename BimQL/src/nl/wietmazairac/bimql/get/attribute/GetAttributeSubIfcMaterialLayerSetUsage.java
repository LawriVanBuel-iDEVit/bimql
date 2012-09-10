package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcMaterialLayerSetUsage;

public class GetAttributeSubIfcMaterialLayerSetUsage {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMaterialLayerSetUsage(Object object, String string) {
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
		if (string.equals("OffsetFromReferenceLine")) {
			resultList.add(((IfcMaterialLayerSetUsage) object).getOffsetFromReferenceLine());
			 //1double
		}
		else if (string.equals("OffsetFromReferenceLineAsString")) {
			resultList.add(((IfcMaterialLayerSetUsage) object).getOffsetFromReferenceLineAsString());
			 //1String
		}
		else if (string.equals("ForLayerSet")) {
			resultList.add(((IfcMaterialLayerSetUsage) object).getForLayerSet());
			 //1IfcMaterialLayerSet
		}
		else if (string.equals("LayerSetDirection")) {
			resultList.add(((IfcMaterialLayerSetUsage) object).getLayerSetDirection());
			 //1IfcLayerSetDirectionEnum
		}
		else if (string.equals("DirectionSense")) {
			resultList.add(((IfcMaterialLayerSetUsage) object).getDirectionSense());
			 //1IfcDirectionSenseEnum
		}
		return resultList;
	}
}

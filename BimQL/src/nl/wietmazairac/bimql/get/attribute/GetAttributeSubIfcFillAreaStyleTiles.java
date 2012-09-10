package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcFillAreaStyleTiles;

public class GetAttributeSubIfcFillAreaStyleTiles {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFillAreaStyleTiles(Object object, String string) {
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
		if (string.equals("TilingScaleAsString")) {
			resultList.add(((IfcFillAreaStyleTiles) object).getTilingScaleAsString());
			 //1String
		}
		else if (string.equals("TilingPattern")) {
			resultList.add(((IfcFillAreaStyleTiles) object).getTilingPattern());
			 //1IfcOneDirectionRepeatFactor
		}
		else if (string.equals("TilingScale")) {
			resultList.add(((IfcFillAreaStyleTiles) object).getTilingScale());
			 //1double
		}
		else if (string.equals("Tiles")) {
			//3xxx
			for (int i = 0; i < ((IfcFillAreaStyleTiles) object).getTiles().size(); i++) {
				resultList.add(((IfcFillAreaStyleTiles) object).getTiles().get(i));
			}
			 //1EList
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcFillAreaStyleTiles) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcFillAreaStyleTiles) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFillAreaStyleTiles) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcFillAreaStyleTiles) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}

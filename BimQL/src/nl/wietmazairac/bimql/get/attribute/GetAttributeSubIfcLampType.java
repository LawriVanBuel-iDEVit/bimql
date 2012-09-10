package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcLampType;

public class GetAttributeSubIfcLampType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLampType(Object object, String string) {
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
		if (string.equals("PredefinedType")) {
			resultList.add(((IfcLampType) object).getPredefinedType());
			 //1IfcLampTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcLampType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcLampType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcLampType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcLampType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcLampType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcLampType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcLampType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcLampType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcLampType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcLampType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcLampType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcLampType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcLampType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcLampType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcLampType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcLampType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcLampType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcLampType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcLampType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcLampType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcLampType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcLampType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}

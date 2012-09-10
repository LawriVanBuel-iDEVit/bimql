package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDiscreteAccessory;

public class GetAttributeSubIfcDiscreteAccessory {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDiscreteAccessory(Object object, String string) {
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
		if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getHasPorts().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getHasProjections().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcDiscreteAccessory) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcDiscreteAccessory) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcDiscreteAccessory) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcDiscreteAccessory) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getDecomposes().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessory) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDiscreteAccessory) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDiscreteAccessory) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDiscreteAccessory) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDiscreteAccessory) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDiscreteAccessory) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDiscreteAccessory) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}

package prototype;

public class EmployeeProtoType implements Cloneable{
	
	
	@Override
	protected EmployeeProtoType clone() throws CloneNotSupportedException {
		//return this;
		return new EmployeeProtoType(/*Parameters*/);
	}
}

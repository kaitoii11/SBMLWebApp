package beans.modelparameter;

public class Parameters_Beans {
	private String sbmlID;
	private String sbmlName;
	public String getSbmlName() {
		return sbmlName;
	}
	public void setSbmlName(String sbmlName) {
		this.sbmlName = sbmlName;
	}
	private double parameterValue;
	public String getSbmlID() {
		return sbmlID;
	}
	public void setSbmlID(String sbmlID) {
		this.sbmlID = sbmlID;
	}
	public double getParameterValue() {
		return parameterValue;
	}
	public void setParameterValue(double parameterValue) {
		this.parameterValue = parameterValue;
	}
}
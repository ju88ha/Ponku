package ��;

public class Customer_Grade {
	private int grade;
	private double accumulationPoint;
	
	public Customer_Grade(){
		this.grade = 0;
		this.accumulationPoint = 0.07;
	}
	
	public String getGradeAsString(){
		switch(this.grade){
		case 0:
			return "����Ʈ";
		case 1:
			return "�ó���";
		case 2:
			return "��Ƽ";
		case 3:
			return "����ġ";
		default:
			return "ERROR";
		}
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getAccumulationPoint() {
		return accumulationPoint;
	}

	public void setAccumulationPoint(double accumulationPoint) {
		this.accumulationPoint = accumulationPoint;
	}

	
}

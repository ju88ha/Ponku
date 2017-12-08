package 고객;

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
			return "라이트";
		case 1:
			return "시나몬";
		case 2:
			return "시티";
		case 3:
			return "프렌치";
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

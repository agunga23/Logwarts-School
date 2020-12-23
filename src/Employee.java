
public class Employee {
    private int salary;
    private int totalSalary;
    private String address;
    private String gender;
    private String name;
    boolean permanentEployee;
	private int bonusSalary;

    public Employee() {

    }

    public int getBonusSalary() {
		return bonusSalary;
	}

	public void setBonusSalary(int bonusSalary) {
		this.bonusSalary = bonusSalary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", totalSalary=" + totalSalary + ", address=" + address + ", gender="
				+ gender + ", name=" + name + ", permanentEployee=" + permanentEployee + ", bonusSalary=" + bonusSalary
				+ "]";
	}

	public int getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isPermanentEployee() {
        return permanentEployee;
    }

    public void setPermanentEployee(boolean permanentEployee) {
        this.permanentEployee = permanentEployee;
    }

    public void setTotalSalary() {
    	
	}
}

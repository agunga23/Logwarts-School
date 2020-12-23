
public class Staff extends Employee{


	public Staff() {
    }

    @Override
    public void setTotalSalary() {
        int bonus = 0;
        if (this.isPermanentEployee()){
            this.setTotalSalary(getSalary() + ((getSalary() * 15/100)) + bonus);
        }
        else{
            this.setTotalSalary(getSalary() + ((getSalary() * 15/100)));
        }
    }
}

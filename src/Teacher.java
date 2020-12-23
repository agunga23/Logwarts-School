
public class Teacher extends Employee{

    public Teacher() {
    }

    @Override
    public void setTotalSalary(int bonus) {
        if (this.isPermanentEployee()){
            this.setTotalSalary(getSalary() + ((getSalary() * 20/100)) + bonus);
        }
        else{
            this.setTotalSalary(getSalary() + ((getSalary() * 20/100)));
        }
    }
}

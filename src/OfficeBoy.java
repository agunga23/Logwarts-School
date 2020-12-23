
public class OfficeBoy extends Employee{

    public OfficeBoy() {
    }

    @Override
    public void setTotalSalary() {
        int bonus = 0;
        if (this.isPermanentEployee()){
            this.setTotalSalary(getSalary() + bonus);
        }
        else{
            this.setTotalSalary(getSalary());
        }
    }
}

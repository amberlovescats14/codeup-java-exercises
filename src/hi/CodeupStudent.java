package hi;

public class CodeupStudent extends Student{
    public CodeupStudent(String[] info, boolean graduated) {
        this.firstName = info[0];
        this.lastName = info[1];
        this.cohort = info[2];
        this.computer = info[3];
        this. graduated = graduated;

    }

    @Override
    public void greeting(){
        System.out.println("hello " + cohort);
    }

    @Override
    public void study(){
        System.out.println("Full-Stack Java Curriculum");
    }

    @Override
    public boolean giveBusinessCard(){
        //z: true or false
        return graduated;
    }




}

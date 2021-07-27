public class UC5  {

    private static final int FULL_TIME=0;
    private static final int PART_TIME=1;
    private static final int FullTimeHour=8;
    private static final int PartTimeHour=4;
    private static final int WagePerHour=20;
    private static final int TotalWorkingDays=20;

    public static void main(String[] args)  {

        int num = (int) Math.floor((Math.random() *10 ) % 2);
        System.out.println(num);
        if(num == FULL_TIME)  {
            int sum=(FullTimeHour*WagePerHour)*TotalWorkingDays;
            System.out.println("FullTime Employee Wage Per Day = "+sum);
        }
        else if(num == PART_TIME)  {  // 1 -> Employee PartTime Present
            int sum=PartTimeHour*WagePerHour*TotalWorkingDays;
            System.out.println("PartTime Employee Wage Per Day = "+sum);
        }
        else
            System.out.println("Some Thing Went Wrong");
    }
}

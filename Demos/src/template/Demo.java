package template;

public class Demo {
    public static void show(){
        var transferMoneyTask = new TransferMoneyTask();
        var generateReportTask = new GenerateReportTask();

        transferMoneyTask.execute();
        generateReportTask.execute();
    }
}

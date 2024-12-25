 //SRE: It defines that a class should have for 1 reason to change.
 //It is easy to maintain and easy to understamd
 //Example
 class Report{
    private String content;

    public Report(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }
}

class ReportPrint{
    public void printConsole(Report report){
        System.out.println(report.getContent());
    }

    public void saveToFile(Report report){
        System.out.println("Saving to file");
        System.out.println("In bytes : " + report.getContent().getBytes());
    }
}

public class SingleResponsibiltyEx {
    public static void main(String[] arg){
        Report report = new Report("Learning single reponsibilty principle");
        ReportPrint reportPrint = new ReportPrint();

        reportPrint.printConsole(report);
        reportPrint.saveToFile(report);
    }
}

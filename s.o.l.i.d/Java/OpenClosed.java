//Open-Closed : It is open for extension but closed for modification;
class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}

class ReportPrint {
    public void printConsole(Report report) {
        System.out.println(report.getContent());
    }
}

interface ReportDao {
    public void save(Report report);
}

class SaveToFile implements ReportDao {
    @Override
    public void save(Report report) {
        System.out.println("Saving to file");
        System.out.println("In bytes : " + report.getContent().getBytes());
    }
}

class SaveToMongoDb implements ReportDao {

    @Override
    public void save(Report report) {
        System.out.println("Saving to Mongo DB");
        System.out.println("In bytes : " + report.getContent().toString());
    }

}

public class OpenClosed {
    public static void main(String[] args) {
        Report report = new Report("Learning single reponsibilty principle");
        ReportPrint reportPrint = new ReportPrint();
        SaveToFile saveToFile = new SaveToFile();
        SaveToMongoDb saveToMongoDb = new SaveToMongoDb();
        reportPrint.printConsole(report);
        saveToFile.save(report);
        saveToMongoDb.save(report);
    }
}

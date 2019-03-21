import java.util.concurrent.TimeUnit;

public class Section {


    // properties
    private String Subject; // variable for Subject
    private String Course; // variable for Courses
    private String Section;  // variable for Section
    private String CRN; // variable for CRN
    private int Credits; // integer variable for Credits
    private String Time;  // variable for class time
    private String Days;  // variable for Days

    // Constructor
    public Section()
    {
        Subject = "";
        Course = "";
        Section = "";
        CRN = "";
        Credits = 0;
        Time = "";
        Days = "";

    }// end Public State Constructor

    public Section(String Subject, String Course, String Section, String CRN, int Credits, String Time, String Days )
    {
        this.Subject = Subject;
        this.Course = Course;
        this.Section = Section;
        this.CRN = CRN;
        this.Credits = Credits;
        this.Time = Time;
        this.Days = Days;

    }// end public Section


    // Accessor methods so other areas of the program can access the data from here

    public String getSubject()
    {
        return Subject;
    }//end getState

    public String getCourse()
    {
        return Course;
    }//end getCapital

    public String getSection() {
        return Section;
    }//end getSection

    public String getCRN(){
        return CRN;
    }//end CRN

    public int getCredits(){
        return Credits;
    }//end Credits

    public String getTime(){
        return Time;
    }//end Time

    public String getDays(){
        return Days;
    }//end getDays


}// end Section

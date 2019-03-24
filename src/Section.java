

public class Section {


    // properties
    private String Subject; // variable for Subject
    private String Course; // variable for Courses
    private String Section;  // variable for Section
    private int CRN; // variable for CRN
    private int Credits; // integer variable for Credits
    private String Time;  // variable for class time
    private String Days;  // variable for Days
    private boolean hasData;

    // Default Constructor
    public Section()
    {
        hasData = false;
    }// end Public State Constructor

    // second constructor
    public Section(String Subject, String Course, String Section, int CRN, int Credits, String Time, String Days )
    {
        this.Subject = Subject;
        this.Course = Course;
        this.Section = Section;
        this.CRN = CRN;
        this.Credits = Credits;
        this.Time = Time;
        this.Days = Days;
        this.hasData = true;

    }// end second constructor


    // setter methods to insert data into the correct fields
    public void setSubject(String newSubject){
        this.Subject = newSubject;
        this.hasData = true;
    }// end

    public void setCourse(String newCourse){
        this.Course = newCourse;
        this.hasData = true;
    }// end

    public void setSection(String newSection){
        this.Section = newSection;
        this.hasData = true;
    }// end

    public void setCRN(int newCRN){
        this.CRN = newCRN;
        this.hasData = true;
    }// end

    public void setCredits(int newCredits){
        this.Credits = newCredits;
        this.hasData = true;
    }// end

    public void setTime(String newTime){
        this.Time = newTime;
        this.hasData = true;
    }// end

    public void setDays(String newDays){
        this.Days = newDays;
        this.hasData = true;
    }// end


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

    public int getCRN(){
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

import java.io.File;
import java.util.Scanner;

public class SectionList {

    //static Section[] classinfo = new Section[100];

    public static void loadArray(Section[] inData) throws Exception{/* now that i have moved my Array from the main
     method i am having a little bit of issues getting data to load correctly.  Im thinking that i may not need the
     inData parameter*/

        // temporary variables for the properties to read from the .txt file
        String inSubject;
        String inCourse;
        String inSection;
        String inCRN;
        int inCredits = 0;
        String inTime;
        String inDays;

        int count = 0; //loop counter

        String fileName = ("courses.txt");

        // this Scanner object will allow me to read the data from the .txt file
        Scanner inFile = new Scanner(new File(fileName));


        /*  this while loop will read each lind of data from the .txt file using the
        Scanner object, i will also be using the hasNextLine() method to determine
        if there is another proceeding line of data.
     */
        while (count < inData.length){

            inSubject = inFile.next();
            inCourse = inFile.next();
            inSection = inFile.next();
            inCRN = inFile.next();
            inCredits = Integer.parseInt(inFile.next());
            inTime = inFile.next();
            inDays = inFile.next();

            //System.out.println(inSubject);
            // this will initialize each element in the array with the properties of the State class constructor

            inData[count] = new Section(inSubject,inCourse,inSection,inCRN,inCredits,inTime,inDays);
            count ++; // this will increase the loop counter

        }// end while

        inFile.close();//closing file handle

        SectionList.loadArray(classInfo);/* This will call the loadArray method to load the data from the .txt file
        into the classInfo array holding 70 elements*/


    }//end loadArray

    public static Section[] classInfo = new Section[70]; /* making this array outside of any method so i can
    use the classInfo data in the array in my print method also*/

/*************************************************************************************************************/
    public static void search(Section[] Section){

        Scanner keyboard = new Scanner(System.in);

        while(true){
            // get the name of the State from the user
            System.out.print("Please enter the name of the course you want to search be sure to capitalize the first letter: ");

            String targetCRN = keyboard.nextLine();

            for(int i = 0; i < Section.length; i++){

                if(Section[i].getCRN().equals(targetCRN)) {
                    System.out.print("Subject: ");
                    System.out.println(Section[i].getSubject());
                    System.out.print("Course: ");
                    System.out.println(Section[i].getCourse());
                    System.out.print("Section: ");
                    System.out.println(Section[i].getSection());
                    System.out.print("CRN: ");
                    System.out.println(Section[i].getCRN());
                    System.out.print("Credits: ");
                    System.out.println(Section[i].getCredits());
                    System.out.print("Time: ");
                    System.out.println(Section[i].getTime());
                    System.out.print("Days: ");
                    System.out.println(Section[i].getDays());
                    break;

                }else if(i == Section.length - 1 && !Section[i].getCRN().equals(targetCRN)){
                    System.out.println("Sorry no course by that name found. Please try again. ");

                }//end else if

            }// end for

        }//end while

    }//end search

 /*************************************************************************************************************/

    public static void printArray() throws Exception {

        //Section[] sectionInfo = new Section[70]; // this is commented out to test other ways of implementation

        int i = 0; // loop counter

        //SectionList.loadArray(sectionInfo);// this is commented out to test other ways of implementation


        System.out.println("Data from the array of courses:\n");
        for(i=0; i<70; i++) {
            System.out.print("Subject: ");
            System.out.println(classInfo[i].getSubject());
            System.out.print("Course: ");
            System.out.println(classInfo[i].getCourse());
            System.out.print("Section: ");
            System.out.println(classInfo[i].getSection());
            System.out.print("CRN: ");
            System.out.println(classInfo[i].getCRN());
            System.out.print("Credits: ");
            System.out.println(classInfo[i].getCredits());
            System.out.print("Time: ");
            System.out.println(classInfo[i].getTime());
            System.out.print("Days: ");
            System.out.println(classInfo[i].getDays());
            System.out.println(" ");
            i ++;
        }

    }// end printArray

}//end SectionList

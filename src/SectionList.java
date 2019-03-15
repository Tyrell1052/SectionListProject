import java.io.File;
import java.util.Scanner;

public class SectionList {

    public static void loadArray(Section[] inData) throws Exception{

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

            // this will initialize each element in the array with the properties of the State class constructor

            inData[count] = new Section(inSubject,inCourse,inSection,inCRN,inCredits,inTime,inDays);
            count ++; // this will increase the loop counter

        }// end while

        inFile.close();



    }//end loadArray

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

    public static void printArray() throws Exception {

        Section[] sectionInfo = new Section[50]; //

        int i = 0; // loop counter

        SectionList.loadArray(sectionInfo);// call the method to load the array


        System.out.println("Data from the array of courses:\n");
        for(i=0; i<50; i++) {
            System.out.print("Subject: ");
            System.out.println(sectionInfo[i].getSubject());
            System.out.print("Course: ");
            System.out.println(sectionInfo[i].getCourse());
            System.out.print("Section: ");
            System.out.println(sectionInfo[i].getSection());
            System.out.print("CRN: ");
            System.out.println(sectionInfo[i].getCRN());
            System.out.print("Credits: ");
            System.out.println(sectionInfo[i].getCredits());
            System.out.print("Time: ");
            System.out.println(sectionInfo[i].getTime());
            System.out.print("Days: ");
            System.out.println(sectionInfo[i].getDays());
            System.out.println(" ");
        }

    }// end printArray

}//end SectionList

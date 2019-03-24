import java.io.File;
import java.util.Scanner;

public class SectionList {

    Section[] registrationInfo = new Section[70];

    public SectionList() throws Exception{/*    */

         for(int i = 0; i < registrationInfo.length; i++){
             registrationInfo[i] = new Section();
         }//end for loop
    }//end SectionList constructor

    public void loadArray() throws Exception{

        String fileName = ("courses.txt");
        Scanner inFile = new Scanner(new File(fileName));

        while(inFile.hasNext()){
            for(int i = 0; i < registrationInfo.length; i ++){
                if(inFile.hasNext()){
                    registrationInfo[i].setSubject(inFile.next());
                    registrationInfo[i].setCourse(inFile.next());
                    registrationInfo[i].setSection(inFile.next());

                }//end if
            }//end for

        }//end while


    }//end loadArray



        //String fileName = ("courses.txt");

        // this Scanner object will allow me to read the data from the .txt file
        Scanner inFile = new Scanner(new File(fileName));


        /*  this while loop will read each lind of data from the .txt file using the
        Scanner object, i will also be using the hasNextLine() method to determine
        if there is another proceeding line of data.
     */

        inFile.close();//closing file handle


    //}//end loadArray

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

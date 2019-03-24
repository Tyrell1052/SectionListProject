import java.io.File;
import java.util.Scanner;

public class SectionList {

    Section[] registrationInfo = new Section[20];

    public SectionList() throws Exception{/*    */

         for(int i = 0; i < registrationInfo.length; i++){
             registrationInfo[i] = new Section();
         }//end for loop
    }//end SectionList constructor

/*************************************************************************************************************/

    public void loadArray() throws Exception{

        String fileName = ("courses.txt");
        Scanner inFile = new Scanner(new File(fileName));

        while(inFile.hasNext()){
            for(int i = 0; i < registrationInfo.length; i ++){
                if(inFile.hasNext()) {
                    registrationInfo[i].setSubject(inFile.next());
                    registrationInfo[i].setCourse(inFile.next());
                    registrationInfo[i].setSection(inFile.next());
                    registrationInfo[i].setCRN(Integer.parseInt(inFile.next()));
                    registrationInfo[i].setCredits(Integer.parseInt(inFile.next()));
                    registrationInfo[i].setTime(inFile.next());
                    registrationInfo[i].setDays(inFile.next());
                }else {
                    break;
                }//end if
            }//end for
        }//end while
    }//end loadArray

/*************************************************************************************************************/
    public void search(){

        Scanner keyboard = new Scanner(System.in);

        // get the name of the State from the user
        System.out.print("Please enter the CRN# of the course you want to search: ");

        int targetCRN = keyboard.nextInt();


            for(int i = 0; i < registrationInfo.length; i++) {
                if (targetCRN == registrationInfo[i].getCRN()) {
                    System.out.print("Subject: ");
                    System.out.println(registrationInfo[i].getSubject());
                    System.out.print("Course: ");
                    System.out.println(registrationInfo[i].getCourse());
                    System.out.print("Section: ");
                    System.out.println(registrationInfo[i].getSection());
                    System.out.print("CRN: ");
                    System.out.println(registrationInfo[i].getCRN());
                    System.out.print("Credits: ");
                    System.out.println(registrationInfo[i].getCredits());
                    System.out.print("Time: ");
                    System.out.println(registrationInfo[i].getTime());
                    System.out.print("Days: ");
                    System.out.println(registrationInfo[i].getDays());
                    break;

                } else if (i == registrationInfo.length - 1 && targetCRN != registrationInfo[i].getCRN()) {
                    System.out.println("Sorry no courses by that CRN# found. Please try again. ");

                }//end else if
            }//end for
        //end while
    }//end search

 /*************************************************************************************************************/

    public void printArray() throws Exception {


        System.out.println("Data from the array of courses:\n");
        for(int i = 0; i<registrationInfo.length; i++) {
            System.out.print("Subject: ");
            System.out.println(registrationInfo[i].getSubject());
            System.out.print("Course: ");
            System.out.println(registrationInfo[i].getCourse());
            System.out.print("Section: ");
            System.out.println(registrationInfo[i].getSection());
            System.out.print("CRN: ");
            System.out.println(registrationInfo[i].getCRN());
            System.out.print("Credits: ");
            System.out.println(registrationInfo[i].getCredits());
            System.out.print("Time: ");
            System.out.println(registrationInfo[i].getTime());
            System.out.print("Days: ");
            System.out.println(registrationInfo[i].getDays());
            System.out.println(" ");

        }//end for
    }// end printArray
}//end SectionList class

/*
* Author: Tyrell Robbins
* Program: SectionListProject
*
* Description: This program will consist of three class: SectionListProject --> this will act as my main, it will
* be responsible for calling methods from other classes. My Second class is SectionList --> this class will have
* a loadArray, search & print methods.  My third class is Section --> responsible for initialing the Section class
* holding the variables and getters for each course field.
*
* */



public class SectionListProject {

    public static void main(String[] args) throws Exception {

        // instantiate a list object
        SectionList myList = new SectionList();

        // load the list with data from a data file
        myList.loadArray();//commented out only for testing purposes

        // print the entire list of sections
        myList.printArray();

        // allow a user to look up a section by CRN
        myList.search(); //commented out only for testing purposes

    }// end main()

}// end SectionListProject

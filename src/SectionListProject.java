public class SectionListProject {

    public static void main(String[] args){

        // instantiate a list object
        SectionList myList = new SectionList();

        // load the list with data from a data file
        myList.loadArray();

        // print the entire list of sections
        myList.printArray();

        // allow a user to look up a section by CRN
        myList.search();

    }// end main()

}// end SectionListProject

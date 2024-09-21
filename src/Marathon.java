public class Marathon {
   static String participantsname;
    static int marathonnumber;
    static double date;
    String marathonsponsor ;
    static{
        participantsname = "Jas Mangat";
        marathonnumber = 303;
        date = 29-9-2024;
        System.out.println("marathon static  block " + participantsname);
        System.out.println("marathon static  block " +marathonnumber);
        System.out.println("marathon static block " + date);
    }
    public Marathon(String MR) {
        this.marathonsponsor = MR;
    }
}

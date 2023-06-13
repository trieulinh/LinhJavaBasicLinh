package Variable;
    public class Variables01 {
        public String name01;
        public int age;
        public  static String school = "Đh Sư Phạm";
         Variables01(String n, int t) {
            name01 = n;
            age = t;
        };
        public void P() {
            String ID = "1234";
            System.out.println("ID: " + ID + " " + "Tên : "+name01 + " " + "Tuổi: " +age + " " + school);
        };
        //static {
          //  System.out.println("1234");;
        //}

        public static void main(String[] args) {
            Variables01 sv01 = new Variables01("Phạm Thị Thu Phương", 30);
            Variables01 sv02 = new Variables01( "Trần Thị Lan", 23);
            sv01.P();
            sv02.P();
        }
}

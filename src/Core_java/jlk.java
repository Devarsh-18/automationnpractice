package Core_java;

public class jlk {

        private int age;
        private String email;
        private String uname;
    public jlk(String email,String uname,int age){
            this.email = email;
            this.uname = uname;
            this.age = age;
        }

        public String getEmail() {
            return email;

        }
        public String getUname() {
            return uname;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setUname(String uname) {
            this.uname = uname;
        }
    static class main {
        public static void main(String[] args) {
            jlk p = new jlk( "ab@cd.com", "Dee",  11);
            System.out.println("the id is  "   + p.getEmail());
            System.out.println("uname is  "   + p.getUname());
            System.out.println("age is   "    +   p.getAge());
        }
        }
    }










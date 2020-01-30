public class testdd {
    public void m1(){
        System.out.println("m1");
    }


}

class yes extends testdd{
    public void m1(){
        System.out.println("m2");
    }

    public void m3(){
        super.m1();
    }

    public static void main(String args[]){

        String anb="anupam sinha kumar";
        char [] nn= anb.toCharArray();

        System.out.println("dfcds");

        yes yes=new yes();
        yes.m3();

    }

}

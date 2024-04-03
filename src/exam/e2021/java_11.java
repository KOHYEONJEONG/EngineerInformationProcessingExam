package exam.e2021;

public class java_11 {

    //이해가 안된다!!
    public static void main(String[] args) {
        int w =3, x=4, y=3, z=5;
        if((w==2|w==y)&!(y>z)&(1==x ^ y!=z)){
            w = x+y;
            if(7==x^y != w){
                System.out.println(w);
            }else{
                System.out.println(x);
            }
        }else{
            w = y+z;
            if(7==y^z!=w){
                System.out.println(w);
            }else{
                System.out.println(z);
            }
        }

        // 7
    }


}

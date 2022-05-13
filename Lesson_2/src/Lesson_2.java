public class Lesson_2 {
    public static void main(String[] args) {
        //arifmetik gorcoxutyunner
        int a = 5, b = 6;
        System.out.println(a + b);//11
        System.out.println(a * b);//30
        System.out.println(b / a);/*(1) bajanac@ aystex ashxatume urish dzev ayn cuyce talis
         tvi amboxj mas@ aysinqn qani angam ka mi tiv@ miusi mej vorovhetev ayn inte*/
        System.out.println(a - b);//-1
        System.out.println(b % a);//1 cuyc e talis mnacord@
     //ka nayev mi usrish gorcoxutyun (a++) vor@ tvi arjeqin gumarume 1 orinak`
        System.out.println(a);// 5
        System.out.println(b);// 6
        System.out.println(++a);//++a vorovhetev cragir@ ete liner a++ ktper a heto kgumarer 1 u kpaher ira mej a+1
        int z = a++ - b-- + ++b + --a;// kta 12
        System.out.println(z);//12
        System.out.println(a);//6
        System.out.println(b);//6
        int c = z++ + ++a - b-- + ++b + a++ + ++a - --z;
        System.out.println(c);//23
        System.out.println(a);//9
        System.out.println(b);//6
        System.out.println(z);//12
        int d = --c + ++a + b++ - --z - z-- - b-- - b++ + ++a;
        System.out.println(d);//14
        //logicheski operacianer orinak` ete
        short f = 5, g = 6;
        System.out.println((f<5)&&(g>7));//ktpi false bayc ete`
        System.out.println((f==5)&&(g<7));//ktpi true
        // kan naev ayl gorcoxutyunner orinak
        System.out.println((f>5)||(g<7));//ktpi true sa kam gorcoxutyunne miayn 1 chisht payaman@ bavarare truei hamar
        //kan nayev bitayin gorcoxutyunner & | ev xor @ orinak`
        System.out.println(g&f);// ktpi 4
        System.out.println(g|f);// ktpi 7
        System.out.println(g^f);// ktpi 3


    }
}

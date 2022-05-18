public class Lesson_4 {
    public static void main(String[] args) {
        //while looper  while kkkatari mer uzac gorcoxutyun@ aynqan angam vorqan uzenq

        int x = 1;
        while (x <= 10) {
            System.out.println(x);
            x = 20;//nunisk ete  x darna 20 whil cikl@ kkatarvi 1 angam hetevabar ktpi javan
            System.out.println("java");
            x++;
        }
        System.out.println("____________________________________________________");
        int y = 1;
        while (y <= 10) {
            System.out.print(++y + " ");
        }
        // aystex ktpi 2 ic minchev 11 @ vorovhetev
        // verji cikli jamanak kta 10@ true kmtni ktpi 11 nor kstugi false
        System.out.println();
        System.out.println("____________________________________________________");
        // for loop
        for (int i = 1; i < 11; i++) {//fori bloki mej 1 bloki meji gorcoxuytun@ 1 angame stugvum sksveluc
            System.out.print(i + " ");//fori  meji popoxakanner@ menak forum en hayatararvac
        }
        System.out.println();
        System.out.println("____________________________________________________");
        //xndirner 1 simvolov stanal erankyuni qarakusi

        int a[] = {5, 8, 6, 9, 3};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("____________________________________________________");

        x = 11567;
        y = 0;
        while(x!=0){
            y=y*10+x%10;
            x=x/10;
        }
        System.out.println(y);//es kod@ reversa anum tver@ hakarak hajordakanutyamb
        // unenum enq array vori mej kan erknish ev avel tver unenanq ursih array nuyn longov u ira mej lcnenq es arrayi tver@
        //revers arac
    }
}

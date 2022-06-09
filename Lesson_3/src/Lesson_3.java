public class Lesson_3 {
    public static void main(String[] args) {
        //Arrays
        int[] myArray = new int[5];

        myArray[0] = 1;
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);//ktpi inti defoult arjexq@
        System.out.println(myArray.length);//ktpi 5 da mer haytararac elementneri qanakne
        System.out.println(myArray[myArray.length - 1]);// sta ktpi misht verji tvi elementi arjeq@ nuynisk ete lengt@ poxvi
        double[] dd = {1.2, 2.8, 5.9};
        System.out.println(dd[dd.length - 1]); // saa haytararelu 2 dzevne ete arrayi tver@ haytni en
        //System.out.println(myArray[5]);kta error vorovhetev ayd indexov bacvac popoxakan chka
        System.out.println("-----------------------------------------------");
        //if else
        int y = 5, x = 0, z = 3;
        if (y > 0) {
            System.out.println(y);
        } else {
            System.out.println(x);//ete aranc bloki enq grum if i taki tox@ khamarvi if i gorcoxutyun 2 @ arden arandzin toxa
        }
        //ka naev 2 dzev haytararelu sranq kochvum en ternar operatorner
        y = x > 0 ? 1 : 0;//ktpi 1 ete x>0 ete poqra verjaketic heto arjeq@
        System.out.println(y);

        switch (z) {
            case 1:
            case 3:
            case 5:
            case 7: {
                System.out.println("azat");
                break;
            }
            case 2:
            case 4:
            case 6: {
                System.out.println("zbaxvac");
                break;
            }
            default: {
                System.out.println("chka tenc or");
                break;
            }


        }
        System.out.println("----------------------------------------------");
        int a = 8, b = 6, c = 7;
        if (a > b && a > c) {
            System.out.println(a);
        } else {
            if (b > a && b > c) {
                System.out.println(b);

            } else {
                if (c > a && c > b)
                    System.out.println(c);

            }
        }
    }
}
//21-40
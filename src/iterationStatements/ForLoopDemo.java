package iterationStatements;

public class ForLoopDemo {

    public static void main(String[] args) {
        // for(int i=1;i<=10;i++)
        //{
        //  System.out.print(i+", ");

        //}
        // for(int i=10;i>=1 ;i--)
        //{
        //  System.out.print(i+", ");
        //}
//    for(int i=1;i<=10;i++)
//    {
//       if(i%2!=0) {
//           System.out.println("odd numbers:"+i);
//       }
//    }
//        for(int i=1;i<=10;i++)
//        {
//            if(i%2!=1) {
//                System.out.println("Even numbers:"+i);
//            }
//        }
        for (int i = 1; i <= 10; i++) {
            if (i!=5 && i!=7) {
                System.out.print(i+", ");}
                else
                {
                    System.out.println("this is not required number");
                }

        }
    }
}
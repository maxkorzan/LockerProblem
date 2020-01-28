public class Main {
    public static void main(String[] args) {

        String[] lockers = new String[101];

        //100 closed lockers
        for(int i=1; i<=100; i++){
            lockers[i]="X";
            System.out.print(lockers[i] + " ");
        }
        System.out.println();


        //flip every Nth locker
        for(int n=1; n<=100; n++){
            //System.out.println("N = "+n);
            //switch X-->O or O-->X
            for(int i=n; i<=100; i+=n){
                if(lockers[i].equals("X")){
                    lockers[i] = "O";
                    //System.out.println("X->O block");
                }
                else if(lockers[i].equals("O")){
                    lockers[i] = "X";
                    //System.out.println("O->X block");
                }

            }
            //System.out.println("end Open/Close flip");

            //print output for Nth line
            for(String locker : lockers) {
                System.out.print(locker + " ");
            }
            System.out.println();
           // System.out.println("end printing Nth line");

        }

        //print # of open lockers
        for(int i=0; i<lockers.length; i++){
            if(lockers[i] == "O"){
                System.out.print(i + " ");
            }
        }
        System.out.println("end of printing #s");


    }
}

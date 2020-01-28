public class Main {
    public static void main(String[] args) {

        String[] lockers = new String[101];

        //create 100 closed lockers
        for(int i=1; i<=100; i++){
            lockers[i]="X";
            System.out.print(lockers[i] + " ");
        }
        System.out.println();


        //flip every Nth locker
        for(int n=1; n<=100; n++){
            //switch X-->O or O-->X
            for(int i=n; i<=100; i+=n){
                if(lockers[i].equals("X")){
                    lockers[i] = "O";
                }
                else if(lockers[i].equals("O")){
                    lockers[i] = "X";
                }
            }

            //print output for Nth line
            for(int i=1; i<=100; i++){
                System.out.print(lockers[i] + " ");
            }
            System.out.println();
        }


        //print # of open lockers
        for(int i=1; i<lockers.length; i++){
            if(lockers[i] == "O"){
                System.out.print(i + " ");
            }
        }

    }
}

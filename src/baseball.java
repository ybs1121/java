import java.util.*;

public class baseball {
    public static void main(String args[]){
        int baseball[] = new int[3];
        for(int i = 0; i < 3; i++){
            baseball[i] = (int)((Math.random()*10000)%9);
        }
        System.out.println(Arrays.toString(baseball));
        int count = 0;
        while(true){
            count++;
            Scanner sc = new Scanner(System.in);
            int strike = 0;
            int ball = 0;

            int user_input[] = new int[3];
            System.out.print("입력:");
            for(int i = 0; i < 3; i++){

                user_input[i] = sc.nextInt();
            }

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(baseball[i] == user_input[j]){
                        if(i == j) {strike ++; break;}
                        else if(i != j) {ball++;}
                    }
                }

            }
            System.out.println("Strike: " + strike);
            System.out.println("Ball: " +ball );
            System.out.println("Try: " +count );


            if(strike == 3) break;


        }
    }

}

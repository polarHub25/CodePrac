package ShootingStars;

import java.util.Scanner;

class Star01 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print(" 찍고싶은 별 갯수를 입력하세요. ");
        int starCount = scan.nextInt();

        sol(starCount);  

        scan.close();
    }

    public static void sol(int starCount){

        for(int i = 0; i < starCount; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

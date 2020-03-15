package sumaverage;

import java.util.Scanner;

public class SumAverage {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        final int ROW = 3, COL = 4;
        int[][] score = new int[ROW][COL];
        int data,sum=0;
        
        
        // วนรอบรับค่า
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print("ป้อนค่า[" + i + "][" + j + "] =");
                data = reader.nextInt();
                score[i][j] = data;
                sum += score[i][j];
            }
        }

        //วนรอบแสดงผล
        System.out.println("\t แสดงผลลัพธ์ ");
        System.out.println();
        for (int l = 1; l <= 100; l++) {
            System.out.print("~");
        }
        System.out.println();
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print("\t" + score[i][j]);
            }
            System.out.println();
        }
        System.out.println("ผลรวม="+sum);
        System.out.println("ค่าเฉลี่ย="+(float)sum/(ROW)*(COL));

    }
}

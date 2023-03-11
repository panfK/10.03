import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ex;
        System.out.println("выберите задание 1-3");
        ex=sc.nextInt();
        if (ex==1){
            ex1();
        } else if (ex==2) {
            ex2();
        }
        else {
            ex3();
        }
    }
    public static void ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите n");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                if(i + j + 1== n) {
                    a[i][j] = 1;
                } else {
                    if (i + j + 1 < n) {
                        a[i][j] = 0;
                    } else {
                        a[i][j] = 2;
                    }
                }
            }
        }
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print("a["+i+"]["+j+"]="+a[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void ex2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите n");
        int n = sc.nextInt();
        String[][] a = new String[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++){
                a[i][j] = "." ;
            }
        }
        for(int i=0;i<n;i++){
            a[i][i-(i-((n-1)/2))]="*";
            a[i-(i-((n-1)/2))][i]="*";
            a[i][n-i-1]="*";
            a[i][i]="*";
        }
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void ex3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите n");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i<j) {a[i][j] = j - i;}
                else     {a[i][j] = i - j;}
            }
        }
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

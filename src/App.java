import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        int i = 0;
        int aux = 0;
        sc.close();

        int[] arr = {a, b, c};

        for(i = 0; i<3; i++){
            for(int j = 0; j<2; j++){
                if(arr[j] > arr[j + 1]){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }

        for(i = 0; i<3; i++){
            System.out.println(arr[i]);
        }

        System.out.println("");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

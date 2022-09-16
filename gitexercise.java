import java.util.Scanner;

class gitexercise {
    public static void main(String []args) {
        int num, i, j, temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of integers to sort:");
        num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter " + num + " integers: ");

        for (i = 0; i < num; i++)
            array[i] = input.nextInt();

        for (i = 0; i < ( num - 1 ); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted list of integers:");

        for (i = 0; i < num; i++)
            System.out.println(array[i]);

            int number, a, f, tempr;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of integers to sort:");
        number = in.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter " + number + " integers: ");

        for (a = 0; a < number; a++)
            arr[a] = in.nextInt();

        for (a = 0; a < ( number - 1 ); a++) {
            for (f = 0; f < number - a - 1; f++) {
                if (arr[f] < arr[f+1])
                {
                    tempr = arr[f];
                    arr[f] = arr[f+1];
                    arr[f+1] = tempr;
                }
            }
        }

        System.out.println("Sorted list of integers in a descending order is: ");

        for (a = 0; a < number; a++)
            System.out.println(arr[a]);


    }
}
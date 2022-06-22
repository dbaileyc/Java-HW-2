public class prob3 {
    public static void main(String[] args) {

        int[] array = {2,3,9,17,32,40,73,40,21,10};

        System.out.print("Before shifting: ");
        for(int i = 0; i<array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        int temp;
        temp =  array[0];
        array[0]=array[1];
        array[1]=array[2];
        array[2]=array[3];
        array[3]=array[4];
        array[4]=array[5];
        array[5]=array[6];
        array[6]=array[7];
        array[7]=array[8];
        array[8]=array[9];
        array[9]=temp;
        System.out.println();

        System.out.print("After shifting: ");

        for(int i = 0; i<array.length; i++) {
            System.out.print(array[i]+ " " );
        }

    }
    }

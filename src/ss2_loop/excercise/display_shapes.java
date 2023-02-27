package ss2_loop.excercise;

public class display_shapes {

    public static void printRectangle(int width, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void printRigthTriangleBottom_Left(int height){
        for (int i = 1; i <=height ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printRigthTriangleTop_Left(int height){
        for (int i = 1; i <=height ; i++) {
            for (int j = i; j <= height; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printIsoscelesTriangle(int heigth){
        for (int i = 1; i <= heigth ; i++) {
            // In khoảng trắng
            for (int j = 1; j <= heigth -i; j++) {
                System.out.print("  ");
            }
            //In dấu *
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("In hình chữ nhật: ");
        printRectangle(7,3);

        System.out.println("In hình tam giác vuông, có cạnh góc vuông ở botton-left: ");
        printRigthTriangleBottom_Left(5);

        System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left: ");
        printRigthTriangleTop_Left(5);

        System.out.println("In hình tam giác cân: ");
        printIsoscelesTriangle(5);
    }
}

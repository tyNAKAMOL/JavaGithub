package testlab8;

import java.util.Scanner;

public class Testlab8 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.print("Menu (1=Circle, 2=Rectangle, 3=Triangle, 4=Exit) : ");
            int num = input.nextInt();
            if (num == 4) {
                exit = true;
                System.out.println("End of program.");
                System.out.println("----------------------");
            } else if (num == 1) {
                System.out.print("Circle c1(radius color weight) : ");        
                double r1 = input.nextDouble();
                String cl1 = input.next();
                int w1 = input.nextInt();
                //Cir c1 = new Cir(2.5, "RED", 120);
                Cir c1 = new Cir(r1,cl1,w1);

                System.out.print("Circle c2(radius color weight) : ");        
                double r2 = input.nextDouble();
                String cl2 = input.next();
                int w2 = input.nextInt();
                //Cir c2 = new Cir(5.5, "BLUE", 100);
                Cir c2 = new Cir(r2,cl2,w2);

                System.out.print("\nFind the larger object using max method : ");
                String x1 = input.next();
                String x2 = input.next();
                System.out.print("Answer : ");
                switch (Cir.max(c1, c2)) {
                    case 1 -> {
                        System.out.println("c1");
                    }
                    case 2 -> {
                        System.out.println("c2");

                    }
                    default -> {
                        System.out.println("EQUAL");
                    }
                }
                System.out.print("\nCloning Circle c3 by using : ");
                String Clone = input.next();
                Cir c3;
                if (Clone.contains("c1")) {
                    c3 = (Cir) c1.clone();
                    System.out.printf("%s==c3 is : %b\n", Clone, c3 == c1);
                    System.out.printf("%s.equals(c3) is : %b\n", Clone, c1.equals(c3));
                } else {
                    c3 = (Cir) c2.clone();
                    System.out.printf("%s==c3 is : %b\n", Clone, c3 == c2);
                    System.out.printf("%s.equals(c3) is : %b\n", Clone, c2.equals(c3));
                }
                System.out.print("\nFind the larger of 2 instances of comparable objects : ");
                String y1 = input.next();
                String y2 = input.next();
                Cir cx = null, cy = null;
                if (null != y1) {
                    switch (y1) {
                        case "c1" ->
                            cx = (Cir) c1.clone();
                        case "c2" ->
                            cx = (Cir) c2.clone();
                        case "c3" ->
                            cx = (Cir) c3.clone();
                        default -> {
                        }
                    }
                }
                if (null != y2) {
                    switch (y2) {
                        case "c1" ->
                            cy = (Cir) c1.clone();
                        case "c2" ->
                            cy = (Cir) c2.clone();
                        case "c3" ->
                            cy = (Cir) c3.clone();
                        default -> {
                        }
                    }
                }
                System.out.print("Answer : ");
                switch (Cir.max(cx, cy)) {
                    case 1 -> {
                        System.out.println(y1);
                    }
                    case 2 -> {
                        System.out.println(y2);
                    }
                    default -> {
                        System.out.println("EQUAL");
                    }
                }
                System.out.println("----------------------");
                
            } else if (num == 2) {
                System.out.print("Rectangle r1(width height color weight) : ");        
                double w1 = input.nextDouble();
                double h1 = input.nextDouble();
                String cl1 = input.next();
                int W1 = input.nextInt();
                //Rec r1 = new Rec(4, 6, "GREEN", 200);
                Rec r1 = new Rec(w1,h1,cl1,W1);

                System.out.print("Rectangle r2(width height color weight) : ");        
                double w2 = input.nextDouble();
                double h2 = input.nextDouble();
                String cl2 = input.next();
                int W2 = input.nextInt();
                //Rec r2 = new Rec(6, 4, "YELLOW", 180);
                Rec r2 = new Rec(w2, h2,cl2,W2);

                System.out.print("\nFind the larger object using max method : ");
                String x1 = input.next();
                String x2 = input.next();
                System.out.print("Answer : ");
                switch (Cir.max(r1, r2)) {
                    case 1 -> {
                        System.out.println("r1");
                    }
                    case 2 -> {
                        System.out.println("r2");
                    }
                    default -> {
                        System.out.println("EQUAL");
                    }
                }
                System.out.print("\nCloning Rectangle r3 by using : ");
                String Clone = input.next();
                Rec r3;
                if (Clone.contains("r1")) {
                    r3 = (Rec) r1.clone();
                    System.out.printf("%s==r3 is : %b\n", Clone, r3 == r1);
                    System.out.printf("%s.equals(r3) is : %b\n", Clone, r1.equals(r3));
                } else {
                    r3 = (Rec) r2.clone();
                    System.out.printf("%s==r3 is : %b\n", Clone, r3 == r2);
                    System.out.printf("%s.equals(r3) is : %b\n", Clone, r2.equals(r3));
                }
                System.out.print("Find the larger of 2 instances of comparable objects : ");
                String y1 = input.next();
                String y2 = input.next();
                Rec rx = null, ry = null;
                if (null != y1) {
                    switch (y1) {
                        case "r1" ->
                            rx = (Rec) r1.clone();
                        case "r2" ->
                            rx = (Rec) r2.clone();
                        case "r3" ->
                            rx = (Rec) r3.clone();
                        default -> {
                        }
                    }
                }
                if (null != y2) {
                    switch (y2) {
                        case "r1" ->
                            ry = (Rec) r1.clone();
                        case "r2" ->
                            ry = (Rec) r2.clone();
                        case "r3" ->
                            ry = (Rec) r3.clone();
                        default -> {
                        }
                    }
                }
                System.out.print("Answer : ");
                switch (Cir.max(rx, ry)) {
                    case 1 -> {
                        System.out.println(y1);
                    }
                    case 2 -> {
                        System.out.println(y2);
                    }
                    default -> {
                        System.out.println("EQUAL");
                    }
                }
                System.out.println("----------------------");

            } else if (num == 3) {
                System.out.print("Triangle t1(side1 side3 side3 color weight) : ");        
                double s1 = input.nextDouble();
                double s2 = input.nextDouble();
                double s3 = input.nextDouble();
                String cl1 = input.next();
                int W1 = input.nextInt();
                
                Tri t1 = new Tri(s1, s2, s3, cl1 , W1);
                

                System.out.print("Triangle t1(side1 side3 side3 color weight) : ");        
                double s11 = input.nextDouble();
                double s22 = input.nextDouble();
                double s33 = input.nextDouble();
                String cl2 = input.next();
                int W2 = input.nextInt();
                Tri t2 = new Tri(s11, s22, s33, cl2, W2);
                
                
                if ((t1.isTriangle(s1, s2, s3) == true) && (t2.isTriangle(s11, s22, s33) == true)) {
                    System.out.print("\nFind the larger object using max method : ");
                    String x1 = input.next();
                    String x2 = input.next();
                    System.out.print("Answer : ");
                    switch (Cir.max(t1, t2)) {
                        case 1 -> {
                            System.out.println("t1");
                        }
                        case 2 -> {
                            System.out.println("t2");

                        }
                        default -> {
                            System.out.println("EQUAL");
                        }
                    }
                    System.out.print("\nCloning Triangle t3 by using : ");
                    String Clone = input.next();
                    Tri t3;
                    if (Clone.contains("r1")) {
                        t3 = (Tri) t1.clone();
                        System.out.printf("%s==t3 is : %b\n", Clone, t3 == t1);
                        System.out.printf("%s.equals(t3) is : %b\n", Clone, t1.equals(t3));
                    } else {
                        t3 = (Tri) t2.clone();
                        System.out.printf("%s==t3 is : %b\n", Clone, t3 == t2);
                        System.out.printf("%s.equals(t3) is : %b\n", Clone, t2.equals(t3));
                    }
                    System.out.print("Find the larger of 2 instances of comparable objects : ");
                    String y1 = input.next();
                    String y2 = input.next();
                    Tri tx = null, ty = null;
                    if (null != y1) {
                        switch (y1) {
                            case "t1" ->
                                tx = (Tri) t1.clone();
                            case "t2" ->
                                tx = (Tri) t2.clone();
                            case "t3" ->
                                tx = (Tri) t3.clone();
                            default -> {
                            }
                        }
                    }
                    if (null != y2) {
                        switch (y2) {
                            case "t1" ->
                                ty = (Tri) t1.clone();
                            case "t2" ->
                                ty = (Tri) t2.clone();
                            case "t3" ->
                                ty = (Tri) t3.clone();
                            default -> {
                            }
                        }
                    }
                    System.out.print("Answer : ");
                    switch (Cir.max(tx, ty)) {
                        case 1 -> {
                            System.out.println(t1);
                        }
                        case 2 -> {
                            System.out.println(t2);
                        }
                        default -> {
                            System.out.println("EQUAL");
                        }
                    }
                    System.out.println("----------------------");
                }
                else System.out.println("Not a triangle");
            }

        }
    }
}

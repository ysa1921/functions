import java.util.Scanner;

public class Functions {

        public static double calculateTriangleSide(double a, double b, double angleC) {
        
        double angleInRadians = Math.toRadians(angleC);
        
        
        double cSquared = a * a + b * b - 2 * a * b * Math.cos(angleInRadians);
        
       
        return Math.sqrt(cSquared);
    }

   
    public static double calculateCircleSegmentArea(double radius, double angle) {
        
        if (radius < 0 || angle < 0) {
            throw new IllegalArgumentException("Radius and angle must be non-negative.");
        }
        
        
        double angleInRadians = Math.toRadians(angle);
        
        
        double area = (Math.pow(radius, 2) / 2) * (angleInRadians - Math.sin(angleInRadians));
        
        return area;
    }

    
    public static double calculateSphereVolume(double radius) {
        
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        
        
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    
    public static double calculateSphereSurfaceArea(double radius) {
        
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        
        
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Choose the calculation you want to perform:");
        System.out.println("1. Calculate third side of a triangle (Law of Cosines)");
        System.out.println("2. Calculate area of a circle segment");
        System.out.println("3. Calculate volume and surface area of a sphere");

       
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
               
                System.out.println("Enter side a:");
                double a = scanner.nextDouble();
                System.out.println("Enter side b:");
                double b = scanner.nextDouble();
                System.out.println("Enter angle C in degrees:");
                double angleC = scanner.nextDouble();
                
                double sideC = calculateTriangleSide(a, b, angleC);
                System.out.println("The third side of the triangle is: " + sideC);
                break;

            case 2:
               
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                System.out.println("Enter the central angle θ in degrees:");
                double angle = scanner.nextDouble();
                
                double segmentArea = calculateCircleSegmentArea(radius, angle);
                System.out.println("The area of the circle segment is: " + segmentArea);
                break;

            case 3:
                
                System.out.println("Enter the radius of the sphere:");
                double sphereRadius = scanner.nextDouble();
                
                double volume = calculateSphereVolume(sphereRadius);
                double surfaceArea = calculateSphereSurfaceArea(sphereRadius);
                
                System.out.println("The volume of the sphere is: " + volume);
                System.out.println("The surface area of the sphere is: " + surfaceArea);
                break;

            default:
                System.out.println("Invalid choice! Please choose 1, 2, or 3.");
                break;
        }

        scanner.close();
    }
}

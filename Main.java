import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Update Student");
            System.out.println("5. Exit");
        

            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Branch: ");
                String branch = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                StudentDAO.addStudent(name, branch, email);
            }

            else if(choice == 2){

                StudentDAO.viewStudents();
            }

            else if(choice == 3){

                System.out.print("Enter Student ID to delete: ");
                int id = sc.nextInt();

                StudentDAO.deleteStudent(id);
            }
            else if(choice == 4){

    System.out.print("Enter Student ID to update: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter New Name: ");
    String name = sc.nextLine();

    System.out.print("Enter New Branch: ");
    String branch = sc.nextLine();

    System.out.print("Enter New Email: ");
    String email = sc.nextLine();

    StudentDAO.updateStudent(id, name, branch, email);
}

            else if(choice == 5){

                System.out.println("Exiting...");
                break;
            }

            else{
                System.out.println("Invalid Choice");
            }
        }
    }
}
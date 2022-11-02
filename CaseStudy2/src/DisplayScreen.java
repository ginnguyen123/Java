import views.View;
import views.user.AddUserView;
import views.user.EditUserView;
import views.user.RemoveUserView;
import views.user.UserView;

import java.util.Scanner;

public class DisplayScreen {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        EditUserView editUserView = new EditUserView();
    //Viet menu hien thi cho product
        // khoi tao menu > choice
//        ProductServices.init();
//        ProductView productView = new ProductView();
//        productView.showBody();
        //viet hien thị cho user
//        Date creatDay = new Date();
//        UsersServices usersServices = new UsersServices();
//        usersServices.init();1
//        System.out.println(usersServices.getUsers().
//                toString());
//        System.out.println();
//        System.out.println();
//        usersServices.removeUser(1);
//        System.out.println(usersServices.getUsers().toString());
//        usersServices.addUser(new User(6,"Oanh", "298238923",
//                "asksakj@gmail.com", "askaskj.com",creatDay )); // add đầu danh sach set
//        System.out.println(usersServices.getUsers().toString());

        /// Viết menu hiển thị cho user
        View views = null; // khởi tạo trước màn hình view, gọi đến astracst View
        boolean flag = true;
        do {
            System.out.println("Menu:");
            System.out.println("1. Show list of users.");
            System.out.println("2. Add User.");
            System.out.println("3. Remove User.");
            System.out.println("4. Edit user infomation.");
            System.out.println("0. Exit");
            System.out.print("Enter: ");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:
                    views = new UserView();
                    break;
                case 2:
                    views = new AddUserView();
                    break;
                case 3:
                    views = new RemoveUserView();
                    break;
                case 4:
                    views = new EditUserView();
                case 0:
                    flag = false;
            }
            views.showPage();
        }while (flag);

    }
}

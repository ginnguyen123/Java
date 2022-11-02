package views.user;

import model.User;

import java.util.Date;

public class AddUserView extends UserViewTemplate {
    //Viet view hiển thi nhập thông tin user phia user
    //ghi de phan hiển thị phần showBody ở class View
    public AddUserView(){
        //tạo contructor trống mặc định gọi về lớp cha
        super();
    }
    @Override
    public void showBody() {
        System.out.println("Enter user information!");
        Long idUser = System.currentTimeMillis()%1000000; // check lại idUsser
        //User(long id, String userName, String numPhone, String email, String adress, Date createDay, int idRole)
        System.out.print("User name: ");
        String nameUser = scanner.nextLine();
        System.out.print("\nPhone numbes: ");
        String numPhones = scanner.nextLine();
        System.out.print("\nEmail: ");
        String email = scanner.nextLine();
        System.out.println("\nAddress: ");
        String address = scanner.nextLine();
        Date createDay = new Date();
        User inputUser = new User(idUser, nameUser, numPhones, email,address, createDay);
        usersServices.addUser(inputUser); // add vào ds users

        showUsers(usersServices.getUsers()); // hển thị lại danh sách users
    }
}

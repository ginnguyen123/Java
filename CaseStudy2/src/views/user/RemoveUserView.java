package views.user;

import services.UsersServices;

public class RemoveUserView extends UserViewTemplate{
    public RemoveUserView() {
        super();
    }

    @Override
    public void showBody() {
        System.out.println("Enter user ID: ");
        long idUser = scanner.nextLong();
        UsersServices.removeUser(idUser);
        //Hiển thị lại danh sách user
        showUsers(UsersServices.getUsers());

    }
}

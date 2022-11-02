package views.user;

public class RemoveUserView extends UserViewTemplate{
    public RemoveUserView() {
        super();
    }

    @Override
    public void showBody() {
        System.out.println(usersServices);
        System.out.println("Enter user ID: ");
        long idUser = scanner.nextLong();
        usersServices.removeUser(idUser);
        showUsers(usersServices.getUsers());

    }
}

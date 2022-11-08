package views.user;

import services.UsersServices;

public class EditUserView extends UserViewTemplate{
    public EditUserView(){
        super();
    }

    @Override
    public void showBody() {
        boolean flag = true;
        System.out.println("Edit user information!");
        System.out.print("Enter ID: ");
        Long idUser = Long.parseLong(scanner.nextLine());
        if (usersServices.isfindUser(idUser)) {
            do {
                System.out.println("1.User name.");
                System.out.println("2.Address");
                System.out.println("3.Phone number.");
                System.out.println("0.Exit!");
                Integer choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("User name: ");
                        String userName = scanner.nextLine();
                        UsersServices.findUser(idUser).setUserName(userName);
                        break;
                    case 2:
                        System.out.println("Address: ");
                        String address = scanner.nextLine();
                        UsersServices.findUser(idUser).setAdress(address);
                        break;
                    case 3:
                        System.out.println("Phone number: ");
                        String numPhone = scanner.nextLine();
                        UsersServices.findUser(idUser).setAdress(numPhone);
                        break;
                    case 0:
                        flag = false;
                        break;
                }
                showUsers(UsersServices.getUsers());
            } while (flag);
        } else {
            System.out.println("ID " + idUser + " don't exist!");
        }
    }
}


package views.user;

import services.UsersServices;

public class UserView extends UserViewTemplate {
    //lớp hiển thị màn hình ds user
    public UserView(){}
    @Override
    // ghi dè phương thuc showBody cua lop cha UserViewTemplate, gọi usersServices o lop cha, khoi tao ds user o UserServices
    public void showBody() {
        showUsers(usersServices.getUsers());
    }
}

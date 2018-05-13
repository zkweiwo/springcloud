package cn.edu.nyist.bookmanv1.biz;
//说明：管理员业务层
public interface AdminBiz {
	boolean findAdminByNameAndPwd(String name, String pwd);

}

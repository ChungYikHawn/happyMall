import com.mmall.dao.UserDao;
import com.mmall.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class testDao {


    @Test
    public void test1(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = app.getBean("userDao", UserDao.class);
        User user = userDao.selectByPrimaryKey(1);
        System.out.println(user);
    }
}

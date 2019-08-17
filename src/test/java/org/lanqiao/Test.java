package org.lanqiao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.lanqiao.entity.ProductLL;
import org.lanqiao.mapper.ProductMapperLL;

import java.io.Reader;


/**
 * Created by David on 2019/8/9.
 */
public class Test {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis-Config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            //User表和实体的对应
//            UserMapper userMapper = session.getMapper(UserMapper.class);
//            User user= userMapper.selectByPrimaryKey(1);
//            System.out.println(user);
//留言板
//            MsgboardDao msgboardDao=session.getMapper(MsgboardDao.class);
//            List<Msgboard> msgboardlist= msgboardDao.getMsgboard();
//            for (int i = 0; i <msgboardlist.size() ; i++) {
//                System.out.println(msgboardlist.get(i));
//            }
            //班级表和教师表的一对一，在班级表映射中验证关系
            ProductMapperLL classesMapper=session.getMapper(ProductMapperLL.class);
            ProductLL classes=classesMapper.selectByPrimaryKey(1);
            System.out.println(classes);
        } finally {
            session.close();
        }
    }
}

import com.weipch.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author 方唐镜
 * @Create 2024-07-03 21:43
 * @Description
 */
public class TestA {

	
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	
	/**
	 * 1、根据全局配置文件创建SqlSessionFactory
	 *
	 * 2、获取SqlSession
	 *
	 * 3、获取mapper接口的代理对象mapperProxy
	 *
	 * 4、执行代理对象的增删改查方法
	 * @throws IOException
	 */
	@Test
	public void test1() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		System.out.println(userMapper.getUserById(2));
		sqlSession.close();
		
	}
}

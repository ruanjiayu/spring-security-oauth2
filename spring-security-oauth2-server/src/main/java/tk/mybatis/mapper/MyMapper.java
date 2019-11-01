package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/11/1  14:09
 * @Version: 0.0.1-SHAPSHOT
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
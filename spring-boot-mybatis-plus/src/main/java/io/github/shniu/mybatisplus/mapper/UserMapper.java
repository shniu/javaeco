package io.github.shniu.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shniu.mybatisplus.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author niushaohan (shaohan.niu@dfgroup.pro)
 * @date 2020/4/19 16
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}

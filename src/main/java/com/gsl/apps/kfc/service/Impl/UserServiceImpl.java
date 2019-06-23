package com.gsl.apps.kfc.service.Impl;

import com.gsl.apps.kfc.bean.User;
import com.gsl.apps.kfc.bean.UserExample;
import com.gsl.apps.kfc.mapper.UserMapper;
import com.gsl.apps.kfc.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        UserExample example = new UserExample();
        return userMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(User user) {
        if(user.getId() == null){
            userMapper.insert(user);
        }else {
            userMapper.updateByPrimaryKey(user);
        }
    }

    @Override
    public void deleteById(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }
}

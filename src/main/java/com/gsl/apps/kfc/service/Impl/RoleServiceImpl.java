package com.gsl.apps.kfc.service.Impl;

import com.gsl.apps.kfc.bean.Role;
import com.gsl.apps.kfc.bean.RoleExample;
import com.gsl.apps.kfc.mapper.RoleMapper;
import com.gsl.apps.kfc.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public List<Role> findAll() {
        RoleExample example = new RoleExample();
        return roleMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Role role) {
        if(role.getId() == null){
            roleMapper.insert(role);
        }else {
            roleMapper.updateByPrimaryKey(role);
        }
    }

    @Override
    public void deleteById(Long id) {
        roleMapper.deleteByPrimaryKey(id);
    }
}

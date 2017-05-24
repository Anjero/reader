package net.anjero.reader.module.system.security.service;

import net.anjero.reader.components.Page;
import net.anjero.reader.module.system.security.mapper.SecurityAdminMapper;
import net.anjero.reader.module.system.security.pojo.SecurityAdmin;
import net.anjero.reader.module.system.security.pojo.SecurityAdminExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Transactional
@Service
public class AdminService {
    @Resource
    private SecurityAdminMapper securityAdminMapper;

    public Page<SecurityAdmin> selectAll(String username, Integer userStatus, Integer pageNo) {
        SecurityAdminExample example = new SecurityAdminExample();
        SecurityAdminExample.Criteria criteria = example.createCriteria();
        if (username != null && !username.isEmpty()) criteria.andUsernameEqualTo(username);
        if (userStatus != null) criteria.andIsEnableEqualTo(userStatus);

        int count = securityAdminMapper.countByExample(example);

        example.setLimitStart((pageNo - 1) * 20);
        example.setLimitEnd(20);

        List<SecurityAdmin> securityAdmins = securityAdminMapper.selectByExample(example);
        Page<SecurityAdmin> page = new Page<SecurityAdmin>(count, pageNo, 20, securityAdmins);
        return page;
    }

    public SecurityAdmin save(SecurityAdmin securityAdmin, Integer role[]) {
        securityAdminMapper.insertSelective(securityAdmin);
        Map<String, Integer> params = null;
        if (role != null) {
            for (Integer roleId : role) {
                params = new HashMap<String, Integer>();
                params.put("adminId", securityAdmin.getId());
                params.put("roleId", roleId);
                securityAdminMapper.insertAdminRole(params);
            }
        }

        return securityAdmin;
    }

    public boolean delete(Integer id) {
        int num = securityAdminMapper.deleteByPrimaryKey(id);
        return num > 1 ? true : false;

    }

    public SecurityAdmin login(String username) {
        SecurityAdminExample example = new SecurityAdminExample();
        example.createCriteria().andUsernameEqualTo(username).andIsEnableEqualTo(1);
        return securityAdminMapper.login(example);
    }

    public SecurityAdmin selectById(Integer id) {
        return securityAdminMapper.selectByPrimaryKey(id);
    }

    public void update(Integer adminId, Integer[] role) {
        securityAdminMapper.deleteAdminRoles(adminId);
        Map<String, Integer> params = null;
        if (role != null) {
            for (Integer roleId : role) {
                params = new HashMap<String, Integer>();
                params.put("adminId", adminId);
                params.put("roleId", roleId);
                securityAdminMapper.insertAdminRole(params);
            }
        }
    }

    public SecurityAdmin update(SecurityAdmin admin) {
        securityAdminMapper.updateByPrimaryKey(admin);
        return admin;
    }

    public int updatePwdById(Integer id, String newPwd) {
        SecurityAdmin record = securityAdminMapper.selectByPrimaryKey(id);
        record.setPassword(newPwd);
        return securityAdminMapper.updateByPrimaryKey(record);
    }

    // api login
    public SecurityAdmin apiLogin(String username, String password) {
        SecurityAdminExample example = new SecurityAdminExample();
        example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password).andIsEnableEqualTo(1);
        List<SecurityAdmin> securityAdmin = securityAdminMapper.selectByExample(example);
        return securityAdmin.size() == 0 ? null : securityAdmin.get(0);
    }

    public int updateById(SecurityAdmin admin) {
        return securityAdminMapper.updateByPrimaryKeySelective(admin);
    }



    public Map<Integer, String> selectAll() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        SecurityAdminExample example = new SecurityAdminExample();
        List<SecurityAdmin> list = securityAdminMapper.selectByExample(example);
        for (SecurityAdmin securityAdmin : list) {
            map.put(securityAdmin.getId(), securityAdmin.getUsername());
        }
        return map;
    }
}

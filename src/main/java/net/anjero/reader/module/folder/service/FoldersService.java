package net.anjero.reader.module.folder.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import net.anjero.reader.module.folder.pojo.Folders;
import net.anjero.reader.module.folder.mapper.FoldersMapper;

@Service
public class FoldersService{

    @Resource
    private FoldersMapper foldersMapper;

    public int insert(Folders pojo){
        return foldersMapper.insert(pojo);
    }

    public int insertSelective(Folders pojo){
        return foldersMapper.insertSelective(pojo);
    }

    public int insertList(List<Folders> pojos){
        return foldersMapper.insertList(pojos);
    }

    public int update(Folders pojo){
        return foldersMapper.update(pojo);
    }
}

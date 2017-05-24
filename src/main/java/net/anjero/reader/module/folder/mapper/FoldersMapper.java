package net.anjero.reader.module.folder.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import net.anjero.reader.module.folder.pojo.Folders;

@Mapper
public interface FoldersMapper {
    int insert(@Param("pojo") Folders pojo);

    int insertSelective(@Param("pojo") Folders pojo);

    int insertList(@Param("pojos") List<Folders> pojo);

    int update(@Param("pojo") Folders pojo);
}

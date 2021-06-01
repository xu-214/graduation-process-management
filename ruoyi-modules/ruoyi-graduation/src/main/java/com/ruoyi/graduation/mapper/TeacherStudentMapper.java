package com.ruoyi.graduation.mapper;

import java.util.List;
import com.ruoyi.graduation.domain.TeacherStudent;

/**
 * 教师学生关联Mapper接口
 * 
 * @author xu
 * @date 2021-05-31
 */
public interface TeacherStudentMapper 
{
    /**
     * 查询教师学生关联
     * 
     * @param id 教师学生关联ID
     * @return 教师学生关联
     */
    public TeacherStudent selectTeacherStudentById(Long id);

    /**
     * 查询教师学生关联列表
     * 
     * @param teacherStudent 教师学生关联
     * @return 教师学生关联集合
     */
    public List<TeacherStudent> selectTeacherStudentList(TeacherStudent teacherStudent);

    /**
     * 新增教师学生关联
     * 
     * @param teacherStudent 教师学生关联
     * @return 结果
     */
    public int insertTeacherStudent(TeacherStudent teacherStudent);

    /**
     * 修改教师学生关联
     * 
     * @param teacherStudent 教师学生关联
     * @return 结果
     */
    public int updateTeacherStudent(TeacherStudent teacherStudent);

    /**
     * 删除教师学生关联
     * 
     * @param id 教师学生关联ID
     * @return 结果
     */
    public int deleteTeacherStudentById(Long id);

    /**
     * 批量删除教师学生关联
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTeacherStudentByIds(Long[] ids);
}

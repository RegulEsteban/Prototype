package mx.gob.shcp.dgtsi.sfu.proyectos.repository;

import java.util.List;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.AvanceFisico;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.AvanceFisicoExample;
import org.apache.ibatis.annotations.Param;

public interface AvanceFisicoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int countByExample(AvanceFisicoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByExample(AvanceFisicoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByPrimaryKey(Integer idAvanceFisico);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insert(AvanceFisico record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insertSelective(AvanceFisico record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    List<AvanceFisico> selectByExample(AvanceFisicoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    AvanceFisico selectByPrimaryKey(Integer idAvanceFisico);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExampleSelective(@Param("record") AvanceFisico record, @Param("example") AvanceFisicoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExample(@Param("record") AvanceFisico record, @Param("example") AvanceFisicoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKeySelective(AvanceFisico record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKey(AvanceFisico record);
}
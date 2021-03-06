package mx.gob.shcp.dgtsi.sfu.proyectos.repository;

import java.util.List;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.Proyecto;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.ProyectoExample;
import org.apache.ibatis.annotations.Param;

public interface ProyectoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int countByExample(ProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByExample(ProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByPrimaryKey(Integer idProyecto);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insert(Proyecto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insertSelective(Proyecto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    List<Proyecto> selectByExample(ProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    Proyecto selectByPrimaryKey(Integer idProyecto);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExampleSelective(@Param("record") Proyecto record, @Param("example") ProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExample(@Param("record") Proyecto record, @Param("example") ProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKeySelective(Proyecto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKey(Proyecto record);
}
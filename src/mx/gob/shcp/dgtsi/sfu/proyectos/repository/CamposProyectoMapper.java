package mx.gob.shcp.dgtsi.sfu.proyectos.repository;

import java.util.List;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.CamposProyecto;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.CamposProyectoExample;
import org.apache.ibatis.annotations.Param;

public interface CamposProyectoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAMPOS_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int countByExample(CamposProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAMPOS_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByExample(CamposProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAMPOS_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByPrimaryKey(Integer idCampo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAMPOS_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insert(CamposProyecto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAMPOS_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insertSelective(CamposProyecto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAMPOS_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    List<CamposProyecto> selectByExample(CamposProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAMPOS_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    CamposProyecto selectByPrimaryKey(Integer idCampo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAMPOS_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExampleSelective(@Param("record") CamposProyecto record, @Param("example") CamposProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAMPOS_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExample(@Param("record") CamposProyecto record, @Param("example") CamposProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAMPOS_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKeySelective(CamposProyecto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAMPOS_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKey(CamposProyecto record);
}
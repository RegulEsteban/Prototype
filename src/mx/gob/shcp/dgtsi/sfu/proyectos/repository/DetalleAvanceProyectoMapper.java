package mx.gob.shcp.dgtsi.sfu.proyectos.repository;

import java.util.List;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.DetalleAvanceProyecto;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.DetalleAvanceProyectoExample;
import org.apache.ibatis.annotations.Param;

public interface DetalleAvanceProyectoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_AVANCE_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int countByExample(DetalleAvanceProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_AVANCE_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByExample(DetalleAvanceProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_AVANCE_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByPrimaryKey(Integer idDetalle);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_AVANCE_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insert(DetalleAvanceProyecto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_AVANCE_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insertSelective(DetalleAvanceProyecto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_AVANCE_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    List<DetalleAvanceProyecto> selectByExample(DetalleAvanceProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_AVANCE_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    DetalleAvanceProyecto selectByPrimaryKey(Integer idDetalle);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_AVANCE_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExampleSelective(@Param("record") DetalleAvanceProyecto record, @Param("example") DetalleAvanceProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_AVANCE_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExample(@Param("record") DetalleAvanceProyecto record, @Param("example") DetalleAvanceProyectoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_AVANCE_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKeySelective(DetalleAvanceProyecto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_AVANCE_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKey(DetalleAvanceProyecto record);
}
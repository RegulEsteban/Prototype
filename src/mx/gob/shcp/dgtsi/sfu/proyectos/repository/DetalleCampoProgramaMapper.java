package mx.gob.shcp.dgtsi.sfu.proyectos.repository;

import java.util.List;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.DetalleCampoPrograma;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.DetalleCampoProgramaExample;
import org.apache.ibatis.annotations.Param;

public interface DetalleCampoProgramaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int countByExample(DetalleCampoProgramaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByExample(DetalleCampoProgramaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByPrimaryKey(Integer idCampoPrograma);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insert(DetalleCampoPrograma record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insertSelective(DetalleCampoPrograma record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    List<DetalleCampoPrograma> selectByExample(DetalleCampoProgramaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    DetalleCampoPrograma selectByPrimaryKey(Integer idCampoPrograma);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExampleSelective(@Param("record") DetalleCampoPrograma record, @Param("example") DetalleCampoProgramaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExample(@Param("record") DetalleCampoPrograma record, @Param("example") DetalleCampoProgramaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKeySelective(DetalleCampoPrograma record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKey(DetalleCampoPrograma record);
}
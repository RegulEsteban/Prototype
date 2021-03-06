package mx.gob.shcp.dgtsi.sfu.proyectos.repository;

import java.math.BigDecimal;
import java.util.List;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.Institucion;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.InstitucionExample;
import org.apache.ibatis.annotations.Param;

public interface InstitucionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int countByExample(InstitucionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByExample(InstitucionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByPrimaryKey(BigDecimal idInstitucion);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insert(Institucion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insertSelective(Institucion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    List<Institucion> selectByExample(InstitucionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    Institucion selectByPrimaryKey(BigDecimal idInstitucion);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExampleSelective(@Param("record") Institucion record, @Param("example") InstitucionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExample(@Param("record") Institucion record, @Param("example") InstitucionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKeySelective(Institucion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKey(Institucion record);
}
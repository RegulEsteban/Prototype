package mx.gob.shcp.dgtsi.sfu.proyectos.repository;

import java.util.List;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.TipoRecurso;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.TipoRecursoExample;
import org.apache.ibatis.annotations.Param;

public interface TipoRecursoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIPO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int countByExample(TipoRecursoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIPO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByExample(TipoRecursoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIPO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByPrimaryKey(Integer idTipoRecurso);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIPO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insert(TipoRecurso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIPO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insertSelective(TipoRecurso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIPO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    List<TipoRecurso> selectByExample(TipoRecursoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIPO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    TipoRecurso selectByPrimaryKey(Integer idTipoRecurso);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIPO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExampleSelective(@Param("record") TipoRecurso record, @Param("example") TipoRecursoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIPO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExample(@Param("record") TipoRecurso record, @Param("example") TipoRecursoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIPO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKeySelective(TipoRecurso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIPO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKey(TipoRecurso record);
}
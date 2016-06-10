package mx.gob.shcp.dgtsi.sfu.proyectos.repository;

import java.util.List;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.Contrato;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.ContratoExample;
import org.apache.ibatis.annotations.Param;

public interface ContratoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int countByExample(ContratoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByExample(ContratoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByPrimaryKey(Integer idContrato);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insert(Contrato record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insertSelective(Contrato record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    List<Contrato> selectByExample(ContratoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    Contrato selectByPrimaryKey(Integer idContrato);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExampleSelective(@Param("record") Contrato record, @Param("example") ContratoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExample(@Param("record") Contrato record, @Param("example") ContratoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKeySelective(Contrato record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKey(Contrato record);
}
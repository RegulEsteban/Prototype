package mx.gob.shcp.dgtsi.sfu.administracion.repository;

import java.math.BigDecimal;
import java.util.List;
import mx.gob.shcp.dgtsi.sfu.administracion.model.DetalleUsuarioRol;
import mx.gob.shcp.dgtsi.sfu.administracion.model.DetalleUsuarioRolExample;
import org.apache.ibatis.annotations.Param;

public interface DetalleUsuarioRolMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_USUARIO_ROL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int countByExample(DetalleUsuarioRolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_USUARIO_ROL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByExample(DetalleUsuarioRolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_USUARIO_ROL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int deleteByPrimaryKey(BigDecimal idUsuarioRol);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_USUARIO_ROL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insert(DetalleUsuarioRol record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_USUARIO_ROL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int insertSelective(DetalleUsuarioRol record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_USUARIO_ROL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    List<DetalleUsuarioRol> selectByExample(DetalleUsuarioRolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_USUARIO_ROL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    DetalleUsuarioRol selectByPrimaryKey(BigDecimal idUsuarioRol);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_USUARIO_ROL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExampleSelective(@Param("record") DetalleUsuarioRol record, @Param("example") DetalleUsuarioRolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_USUARIO_ROL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByExample(@Param("record") DetalleUsuarioRol record, @Param("example") DetalleUsuarioRolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_USUARIO_ROL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKeySelective(DetalleUsuarioRol record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETALLE_USUARIO_ROL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    int updateByPrimaryKey(DetalleUsuarioRol record);
}
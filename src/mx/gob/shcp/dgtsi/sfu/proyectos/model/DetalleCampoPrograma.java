package mx.gob.shcp.dgtsi.sfu.proyectos.model;

import java.math.BigDecimal;

public class DetalleCampoPrograma {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETALLE_CAMPO_PROGRAMA.ID_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idCampoPrograma;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETALLE_CAMPO_PROGRAMA.ID_PROGRAMA_PRES
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private BigDecimal idProgramaPres;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETALLE_CAMPO_PROGRAMA.ID_CAMPO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idCampo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETALLE_CAMPO_PROGRAMA.ESTATUS
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String estatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETALLE_CAMPO_PROGRAMA.ID_CAMPO_PROGRAMA
     *
     * @return the value of DETALLE_CAMPO_PROGRAMA.ID_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdCampoPrograma() {
        return idCampoPrograma;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETALLE_CAMPO_PROGRAMA.ID_CAMPO_PROGRAMA
     *
     * @param idCampoPrograma the value for DETALLE_CAMPO_PROGRAMA.ID_CAMPO_PROGRAMA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdCampoPrograma(Integer idCampoPrograma) {
        this.idCampoPrograma = idCampoPrograma;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETALLE_CAMPO_PROGRAMA.ID_PROGRAMA_PRES
     *
     * @return the value of DETALLE_CAMPO_PROGRAMA.ID_PROGRAMA_PRES
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public BigDecimal getIdProgramaPres() {
        return idProgramaPres;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETALLE_CAMPO_PROGRAMA.ID_PROGRAMA_PRES
     *
     * @param idProgramaPres the value for DETALLE_CAMPO_PROGRAMA.ID_PROGRAMA_PRES
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdProgramaPres(BigDecimal idProgramaPres) {
        this.idProgramaPres = idProgramaPres;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETALLE_CAMPO_PROGRAMA.ID_CAMPO
     *
     * @return the value of DETALLE_CAMPO_PROGRAMA.ID_CAMPO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdCampo() {
        return idCampo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETALLE_CAMPO_PROGRAMA.ID_CAMPO
     *
     * @param idCampo the value for DETALLE_CAMPO_PROGRAMA.ID_CAMPO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdCampo(Integer idCampo) {
        this.idCampo = idCampo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETALLE_CAMPO_PROGRAMA.ESTATUS
     *
     * @return the value of DETALLE_CAMPO_PROGRAMA.ESTATUS
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETALLE_CAMPO_PROGRAMA.ESTATUS
     *
     * @param estatus the value for DETALLE_CAMPO_PROGRAMA.ESTATUS
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus == null ? null : estatus.trim();
    }
}
package mx.gob.shcp.dgtsi.sfu.proyectos.model;

import java.math.BigDecimal;

public class DetalleProyectoRecurso {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETALLE_PROYECTO_RECURSO.ID_DETALLE_PROYECTO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idDetalleProyectoRecurso;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETALLE_PROYECTO_RECURSO.ID_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idProyecto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETALLE_PROYECTO_RECURSO.ID_PROGRAMA_PRES
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private BigDecimal idProgramaPres;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETALLE_PROYECTO_RECURSO.ID_DETALLE_PROYECTO_RECURSO
     *
     * @return the value of DETALLE_PROYECTO_RECURSO.ID_DETALLE_PROYECTO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdDetalleProyectoRecurso() {
        return idDetalleProyectoRecurso;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETALLE_PROYECTO_RECURSO.ID_DETALLE_PROYECTO_RECURSO
     *
     * @param idDetalleProyectoRecurso the value for DETALLE_PROYECTO_RECURSO.ID_DETALLE_PROYECTO_RECURSO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdDetalleProyectoRecurso(Integer idDetalleProyectoRecurso) {
        this.idDetalleProyectoRecurso = idDetalleProyectoRecurso;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETALLE_PROYECTO_RECURSO.ID_PROYECTO
     *
     * @return the value of DETALLE_PROYECTO_RECURSO.ID_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdProyecto() {
        return idProyecto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETALLE_PROYECTO_RECURSO.ID_PROYECTO
     *
     * @param idProyecto the value for DETALLE_PROYECTO_RECURSO.ID_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETALLE_PROYECTO_RECURSO.ID_PROGRAMA_PRES
     *
     * @return the value of DETALLE_PROYECTO_RECURSO.ID_PROGRAMA_PRES
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public BigDecimal getIdProgramaPres() {
        return idProgramaPres;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETALLE_PROYECTO_RECURSO.ID_PROGRAMA_PRES
     *
     * @param idProgramaPres the value for DETALLE_PROYECTO_RECURSO.ID_PROGRAMA_PRES
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdProgramaPres(BigDecimal idProgramaPres) {
        this.idProgramaPres = idProgramaPres;
    }
}
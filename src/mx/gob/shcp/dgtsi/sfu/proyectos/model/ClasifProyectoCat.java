package mx.gob.shcp.dgtsi.sfu.proyectos.model;

public class ClasifProyectoCat {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLASIF_PROYECTO_CAT.ID_CLASIF_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idClasifProyecto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLASIF_PROYECTO_CAT.DESCRIPCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String descripcion;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLASIF_PROYECTO_CAT.ID_CLASIF_PROYECTO
     *
     * @return the value of CLASIF_PROYECTO_CAT.ID_CLASIF_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdClasifProyecto() {
        return idClasifProyecto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLASIF_PROYECTO_CAT.ID_CLASIF_PROYECTO
     *
     * @param idClasifProyecto the value for CLASIF_PROYECTO_CAT.ID_CLASIF_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdClasifProyecto(Integer idClasifProyecto) {
        this.idClasifProyecto = idClasifProyecto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLASIF_PROYECTO_CAT.DESCRIPCION
     *
     * @return the value of CLASIF_PROYECTO_CAT.DESCRIPCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLASIF_PROYECTO_CAT.DESCRIPCION
     *
     * @param descripcion the value for CLASIF_PROYECTO_CAT.DESCRIPCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }
}
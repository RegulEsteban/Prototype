package mx.gob.shcp.dgtsi.sfu.proyectos.model;

public class UnidadMedidaCat {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNIDAD_MEDIDA_CAT.ID_UNIDAD_MEDIDA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idUnidadMedida;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNIDAD_MEDIDA_CAT.DESCRIPCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String descripcion;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNIDAD_MEDIDA_CAT.ID_UNIDAD_MEDIDA
     *
     * @return the value of UNIDAD_MEDIDA_CAT.ID_UNIDAD_MEDIDA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdUnidadMedida() {
        return idUnidadMedida;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNIDAD_MEDIDA_CAT.ID_UNIDAD_MEDIDA
     *
     * @param idUnidadMedida the value for UNIDAD_MEDIDA_CAT.ID_UNIDAD_MEDIDA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdUnidadMedida(Integer idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNIDAD_MEDIDA_CAT.DESCRIPCION
     *
     * @return the value of UNIDAD_MEDIDA_CAT.DESCRIPCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNIDAD_MEDIDA_CAT.DESCRIPCION
     *
     * @param descripcion the value for UNIDAD_MEDIDA_CAT.DESCRIPCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }
}
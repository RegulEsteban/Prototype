package mx.gob.shcp.dgtsi.sfu.proyectos.model;

public class Estado {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ESTADO.ID_ESTADO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idEstado;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ESTADO.NOMBRE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String nombre;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ESTADO.ID_ESTADO
     *
     * @return the value of ESTADO.ID_ESTADO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdEstado() {
        return idEstado;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ESTADO.ID_ESTADO
     *
     * @param idEstado the value for ESTADO.ID_ESTADO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ESTADO.NOMBRE
     *
     * @return the value of ESTADO.NOMBRE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ESTADO.NOMBRE
     *
     * @param nombre the value for ESTADO.NOMBRE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }
}
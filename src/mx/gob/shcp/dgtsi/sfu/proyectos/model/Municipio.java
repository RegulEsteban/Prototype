package mx.gob.shcp.dgtsi.sfu.proyectos.model;

public class Municipio {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MUNICIPIO.ID_MUNICIPIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idMunicipio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MUNICIPIO.NOMBRE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String nombre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MUNICIPIO.ID_ESTADO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idEstado;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MUNICIPIO.ID_MUNICIPIO
     *
     * @return the value of MUNICIPIO.ID_MUNICIPIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MUNICIPIO.ID_MUNICIPIO
     *
     * @param idMunicipio the value for MUNICIPIO.ID_MUNICIPIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MUNICIPIO.NOMBRE
     *
     * @return the value of MUNICIPIO.NOMBRE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MUNICIPIO.NOMBRE
     *
     * @param nombre the value for MUNICIPIO.NOMBRE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MUNICIPIO.ID_ESTADO
     *
     * @return the value of MUNICIPIO.ID_ESTADO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdEstado() {
        return idEstado;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MUNICIPIO.ID_ESTADO
     *
     * @param idEstado the value for MUNICIPIO.ID_ESTADO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
}
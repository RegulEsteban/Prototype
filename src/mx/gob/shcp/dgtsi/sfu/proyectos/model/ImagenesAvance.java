package mx.gob.shcp.dgtsi.sfu.proyectos.model;

public class ImagenesAvance {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IMAGENES_AVANCE.ID_IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idImagenesAvance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IMAGENES_AVANCE.IMAGEN
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String imagen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IMAGENES_AVANCE.ID_AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idAvanceFisico;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMAGENES_AVANCE.ID_IMAGENES_AVANCE
     *
     * @return the value of IMAGENES_AVANCE.ID_IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdImagenesAvance() {
        return idImagenesAvance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMAGENES_AVANCE.ID_IMAGENES_AVANCE
     *
     * @param idImagenesAvance the value for IMAGENES_AVANCE.ID_IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdImagenesAvance(Integer idImagenesAvance) {
        this.idImagenesAvance = idImagenesAvance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMAGENES_AVANCE.IMAGEN
     *
     * @return the value of IMAGENES_AVANCE.IMAGEN
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMAGENES_AVANCE.IMAGEN
     *
     * @param imagen the value for IMAGENES_AVANCE.IMAGEN
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setImagen(String imagen) {
        this.imagen = imagen == null ? null : imagen.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMAGENES_AVANCE.ID_AVANCE_FISICO
     *
     * @return the value of IMAGENES_AVANCE.ID_AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdAvanceFisico() {
        return idAvanceFisico;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMAGENES_AVANCE.ID_AVANCE_FISICO
     *
     * @param idAvanceFisico the value for IMAGENES_AVANCE.ID_AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdAvanceFisico(Integer idAvanceFisico) {
        this.idAvanceFisico = idAvanceFisico;
    }
}
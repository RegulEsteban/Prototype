package mx.gob.shcp.dgtsi.sfu.proyectos.model;

import java.math.BigDecimal;
import java.util.Date;

public class Proyecto {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.ID_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idProyecto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.FOLIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String folio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.NOMBRE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String nombre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.INST_EJECUTORA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String instEjecutora;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.FECHA_INICIAL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Date fechaInicial;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.FECHA_ESTIMADA_FINAL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Date fechaEstimadaFinal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.FECHA_FINAL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Date fechaFinal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.DIRECCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String direccion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.LONGITUD
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private BigDecimal longitud;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.LATITUD
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private BigDecimal latitud;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.ESTATUS
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Short estatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.IMAGEN
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String imagen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.MONTO_APROBADO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private BigDecimal montoAprobado;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.CANTIDAD_META
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer cantidadMeta;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.ID_TIPO_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idTipoProyecto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.ID_CLASIF_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idClasifProyecto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.ID_MUNICIPIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idMunicipio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROYECTO.ID_UNIDAD_MEDIDA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idUnidadMedida;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.ID_PROYECTO
     *
     * @return the value of PROYECTO.ID_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdProyecto() {
        return idProyecto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.ID_PROYECTO
     *
     * @param idProyecto the value for PROYECTO.ID_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.FOLIO
     *
     * @return the value of PROYECTO.FOLIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getFolio() {
        return folio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.FOLIO
     *
     * @param folio the value for PROYECTO.FOLIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setFolio(String folio) {
        this.folio = folio == null ? null : folio.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.NOMBRE
     *
     * @return the value of PROYECTO.NOMBRE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.NOMBRE
     *
     * @param nombre the value for PROYECTO.NOMBRE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.INST_EJECUTORA
     *
     * @return the value of PROYECTO.INST_EJECUTORA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getInstEjecutora() {
        return instEjecutora;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.INST_EJECUTORA
     *
     * @param instEjecutora the value for PROYECTO.INST_EJECUTORA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setInstEjecutora(String instEjecutora) {
        this.instEjecutora = instEjecutora == null ? null : instEjecutora.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.FECHA_INICIAL
     *
     * @return the value of PROYECTO.FECHA_INICIAL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Date getFechaInicial() {
        return fechaInicial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.FECHA_INICIAL
     *
     * @param fechaInicial the value for PROYECTO.FECHA_INICIAL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.FECHA_ESTIMADA_FINAL
     *
     * @return the value of PROYECTO.FECHA_ESTIMADA_FINAL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Date getFechaEstimadaFinal() {
        return fechaEstimadaFinal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.FECHA_ESTIMADA_FINAL
     *
     * @param fechaEstimadaFinal the value for PROYECTO.FECHA_ESTIMADA_FINAL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setFechaEstimadaFinal(Date fechaEstimadaFinal) {
        this.fechaEstimadaFinal = fechaEstimadaFinal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.FECHA_FINAL
     *
     * @return the value of PROYECTO.FECHA_FINAL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.FECHA_FINAL
     *
     * @param fechaFinal the value for PROYECTO.FECHA_FINAL
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.DIRECCION
     *
     * @return the value of PROYECTO.DIRECCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.DIRECCION
     *
     * @param direccion the value for PROYECTO.DIRECCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion == null ? null : direccion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.LONGITUD
     *
     * @return the value of PROYECTO.LONGITUD
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public BigDecimal getLongitud() {
        return longitud;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.LONGITUD
     *
     * @param longitud the value for PROYECTO.LONGITUD
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.LATITUD
     *
     * @return the value of PROYECTO.LATITUD
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public BigDecimal getLatitud() {
        return latitud;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.LATITUD
     *
     * @param latitud the value for PROYECTO.LATITUD
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.ESTATUS
     *
     * @return the value of PROYECTO.ESTATUS
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Short getEstatus() {
        return estatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.ESTATUS
     *
     * @param estatus the value for PROYECTO.ESTATUS
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setEstatus(Short estatus) {
        this.estatus = estatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.IMAGEN
     *
     * @return the value of PROYECTO.IMAGEN
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.IMAGEN
     *
     * @param imagen the value for PROYECTO.IMAGEN
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setImagen(String imagen) {
        this.imagen = imagen == null ? null : imagen.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.MONTO_APROBADO
     *
     * @return the value of PROYECTO.MONTO_APROBADO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public BigDecimal getMontoAprobado() {
        return montoAprobado;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.MONTO_APROBADO
     *
     * @param montoAprobado the value for PROYECTO.MONTO_APROBADO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setMontoAprobado(BigDecimal montoAprobado) {
        this.montoAprobado = montoAprobado;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.CANTIDAD_META
     *
     * @return the value of PROYECTO.CANTIDAD_META
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getCantidadMeta() {
        return cantidadMeta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.CANTIDAD_META
     *
     * @param cantidadMeta the value for PROYECTO.CANTIDAD_META
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setCantidadMeta(Integer cantidadMeta) {
        this.cantidadMeta = cantidadMeta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.ID_TIPO_PROYECTO
     *
     * @return the value of PROYECTO.ID_TIPO_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdTipoProyecto() {
        return idTipoProyecto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.ID_TIPO_PROYECTO
     *
     * @param idTipoProyecto the value for PROYECTO.ID_TIPO_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdTipoProyecto(Integer idTipoProyecto) {
        this.idTipoProyecto = idTipoProyecto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.ID_CLASIF_PROYECTO
     *
     * @return the value of PROYECTO.ID_CLASIF_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdClasifProyecto() {
        return idClasifProyecto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.ID_CLASIF_PROYECTO
     *
     * @param idClasifProyecto the value for PROYECTO.ID_CLASIF_PROYECTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdClasifProyecto(Integer idClasifProyecto) {
        this.idClasifProyecto = idClasifProyecto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.ID_MUNICIPIO
     *
     * @return the value of PROYECTO.ID_MUNICIPIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.ID_MUNICIPIO
     *
     * @param idMunicipio the value for PROYECTO.ID_MUNICIPIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROYECTO.ID_UNIDAD_MEDIDA
     *
     * @return the value of PROYECTO.ID_UNIDAD_MEDIDA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdUnidadMedida() {
        return idUnidadMedida;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROYECTO.ID_UNIDAD_MEDIDA
     *
     * @param idUnidadMedida the value for PROYECTO.ID_UNIDAD_MEDIDA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdUnidadMedida(Integer idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }
}
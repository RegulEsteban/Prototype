package mx.gob.shcp.dgtsi.sfu.proyectos.model;

import java.math.BigDecimal;
import java.util.Date;

public class Contrato {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.ID_CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idContrato;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.RFC_CONVOCANTE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String rfcConvocante;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.RFC_CONTRATISTA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String rfcContratista;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.CONVOCANTE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String convocante;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.CONTRATISTA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String contratista;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.NUM_PROCEDIMIENTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String numProcedimiento;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.TIPO_PROCEDIMIENTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String tipoProcedimiento;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.TIPO_CONTRATACION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String tipoContratacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.DESCRIPCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String descripcion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.VINCULO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String vinculo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.FECHA_CONCLUSION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Date fechaConclusion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.VINCULO_TERMINO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String vinculoTermino;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.MONTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private BigDecimal monto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONTRATO.MODIFICADO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private BigDecimal modificado;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.ID_CONTRATO
     *
     * @return the value of CONTRATO.ID_CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdContrato() {
        return idContrato;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.ID_CONTRATO
     *
     * @param idContrato the value for CONTRATO.ID_CONTRATO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.RFC_CONVOCANTE
     *
     * @return the value of CONTRATO.RFC_CONVOCANTE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getRfcConvocante() {
        return rfcConvocante;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.RFC_CONVOCANTE
     *
     * @param rfcConvocante the value for CONTRATO.RFC_CONVOCANTE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setRfcConvocante(String rfcConvocante) {
        this.rfcConvocante = rfcConvocante == null ? null : rfcConvocante.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.RFC_CONTRATISTA
     *
     * @return the value of CONTRATO.RFC_CONTRATISTA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getRfcContratista() {
        return rfcContratista;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.RFC_CONTRATISTA
     *
     * @param rfcContratista the value for CONTRATO.RFC_CONTRATISTA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setRfcContratista(String rfcContratista) {
        this.rfcContratista = rfcContratista == null ? null : rfcContratista.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.CONVOCANTE
     *
     * @return the value of CONTRATO.CONVOCANTE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getConvocante() {
        return convocante;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.CONVOCANTE
     *
     * @param convocante the value for CONTRATO.CONVOCANTE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setConvocante(String convocante) {
        this.convocante = convocante == null ? null : convocante.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.CONTRATISTA
     *
     * @return the value of CONTRATO.CONTRATISTA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getContratista() {
        return contratista;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.CONTRATISTA
     *
     * @param contratista the value for CONTRATO.CONTRATISTA
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setContratista(String contratista) {
        this.contratista = contratista == null ? null : contratista.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.NUM_PROCEDIMIENTO
     *
     * @return the value of CONTRATO.NUM_PROCEDIMIENTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getNumProcedimiento() {
        return numProcedimiento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.NUM_PROCEDIMIENTO
     *
     * @param numProcedimiento the value for CONTRATO.NUM_PROCEDIMIENTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setNumProcedimiento(String numProcedimiento) {
        this.numProcedimiento = numProcedimiento == null ? null : numProcedimiento.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.TIPO_PROCEDIMIENTO
     *
     * @return the value of CONTRATO.TIPO_PROCEDIMIENTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getTipoProcedimiento() {
        return tipoProcedimiento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.TIPO_PROCEDIMIENTO
     *
     * @param tipoProcedimiento the value for CONTRATO.TIPO_PROCEDIMIENTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setTipoProcedimiento(String tipoProcedimiento) {
        this.tipoProcedimiento = tipoProcedimiento == null ? null : tipoProcedimiento.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.TIPO_CONTRATACION
     *
     * @return the value of CONTRATO.TIPO_CONTRATACION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getTipoContratacion() {
        return tipoContratacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.TIPO_CONTRATACION
     *
     * @param tipoContratacion the value for CONTRATO.TIPO_CONTRATACION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setTipoContratacion(String tipoContratacion) {
        this.tipoContratacion = tipoContratacion == null ? null : tipoContratacion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.DESCRIPCION
     *
     * @return the value of CONTRATO.DESCRIPCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.DESCRIPCION
     *
     * @param descripcion the value for CONTRATO.DESCRIPCION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.VINCULO
     *
     * @return the value of CONTRATO.VINCULO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getVinculo() {
        return vinculo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.VINCULO
     *
     * @param vinculo the value for CONTRATO.VINCULO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setVinculo(String vinculo) {
        this.vinculo = vinculo == null ? null : vinculo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.FECHA_CONCLUSION
     *
     * @return the value of CONTRATO.FECHA_CONCLUSION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Date getFechaConclusion() {
        return fechaConclusion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.FECHA_CONCLUSION
     *
     * @param fechaConclusion the value for CONTRATO.FECHA_CONCLUSION
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setFechaConclusion(Date fechaConclusion) {
        this.fechaConclusion = fechaConclusion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.VINCULO_TERMINO
     *
     * @return the value of CONTRATO.VINCULO_TERMINO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getVinculoTermino() {
        return vinculoTermino;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.VINCULO_TERMINO
     *
     * @param vinculoTermino the value for CONTRATO.VINCULO_TERMINO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setVinculoTermino(String vinculoTermino) {
        this.vinculoTermino = vinculoTermino == null ? null : vinculoTermino.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.MONTO
     *
     * @return the value of CONTRATO.MONTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.MONTO
     *
     * @param monto the value for CONTRATO.MONTO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONTRATO.MODIFICADO
     *
     * @return the value of CONTRATO.MODIFICADO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public BigDecimal getModificado() {
        return modificado;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONTRATO.MODIFICADO
     *
     * @param modificado the value for CONTRATO.MODIFICADO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setModificado(BigDecimal modificado) {
        this.modificado = modificado;
    }
}
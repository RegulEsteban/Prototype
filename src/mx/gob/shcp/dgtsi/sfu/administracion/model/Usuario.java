package mx.gob.shcp.dgtsi.sfu.administracion.model;

public class Usuario {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USUARIO.ID_USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private Integer idUsuario;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USUARIO.USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String usuario;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USUARIO.PASSWORD
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USUARIO.ESTATUS
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String estatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USUARIO.NOMBRE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String nombre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USUARIO.AP_PATERNO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String apPaterno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USUARIO.AP_MATERNO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String apMaterno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USUARIO.CORREO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    private String correo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USUARIO.ID_USUARIO
     *
     * @return the value of USUARIO.ID_USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USUARIO.ID_USUARIO
     *
     * @param idUsuario the value for USUARIO.ID_USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USUARIO.USUARIO
     *
     * @return the value of USUARIO.USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USUARIO.USUARIO
     *
     * @param usuario the value for USUARIO.USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario == null ? null : usuario.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USUARIO.PASSWORD
     *
     * @return the value of USUARIO.PASSWORD
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USUARIO.PASSWORD
     *
     * @param password the value for USUARIO.PASSWORD
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USUARIO.ESTATUS
     *
     * @return the value of USUARIO.ESTATUS
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USUARIO.ESTATUS
     *
     * @param estatus the value for USUARIO.ESTATUS
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus == null ? null : estatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USUARIO.NOMBRE
     *
     * @return the value of USUARIO.NOMBRE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USUARIO.NOMBRE
     *
     * @param nombre the value for USUARIO.NOMBRE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USUARIO.AP_PATERNO
     *
     * @return the value of USUARIO.AP_PATERNO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getApPaterno() {
        return apPaterno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USUARIO.AP_PATERNO
     *
     * @param apPaterno the value for USUARIO.AP_PATERNO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno == null ? null : apPaterno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USUARIO.AP_MATERNO
     *
     * @return the value of USUARIO.AP_MATERNO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getApMaterno() {
        return apMaterno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USUARIO.AP_MATERNO
     *
     * @param apMaterno the value for USUARIO.AP_MATERNO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno == null ? null : apMaterno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USUARIO.CORREO
     *
     * @return the value of USUARIO.CORREO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USUARIO.CORREO
     *
     * @param correo the value for USUARIO.CORREO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setCorreo(String correo) {
        this.correo = correo == null ? null : correo.trim();
    }
}
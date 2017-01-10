package com.allianz.drmk22.beans;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;


public class ClientDTO {
	
	private ArrayList <String> errores;
	private ArrayList <String> avisos;
	private ArrayList <String> bloqueos;
	private int retorno;
	
	
	private short ramo;
	private short modalidad;
	private short subproducto;
	private String rolUma;
	private int poliza;
	private short aplica;
	private String usuario;
	private String perfil;
	private int agente;
	private int numOpeBlo;
	private short operativa;
	private short opcMenu;
	private short cia;
	private short moneda;
	private int nivelSeguridad;
	private int numeroOperacion;
	private long item;
	
	private String contextLog;
	private BigDecimal totActivos;
	private BigDecimal totPassivos;
	private BigDecimal vlegresos;
	
	private int numeroCliente;
	private String dni;
	private String tipoDoc;
	private String nifEur;
	private String clExtran;
	private String pais;
	private String apellido1;
	private String apellido2;
	private String nombre;
	private String claveCl;
	private String idioma;
	private short codSitur;
	private int fechExpedicion;
	private String organoEmisor;
	
	private String codigoVia;
	private String nombreVia;
	private int numVia;
	private String piso;
	private String puerta;
	private String bloqueVia;
	private String escalera;
	private String nomFon;
	private String domAbrev;
	private String codPostal;
	private String subCodPost;
	private String localidad;
	private String distrito;
	private String concelho;
	private String paisDom;
	private String tipoDomicilio;
	private String domicilioFamiliar;
	
	private String fechaNacimiento;
	private String fechaCarnet;
	private String fechaCarnetMoto;
	private String tipoCarnet;
	private String paisCarnet;
	private String sexo;
	private String estadoCivil;
	private short profesion;
	private String telefono;
	private String telefono2;
	private String fax;
	private String email1;
	private String email2;
	private String estadoTelefono1;
	private String estadoTelefono2;
	private String estadoEmail;
	private String confComEle;
	private int cae;
	private short ciiu;
	private short situacionLaboral;
	private String impselo;
	private short numeroHijos;
	private String celular;
	private String afianzado;
	private String fideComitente;
	private String tipoEmpresa;
	private String robinson;
	private BigDecimal importePtmo;
	private short orden;
	private String nomeMae;
	private long pis;
	private long inss;
	private short rendaMensal;
	private String emailFac;
	private String nomFantasia;
	private String natureza;
	private String ocupacion;
	private short faixaFatur;
	private short numeroFuncionarios;
	private short patrimonio;
	private String actividadPrincipal;
	
	private String tipoDocTomador;
	private String dniTomador;
	private String nombreTomador;
	private String impostosFatca;
	private String fechCaduc;
	
	private String paisFacturacion;
	private String fechaCaducidad;
	private String ustin;
	private String paisTutor;
	private String paisNac;
	private String giin;
	private String tipoEntidad;
	private String ifGiin;
	private String cotBolso;
	private String partentFin;
	private String socioSus;
	private String usOwnerShip;
	private String pagaImpUsa;
	private String clasificFatCA;
	private String reportable;
	private String cliModif;
	private String cnae;
	private long codigoNascidoVivo;
	private String codigoProvincia;
	private String codNumHijos;
	private String conocimiento;
	private String cuenta;
	private String dataExpiracaoTin;
	private String descripcionPoblacion;
	private String digito;
	private String disponible;
	private String dniRepresentanteLegal;
	private String domicilio;
	private String entidad;
	private String estadoFax;
	private String estadoTelefono3;
	private Short faturamento;
	private String fechaVtoPrestamo;
	private String fechComEle;
	private String fechaModEmail;
	private String flagSharesFinanceiros;
	private String grintnro;
	private String idiomaDocum;
	private String irrevocable;
	private String lopd;
	private String municipio;
	private String nCarnet;
	private String nGranCli;
	private String nombreCompleto;
	private String nombreEditable;
	private String nombreRepresentanteLegal;
	private String num;
	private String numeroBeneficiarios;
	private int numBeneficiario;
	private String numEmp;
	private String numeroas;
	private String oficina;
	private String origenCli;
	private String origModEmail;
	private String paisEntidadeLegal;
	private String paisImpostos;
	private String paisOrigen;
	private String paisSede;
	private String paisValidacion;
	private String porcentajeBeneficio;
	private String porcentajeCapital;
	private String selo;
	private String statusFatca;
	private String taxIdentificationNumber;
	private String telefono3;
	private String tipo;
	private String tipodo;
	private String tipoBeneficiario;
	private String tipoDocRepresentanteLegal;
	private String usuaModConf;
	private String usuaModEmail;
	private String via;
	private String vip;
	private String codigoPostal;
	private String desMunicipio;
	private String banco;
	private String digitoControl;
	private String coordX;
	private String coordY;
	private String prfocup;
	private String confComSms;
	private String resFiscFora;
	private String paisResFisc;
	private String tipoDoExt;
	private String numFiscExt;
	private String resFiscExt;
	private String clasifCcrs;
	private String reportCrs;
	private String fechCadExt;
	private String codRegime;
	private String dirinstFin;
	private String referencia;
	

	public ClientDTO(){
		super();
		this.numBeneficiario = 0;
	}
	
	public short getRamo() {
		return ramo;
	}
	public void setRamo(short ramo) {
		this.ramo = ramo;
	}
	public short getModalidad() {
		return modalidad;
	}
	public void setModalidad(short modalidad) {
		this.modalidad = modalidad;
	}
	public short getSubproducto() {
		return subproducto;
	}
	public void setSubproducto(short subproducto) {
		this.subproducto = subproducto;
	}
	public String getRolUma() {
		return rolUma;
	}
	public void setRolUma(String rolUma) {
		this.rolUma = rolUma;
	}
	
	public int getPoliza() {
		return poliza;
	}

	public void setPoliza(int poliza) {
		this.poliza = poliza;
	}

	public void setPoliza(short poliza) {
		this.poliza = poliza;
	}
	public short getAplica() {
		return aplica;
	}
	public void setAplica(short aplica) {
		this.aplica = aplica;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public int getAgente() {
		return agente;
	}
	public void setAgente(int agente) {
		this.agente = agente;
	}

	public int getNumOpeBlo() {
		return numOpeBlo;
	}
	public void setNumOpeBlo(int numOpeBlo) {
		this.numOpeBlo = numOpeBlo;
	}
	public short getOperativa() {
		return operativa;
	}
	public void setOperativa(short operativa) {
		this.operativa = operativa;
	}
	public short getOpcMenu() {
		return opcMenu;
	}
	public void setOpcMenu(short opcMenu) {
		this.opcMenu = opcMenu;
	}
	public short getCia() {
		return cia;
	}
	public void setCia(short cia) {
		this.cia = cia;
	}
	public short getMoneda() {
		return moneda;
	}
	public void setMoneda(short moneda) {
		this.moneda = moneda;
	}
	public int getNivelSeguridad() {
		return nivelSeguridad;
	}
	public void setNivelSeguridad(int nivelSeguridad) {
		this.nivelSeguridad = nivelSeguridad;
	}
	public int getNumeroOperacion() {
		return numeroOperacion;
	}
	public void setNumeroOperacion(int numeroOperacion) {
		this.numeroOperacion = numeroOperacion;
	}
	public long getItem() {
		return item;
	}
	public void setItem(long item) {
		this.item = item;
	}
	
	public BigDecimal getTotActivos() {
		return totActivos;
	}
	public void setTotActivos(BigDecimal totActivos) {
		this.totActivos = totActivos;
	}
	public BigDecimal getTotPassivos() {
		return totPassivos;
	}
	public void setTotPassivos(BigDecimal totPassivos) {
		this.totPassivos = totPassivos;
	}
	public BigDecimal getVlegresos() {
		return vlegresos;
	}
	public void setVlegresos(BigDecimal vlegresos) {
		this.vlegresos = vlegresos;
	}
	public int getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getNifEur() {
		return nifEur;
	}
	public void setNifEur(String nifEur) {
		this.nifEur = nifEur;
	}
	public String getClExtran() {
		return clExtran;
	}
	public void setClExtran(String clExtran) {
		this.clExtran = clExtran;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String appelido2) {
		this.apellido2 = appelido2;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClaveCl() {
		return claveCl;
	}
	public void setClaveCl(String claveCl) {
		this.claveCl = claveCl;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public short getCodSitur() {
		return codSitur;
	}
	public void setCodSitur(short codSitur) {
		this.codSitur = codSitur;
	}
	public int getFechExpedicion() {
		return fechExpedicion;
	}
	public void setFechExpedicion(int fechExpedicion) {
		this.fechExpedicion = fechExpedicion;
	}
	public String getOrganoEmisor() {
		return organoEmisor;
	}
	public void setOrganoEmisor(String organoEmisor) {
		this.organoEmisor = organoEmisor;
	}
	public String getCodigoVia() {
		return codigoVia;
	}
	public void setCodigoVia(String codigoVia) {
		this.codigoVia = codigoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public int getNumVia() {
		return numVia;
	}
	public void setNumVia(int numVia) {
		this.numVia = numVia;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public String getPuerta() {
		return puerta;
	}
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
	public String getBloqueVia() {
		return bloqueVia;
	}
	public void setBloqueVia(String bloqueVia) {
		this.bloqueVia = bloqueVia;
	}
	public String getEscalera() {
		return escalera;
	}
	public void setEscalera(String escalera) {
		this.escalera = escalera;
	}
	public String getNomFon() {
		return nomFon;
	}
	public void setNomFon(String nomFon) {
		this.nomFon = nomFon;
	}
	public String getDomAbrev() {
		return domAbrev;
	}
	public void setDomAbrev(String domAbrev) {
		this.domAbrev = domAbrev;
	}
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	public String getSubCodPost() {
		return subCodPost;
	}
	public void setSubCodPost(String subCodPost) {
		this.subCodPost = subCodPost;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getConcelho() {
		return concelho;
	}
	public void setConcelho(String concelho) {
		this.concelho = concelho;
	}
	public String getPaisDom() {
		return paisDom;
	}
	public void setPaisDom(String paisDom) {
		this.paisDom = paisDom;
	}
	public String getTipoDomicilio() {
		return tipoDomicilio;
	}
	public void setTipoDomicilio(String tipoDomicilio) {
		this.tipoDomicilio = tipoDomicilio;
	}
	public String getDomicilioFamiliar() {
		return domicilioFamiliar;
	}
	public void setDomicilioFamiliar(String domicilioFamiliar) {
		this.domicilioFamiliar = domicilioFamiliar;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getFechaCarnet() {
		return fechaCarnet;
	}
	public void setFechaCarnet(String fechaCarnet) {
		this.fechaCarnet = fechaCarnet;
	}
	public String getFechaCarnetMoto() {
		return fechaCarnetMoto;
	}
	public void setFechaCarnetMoto(String fechaCarnetMoto) {
		this.fechaCarnetMoto = fechaCarnetMoto;
	}
	public String getTipoCarnet() {
		return tipoCarnet;
	}
	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}
	public String getPaisCarnet() {
		return paisCarnet;
	}
	public void setPaisCarnet(String paisCarnet) {
		this.paisCarnet = paisCarnet;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public short getProfesion() {
		return profesion;
	}
	public void setProfesion(short profesion) {
		this.profesion = profesion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTelefono2() {
		return telefono2;
	}
	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getEstadoTelefono1() {
		return estadoTelefono1;
	}
	public void setEstadoTelefono1(String estadoTelefono1) {
		this.estadoTelefono1 = estadoTelefono1;
	}
	public String getEstadoTelefono2() {
		return estadoTelefono2;
	}
	public void setEstadoTelefono2(String estadoTelefono2) {
		this.estadoTelefono2 = estadoTelefono2;
	}
	public String getEstadoEmail() {
		return estadoEmail;
	}
	public void setEstadoEmail(String estadoEmail) {
		this.estadoEmail = estadoEmail;
	}
	public String getConfComEle() {
		return confComEle;
	}
	public void setConfComEle(String confComEle) {
		this.confComEle = confComEle;
	}
	public int getCae() {
		return cae;
	}
	public void setCae(int cae) {
		this.cae = cae;
	}
	public short getCiiu() {
		return ciiu;
	}
	public void setCiiu(short ciiu) {
		this.ciiu = ciiu;
	}
	public short getSituacionLaboral() {
		return situacionLaboral;
	}
	public void setSituacionLaboral(short situacionLaboral) {
		this.situacionLaboral = situacionLaboral;
	}
	public String getImpselo() {
		return impselo;
	}
	public void setImpselo(String impselo) {
		this.impselo = impselo;
	}
	public short getNumeroHijos() {
		return numeroHijos;
	}
	public void setNumeroHijos(short numeroHijos) {
		this.numeroHijos = numeroHijos;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getAfianzado() {
		return afianzado;
	}
	public void setAfianzado(String afianzado) {
		this.afianzado = afianzado;
	}
	public String getFideComitente() {
		return fideComitente;
	}
	public void setFideComitente(String fideComitente) {
		this.fideComitente = fideComitente;
	}
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}
	public String getRobinson() {
		return robinson;
	}
	public void setRobinson(String robinson) {
		this.robinson = robinson;
	}
	public BigDecimal getImportePtmo() {
		return importePtmo;
	}
	public void setImportePtmo(BigDecimal importePtmo) {
		this.importePtmo = importePtmo;
	}
	public short getOrden() {
		return orden;
	}
	public void setOrden(short orden) {
		this.orden = orden;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public long getPis() {
		return pis;
	}
	public void setPis(long pis) {
		this.pis = pis;
	}
	public long getInss() {
		return inss;
	}
	public void setInss(long inss) {
		this.inss = inss;
	}
	public short getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(short rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public String getEmailFac() {
		return emailFac;
	}
	public void setEmailFac(String emailFac) {
		this.emailFac = emailFac;
	}
	public String getNomFantasia() {
		return nomFantasia;
	}
	public void setNomFantasia(String nomFantasia) {
		this.nomFantasia = nomFantasia;
	}
	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public short getFaixaFatur() {
		return faixaFatur;
	}
	public void setFaixaFatur(short faixaFatur) {
		this.faixaFatur = faixaFatur;
	}
	public short getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(short numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	public short getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(short patrimonio) {
		this.patrimonio = patrimonio;
	}
	public String getActividadPrincipal() {
		return actividadPrincipal;
	}
	public void setActividadPrincipal(String actividadPrincipal) {
		this.actividadPrincipal = actividadPrincipal;
	}
	public String getTipoDocTomador() {
		return tipoDocTomador;
	}
	public void setTipoDocTomador(String tipoDocTomador) {
		this.tipoDocTomador = tipoDocTomador;
	}
	public String getDniTomador() {
		return dniTomador;
	}
	public void setDniTomador(String dniTomador) {
		this.dniTomador = dniTomador;
	}
	public String getNombreTomador() {
		return nombreTomador;
	}
	public void setNombreTomador(String nombreTomador) {
		this.nombreTomador = nombreTomador;
	}
	public String getImpostosFatca() {
		return impostosFatca;
	}

	public void setImpostosFatca(String impostosFatca) {
		this.impostosFatca = impostosFatca;
	}

	public String getFechCaduc() {
		return fechCaduc;
	}

	public void setFechCaduc(String fechCaduc) {
		this.fechCaduc = fechCaduc;
	}

	public String getPaisFacturacion() {
		return paisFacturacion;
	}
	public void setPaisFacturacion(String paisFacturacion) {
		this.paisFacturacion = paisFacturacion;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public String getUstin() {
		return ustin;
	}
	public void setUstin(String ustin) {
		this.ustin = ustin;
	}
	public String getPaisTutor() {
		return paisTutor;
	}
	public void setPaisTutor(String paisTutor) {
		this.paisTutor = paisTutor;
	}
	public String getPaisNac() {
		return paisNac;
	}
	public void setPaisNac(String paisNac) {
		this.paisNac = paisNac;
	}
	public String getGiin() {
		return giin;
	}
	public void setGiin(String giin) {
		this.giin = giin;
	}
	public String getTipoEntidad() {
		return tipoEntidad;
	}
	public void setTipoEntidad(String tipoEntidad) {
		this.tipoEntidad = tipoEntidad;
	}
	public String getIfGiin() {
		return ifGiin;
	}
	public void setIfGiin(String ifGiin) {
		this.ifGiin = ifGiin;
	}
	public String getCotBolso() {
		return cotBolso;
	}
	public void setCotBolso(String cotBolso) {
		this.cotBolso = cotBolso;
	}
	public String getPartentFin() {
		return partentFin;
	}
	public void setPartentFin(String partentFin) {
		this.partentFin = partentFin;
	}
	public String getSocioSus() {
		return socioSus;
	}
	public void setSocioSus(String socioSus) {
		this.socioSus = socioSus;
	}
	public String getUsOwnerShip() {
		return usOwnerShip;
	}
	public void setUsOwnerShip(String usOwnerShip) {
		this.usOwnerShip = usOwnerShip;
	}
	public String getPagaImpUsa() {
		return pagaImpUsa;
	}
	public void setPagaImpUsa(String pagaImpUsa) {
		this.pagaImpUsa = pagaImpUsa;
	}
	public String getClasificFatCA() {
		return clasificFatCA;
	}
	public void setClasificFatCA(String clasificFatCA) {
		this.clasificFatCA = clasificFatCA;
	}
	public String getReportable() {
		return reportable;
	}
	public void setReportable(String reportable) {
		this.reportable = reportable;
	}

	public int getRetorno() {
		return retorno;
	}

	public void setRetorno(int retorno) {
		this.retorno = retorno;
	}

	
	public ArrayList<String> getErrores() {
		return errores;
	}

	public void setErrores(ArrayList<String> errores) {
		this.errores = errores;
	}

	public ArrayList<String> getAvisos() {
		return avisos;
	}

	public void setAvisos(ArrayList<String> avisos) {
		this.avisos = avisos;
	}

	public ArrayList<String> getBloqueos() {
		return bloqueos;
	}

	public void setBloqueos(ArrayList<String> bloqueos) {
		this.bloqueos = bloqueos;
	}

	
	
	public String toString(){
		StringBuilder returnValue = new StringBuilder();
		Method[] met = this.getClass().getDeclaredMethods();
		try{
		for (int i = 0; i < met.length; i++) {
			if (met[i].getName().startsWith("get")) {
				String metName = met[i].getName().substring(3);
				Class[] clParams = met[i].getParameterTypes();
				if (clParams.length == 0) {
					Object returned = met[i].invoke(this, new Object[] {});
					String valor = String.valueOf(returned).trim();
					returnValue.append( metName +" : "+ valor+ " \n");
				}
			}
		}
		}catch (Exception e){
			//LogUtil.error("Client", "Error en la muestro por log", e);
		}
		return returnValue.toString();
	}




	public String getCliModif() {
		return cliModif;
	}




	public void setCliModif(String cliModif) {
		this.cliModif = cliModif;
	}




	public String getCnae() {
		return cnae;
	}




	public void setCnae(String cnae) {
		this.cnae = cnae;
	}




	public long getCodigoNascidoVivo() {
		return codigoNascidoVivo;
	}




	public void setCodigoNascidoVivo(long codigoNascidoVivo) {
		this.codigoNascidoVivo = codigoNascidoVivo;
	}




	public String getCodigoProvincia() {
		return codigoProvincia;
	}




	public void setCodigoProvincia(String codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}




	public String getCodNumHijos() {
		return codNumHijos;
	}




	public void setCodNumHijos(String codNumHijos) {
		this.codNumHijos = codNumHijos;
	}




	public String getConocimiento() {
		return conocimiento;
	}




	public void setConocimiento(String conocimiento) {
		this.conocimiento = conocimiento;
	}




	public String getCuenta() {
		return cuenta;
	}




	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}




	public String getDataExpiracaoTin() {
		return dataExpiracaoTin;
	}




	public void setDataExpiracaoTin(String dataExpiracaoTin) {
		this.dataExpiracaoTin = dataExpiracaoTin;
	}




	public String getDescripcionPoblacion() {
		return descripcionPoblacion;
	}




	public void setDescripcionPoblacion(String descripcionPoblacion) {
		this.descripcionPoblacion = descripcionPoblacion;
	}




	public String getDigito() {
		return digito;
	}




	public void setDigito(String digito) {
		this.digito = digito;
	}




	public String getDisponible() {
		return disponible;
	}




	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}




	public String getDniRepresentanteLegal() {
		return dniRepresentanteLegal;
	}




	public void setDniRepresentanteLegal(String dniRepresentanteLegal) {
		this.dniRepresentanteLegal = dniRepresentanteLegal;
	}




	public String getDomicilio() {
		return domicilio;
	}




	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}




	public String getEntidad() {
		return entidad;
	}




	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}




	public String getEstadoFax() {
		return estadoFax;
	}




	public void setEstadoFax(String estadoFax) {
		this.estadoFax = estadoFax;
	}




	public String getEstadoTelefono3() {
		return estadoTelefono3;
	}




	public void setEstadoTelefono3(String estadoTelefono3) {
		this.estadoTelefono3 = estadoTelefono3;
	}




	public Short getFaturamento() {
		return faturamento;
	}




	public void setFaturamento(Short faturamento) {
		this.faturamento = faturamento;
	}




	public String getFechaVtoPrestamo() {
		return fechaVtoPrestamo;
	}




	public void setFechaVtoPrestamo(String fechaVtoPrestamo) {
		this.fechaVtoPrestamo = fechaVtoPrestamo;
	}




	public String getFechComEle() {
		return fechComEle;
	}




	public void setFechComEle(String fechComEle) {
		this.fechComEle = fechComEle;
	}




	public String getFechaModEmail() {
		return fechaModEmail;
	}




	public void setFechaModEmail(String fechaModEmail) {
		this.fechaModEmail = fechaModEmail;
	}




	public String getFlagSharesFinanceiros() {
		return flagSharesFinanceiros;
	}




	public void setFlagSharesFinanceiros(String flagSharesFinanceiros) {
		this.flagSharesFinanceiros = flagSharesFinanceiros;
	}




	public String getGrintnro() {
		return grintnro;
	}




	public void setGrintnro(String grintnro) {
		this.grintnro = grintnro;
	}




	public String getIdiomaDocum() {
		return idiomaDocum;
	}




	public void setIdiomaDocum(String idiomaDocum) {
		this.idiomaDocum = idiomaDocum;
	}




	public String getIrrevocable() {
		return irrevocable;
	}




	public void setIrrevocable(String irrevocable) {
		this.irrevocable = irrevocable;
	}




	public String getLopd() {
		return lopd;
	}




	public void setLopd(String lopd) {
		this.lopd = lopd;
	}




	public String getMunicipio() {
		return municipio;
	}




	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}




	public String getnCarnet() {
		return nCarnet;
	}




	public void setnCarnet(String nCarnet) {
		this.nCarnet = nCarnet;
	}




	public String getnGranCli() {
		return nGranCli;
	}




	public void setnGranCli(String nGranCli) {
		this.nGranCli = nGranCli;
	}




	public String getNombreCompleto() {
		return nombreCompleto;
	}




	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}




	public String getNombreEditable() {
		return nombreEditable;
	}




	public void setNombreEditable(String nombreEditable) {
		this.nombreEditable = nombreEditable;
	}




	public String getNombreRepresentanteLegal() {
		return nombreRepresentanteLegal;
	}




	public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {
		this.nombreRepresentanteLegal = nombreRepresentanteLegal;
	}




	public String getNum() {
		return num;
	}




	public void setNum(String num) {
		this.num = num;
	}




	public String getNumeroBeneficiarios() {
		return numeroBeneficiarios;
	}




	public void setNumeroBeneficiarios(String numeroBeneficiarios) {
		this.numeroBeneficiarios = numeroBeneficiarios;
	}




	public String getNumEmp() {
		return numEmp;
	}




	public void setNumEmp(String numEmp) {
		this.numEmp = numEmp;
	}




	public String getNumeroas() {
		return numeroas;
	}




	public void setNumeroas(String numeroas) {
		this.numeroas = numeroas;
	}




	public String getOficina() {
		return oficina;
	}




	public void setOficina(String oficina) {
		this.oficina = oficina;
	}




	public String getOrigenCli() {
		return origenCli;
	}




	public void setOrigenCli(String origenCli) {
		this.origenCli = origenCli;
	}




	public String getOrigModEmail() {
		return origModEmail;
	}




	public void setOrigModEmail(String origModEmail) {
		this.origModEmail = origModEmail;
	}




	public String getPaisEntidadeLegal() {
		return paisEntidadeLegal;
	}




	public void setPaisEntidadeLegal(String paisEntidadeLegal) {
		this.paisEntidadeLegal = paisEntidadeLegal;
	}




	public String getPaisImpostos() {
		return paisImpostos;
	}




	public void setPaisImpostos(String paisImpostos) {
		this.paisImpostos = paisImpostos;
	}




	public String getPaisOrigen() {
		return paisOrigen;
	}




	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}




	public String getPaisSede() {
		return paisSede;
	}




	public void setPaisSede(String paisSede) {
		this.paisSede = paisSede;
	}




	public String getPaisValidacion() {
		return paisValidacion;
	}




	public void setPaisValidacion(String paisValidacion) {
		this.paisValidacion = paisValidacion;
	}




	public String getPorcentajeBeneficio() {
		return porcentajeBeneficio;
	}




	public void setPorcentajeBeneficio(String porcentajeBeneficio) {
		this.porcentajeBeneficio = porcentajeBeneficio;
	}




	public String getPorcentajeCapital() {
		return porcentajeCapital;
	}




	public void setPorcentajeCapital(String porcentajeCapital) {
		this.porcentajeCapital = porcentajeCapital;
	}




	public String getSelo() {
		return selo;
	}




	public void setSelo(String selo) {
		this.selo = selo;
	}




	public String getStatusFatca() {
		return statusFatca;
	}




	public void setStatusFatca(String statusFatca) {
		this.statusFatca = statusFatca;
	}




	public String getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}




	public void setTaxIdentificationNumber(String taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}




	public String getTelefono3() {
		return telefono3;
	}




	public void setTelefono3(String telefono3) {
		this.telefono3 = telefono3;
	}




	public String getTipo() {
		return tipo;
	}




	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




	public String getTipodo() {
		return tipodo;
	}




	public void setTipodo(String tipodo) {
		this.tipodo = tipodo;
	}



	@Deprecated 
	public String getTipoBeneficiario() {
		return tipoBeneficiario;
	}



	@Deprecated 
	public void setTipoBeneficiario(String tipoBeneficiario) {
		this.tipoBeneficiario = tipoBeneficiario;
	}




	public String getTipoDocRepresentanteLegal() {
		return tipoDocRepresentanteLegal;
	}




	public void setTipoDocRepresentanteLegal(String tipoDocRepresentanteLegal) {
		this.tipoDocRepresentanteLegal = tipoDocRepresentanteLegal;
	}




	public String getUsuaModConf() {
		return usuaModConf;
	}




	public void setUsuaModConf(String usuaModConf) {
		this.usuaModConf = usuaModConf;
	}




	public String getUsuaModEmail() {
		return usuaModEmail;
	}




	public void setUsuaModEmail(String usuaModEmail) {
		this.usuaModEmail = usuaModEmail;
	}




	public String getVia() {
		return via;
	}




	public void setVia(String via) {
		this.via = via;
	}




	public String getVip() {
		return vip;
	}




	public void setVip(String vip) {
		this.vip = vip;
	}




	public String getCodigoPostal() {
		return codigoPostal;
	}




	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}




	public String getDesMunicipio() {
		return desMunicipio;
	}




	public void setDesMunicipio(String desMunicipio) {
		this.desMunicipio = desMunicipio;
	}




	public String getContextLog() {
		return contextLog;
	}

	public String getDigitoControl() {
		return digitoControl;
	}

	public void setDigitoControl(String digitoControl) {
		this.digitoControl = digitoControl;
	}

	public void setContextLog(String contextLog) {
		this.contextLog = contextLog;
	}

	public int getNumBeneficiario() {
		return numBeneficiario;
	}

	public void setNumBeneficiario(int numBeneficiario) {
		this.numBeneficiario = numBeneficiario;
	}

	

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getCoordX() {
		return coordX;
	}

	public void setCoordX(String coordX) {
		this.coordX = coordX;
	}

	public String getCoordY() {
		return coordY;
	}

	public void setCoordY(String coordY) {
		this.coordY = coordY;
	}

	public String getPrfocup() {
		return prfocup;
	}

	public void setPrfocup(String prfocup) {
		this.prfocup = prfocup;
	}

	public String getConfComSms() {
		return confComSms;
	}

	public void setConfComSms(String confComSms) {
		this.confComSms = confComSms;
	}

	public String getResFiscFora() {
		return resFiscFora;
	}

	public void setResFiscFora(String resFiscFora) {
		this.resFiscFora = resFiscFora;
	}

	public String getPaisResFisc() {
		return paisResFisc;
	}

	public void setPaisResFisc(String paisResFisc) {
		this.paisResFisc = paisResFisc;
	}

	public String getTipoDoExt() {
		return tipoDoExt;
	}

	public void setTipoDoExt(String tipoDoExt) {
		this.tipoDoExt = tipoDoExt;
	}

	public String getNumFiscExt() {
		return numFiscExt;
	}

	public void setNumFiscExt(String numFiscExt) {
		this.numFiscExt = numFiscExt;
	}

	public String getResFiscExt() {
		return resFiscExt;
	}

	public void setResFiscExt(String resFiscExt) {
		this.resFiscExt = resFiscExt;
	}

	public String getClasifCcrs() {
		return clasifCcrs;
	}

	public void setClasifCcrs(String clasifCcrs) {
		this.clasifCcrs = clasifCcrs;
	}

	public String getReportCrs() {
		return reportCrs;
	}

	public void setReportCrs(String reportCrs) {
		this.reportCrs = reportCrs;
	}

	public String getFechCadExt() {
		return fechCadExt;
	}

	public void setFechCadExt(String fechCadExt) {
		this.fechCadExt = fechCadExt;
	}

	public String getCodRegime() {
		return codRegime;
	}

	public void setCodRegime(String codRegime) {
		this.codRegime = codRegime;
	}

	public String getDirinstFin() {
		return dirinstFin;
	}

	public void setDirinstFin(String dirinstFin) {
		this.dirinstFin = dirinstFin;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	
	
	
}

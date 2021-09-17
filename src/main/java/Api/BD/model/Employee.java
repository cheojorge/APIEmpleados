package Api.BD.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private int cedula;
	private String usuario;
	private String contrasena;
	
	

	public Employee() {
		
	}

	




	public Employee(String firstName, String lastName, String emailId, int cedula, String usuario, String contrasena) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.cedula = cedula;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "NOMBRE", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "APELLIDO", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "CORREO", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	@Column(name = "CEDULA", nullable = false)
	public int getCedula() {
		return cedula;
	}



	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	
	@Column(name = "USUARIO", nullable = false)
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	@Column(name = "CONTRASEÑA", nullable = false)
	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contraseña) {
		this.contrasena = contraseña;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", cedula=" + cedula + ", usuario=" + usuario + ", contraseña=" + contrasena + "]";
	}

	





	
	
}
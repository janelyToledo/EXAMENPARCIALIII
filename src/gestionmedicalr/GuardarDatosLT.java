/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package CLasesLT;

/**
 *
 * @author LURVIN TOLEDO
 */



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GuardarDatosLT {

    public static void guardarPaciente(PacienteLT paciente) throws SQLException {
        String sql = "INSERT INTO pacientes (nombre, direccion, telefono, edad, diagnostico) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexionLT.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, paciente.getNombre());
            stmt.setString(2, paciente.getDireccion());
            stmt.setString(3, paciente.getTelefono());
            stmt.setInt(4, paciente.getEdad());
            stmt.setString(5, paciente.getDiagnostico());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error SQL al guardar paciente: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    public static void guardarMedico(MedicoLT medico) throws SQLException {
        String sql = "INSERT INTO medicos (nombre, direccion, telefono, edad, especialidad) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexionLT.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, medico.getNombre());
            stmt.setString(2, medico.getDireccion());
            stmt.setString(3, medico.getTelefono());
            stmt.setInt(4, medico.getEdad());
            stmt.setString(5, medico.getEspecialidad());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error SQL al guardar médico: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }
}

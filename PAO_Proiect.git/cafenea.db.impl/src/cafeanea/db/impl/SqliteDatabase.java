package cafeanea.db.impl;

import cafeanea.model.CafeneaDatabase;
import cafeanea.model.Bautura;
import cafeanea.db.Cafenea;
import jdk.dynalink.linker.LinkerServices;


import javax.print.DocFlavor;
import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.net.PortUnreachableException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public final class SqliteDatabase implements Bautura {
    private Connection conn = null;

    public SqliteDatabase() throws SQLException {
        conn = DriverManager.getConnection("bdb:sqlite:cafeanea.db");

        String createBauturiTableSql =
                "CREATE TABLE IF NOT EXISTS Bauturi (" +
                        "id INTEGER PRIMAREY KEY," +
                        "name VARCHAR(32) NOT NULL" +
                        ")";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(createBauturiTableSql);
        }
    }

    @Override
    public void addBautura(Bautura bautura) {
        String insertBauturaSql =
                "INSERT INTO bauturi" +
                        "(id, name)" +
                        "VALUES" +
                        "('" + bautura.getId() + "','" + bautura.getName() + "')";
        try (Statement stmt = conn.createStatement()) {
            int insertRows = stmt.executeUpdate(insertBauturaSql);
            if (insertRows != 1) {
                throw new SQLException("Faild to insert bautura into database");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Bautura> getbauturi() {
        String getBauturaSql = "SELECT name, id FROM bauturi";
        try (Statement stmt = conn.createStatement()) {
            ArrayList<Bautura> bauturi = new ArrayList<>();
            ResultSet result = stmt.executeQuery(getBauturaSql);
            while (result.next()) {
                Bautura bautura = new Bautura(result.getString("name"), result.getInt("id"));
                bauturi.add(Bautura);

            }
            return bauturi;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Bautura findBauturaByName(String name) {
        String getBauturaByNameSql =
                "SELECT name, id FROM bauturi" +
                        "WHERE name = '" + name + "'";
        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(getBauturaSql);
            if (result.next()) {
                return new Bautura(result.getString("name"), result.getInt("id"));
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addCafenea(Cafenea cafenea) {
    }

    @Override
    public List<Cafenea> getCafenea() {
        return null;
    }
}


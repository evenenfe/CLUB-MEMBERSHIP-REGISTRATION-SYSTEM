/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evafe;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.DataBase;

/**
 *
 * @author cherry may tulang
 */
public class Membership {

    private static final String tableName = "membership";

    private int id;
    private String memberid;
    private String firstname;
    private String middlename;
    private String lastname;
    private String birthdate;
    private String year;
    private String gender;
    private String mobile;
    private String payment;

    public Membership(int id, String memberid, String firstname, String middlename, String lastname, String birthdate, String year, String gender, String mobile, String payment) {
        this.id = id;
        
        this.memberid = memberid;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.year = year;
        this.gender = gender;
        this.mobile = mobile;
        this.payment = payment;
    }

    public Membership( String memberid, String firstname, String middlename, String lastname, String birthdate, String year, String gender, String mobile, String payment) {
        this(0, memberid, firstname, middlename, lastname, birthdate, year, gender, mobile, payment);
    }

    public Membership() {
        this("", "", "", "", "", "", "", "", "");
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMemberID() {
        return memberid;
    }

    public void setMemberID(String memberid) {
        this.memberid = memberid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;

    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public void insertmembership() throws SQLException {
        String q = String.format("INSERT INTO %s VALUES(NULL,%s,%s,%s,%s,%s,%s,%s,%s,%s)", tableName, memberid, firstname, middlename, lastname, birthdate, year, gender, mobile, payment);
        DataBase.query(q, true);
    }

    public static Membership getemployeeWithId(int id) throws Exception {
        String q = String.format("SELECT * FROM %s WHERE id = %d", tableName, id);
        ResultSet rs = DataBase.query(q);
        if (!rs.next()) {
            throw new Exception("employee with id " + id + " was not found!");
        }

        Membership a = Membership.getmembershipFromResultSet(rs);
        return a;
    }

    public static ArrayList<Membership> searchemployeeByName(String s) throws SQLException {
        ArrayList<Membership> info = new ArrayList<>();
        String q = String.format("SELECT * from %s WHERE "
                + "memberid LIKE \"%%%s%%\" OR "
                + "firstname LIKE \"%%%s%%\" OR "
                + "middlename LIKE \"%%%s%%\"", tableName, s, s, s);

        ResultSet rs = DataBase.query(q);

        while (rs.next()) {
            System.out.println("found");
            Membership a = getmembershipFromResultSet(rs);
            System.out.println(a);
            info.add(a);

        }

        return info;

    }

    public static Membership getmembershipFromResultSet(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        
        String memberid = rs.getString("memberid");
        String firstname = rs.getString("firstname");
        String middlename = rs.getString("middlename");
        String lastname = rs.getString("lastname");
        String birthdate = rs.getString("birthdate");
        String year = rs.getString("year");
        String gender = rs.getString("gender");
        String mobile = rs.getString("mobile");
        String payment = rs.getString("payment");

        Membership a = new Membership(id,  memberid, firstname, middlename, lastname, birthdate, year, gender, mobile, payment);
        return a;
    }

    public String toString() {
        return String.format(
                "==================\n"
                + "id: %d\n"
                
                + "memberid: %s\n"
                + "firstname:%s \n"
                + "middlename: %s \n"
                + "lastname:  %s\n"
                + "birthdate:  %s\n"
                + "year:  %s\n"
                + "gender:  %s\n"
                + "mobile:  %s\n"
                + "payment: %s\n",
                id,  memberid, firstname, middlename, lastname, birthdate, year, gender, mobile, payment);
    }

    public static String[][] arraylistTo2dArray(ArrayList<Membership> as) {
        int rowSize = as.size();
        int colSize = 10;
        String[][] s = new String[rowSize][colSize];
        for (int i = 0; i < rowSize; i++) {
            Membership a = as.get(i);
            s[i][0] = a.getId() + "";

            s[i][1] = a.getMemberID();
            s[i][2] = a.getFirstname();
            s[i][3] = a.getMiddlename();
            s[i][4] = a.getLastname();
            s[i][5] = a.getBirthdate();
            s[i][6] = a.getYear();
            s[i][7] = a.getgender();
            s[i][8] = a.getMobile();
            s[i][9] = a.getPayment();

        }

        return s;
    }
}

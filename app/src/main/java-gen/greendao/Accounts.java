package greendao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table ACCOUNTS.
 */
public class Accounts {

    private Long id;
    /** Not-null value. */
    private String universe;
    /** Not-null value. */
    private String username;
    /** Not-null value. */
    private String password;
    /** Not-null value. */
    private String lang;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Accounts() {
    }

    public Accounts(Long id) {
        this.id = id;
    }

    public Accounts(Long id, String universe, String username, String password, String lang) {
        this.id = id;
        this.universe = universe;
        this.username = username;
        this.password = password;
        this.lang = lang;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getUniverse() {
        return universe;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUniverse(String universe) {
        this.universe = universe;
    }

    /** Not-null value. */
    public String getUsername() {
        return username;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUsername(String username) {
        this.username = username;
    }

    /** Not-null value. */
    public String getPassword() {
        return password;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPassword(String password) {
        this.password = password;
    }

    /** Not-null value. */
    public String getLang() {
        return lang;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setLang(String lang) {
        this.lang = lang;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
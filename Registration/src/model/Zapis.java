package model;

import javax.persistence.*;

@Entity
@Table(name = "zapisy")
public class Zapis {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="id_uzytkownika")
    private Integer idUzytkownika;

    @Column(name="id_wydarzenia")
    private Integer idWydarzenia;

    @Column(name="typ_uczestnictwa")
    private String typUczestnictwa;

    @Column(name="wyzywienie")
    private String wyzywienie;

    @Column(name="zgoda")
    private String zgoda;

    public Zapis(){}

    public Zapis(Integer id, Integer idUzytkownika, Integer idWydarzenia, String typUczestnictwa, String wyzywienie) {
        this.id = id;
        this.idUzytkownika = idUzytkownika;
        this.idWydarzenia = idWydarzenia;
        this.typUczestnictwa = typUczestnictwa;
        this.wyzywienie = wyzywienie;
    }

    public Zapis(Integer idUzytkownika, Integer idWydarzenia, String typUczestnictwa, String wyzywienie) {
        this.idUzytkownika = idUzytkownika;
        this.idWydarzenia = idWydarzenia;
        this.typUczestnictwa = typUczestnictwa;
        this.wyzywienie = wyzywienie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUzytkownika() {
        return idUzytkownika;
    }

    public void setIdUzytkownika(Integer idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    public Integer getIdWydarzenia() {
        return idWydarzenia;
    }

    public void setIdWydarzenia(Integer idWydarzenia) {
        this.idWydarzenia = idWydarzenia;
    }

    public String getTypUczestnictwa() {
        return typUczestnictwa;
    }

    public void setTypUczestnictwa(String typUczestnictwa) {
        this.typUczestnictwa = typUczestnictwa;
    }

    public String getWyzywienie() {
        return wyzywienie;
    }

    public void setWyzywienie(String wyzywienie) {
        this.wyzywienie = wyzywienie;
    }

    public String getZgoda() {
        return zgoda;
    }

    public void setZgoda(String zgoda) {
        this.zgoda = zgoda;
    }
}

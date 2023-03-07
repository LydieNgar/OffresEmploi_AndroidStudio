package sn.esmt.jobapp.httpconfig;

public class CVResponse {

    private  int id;
    private String prenom;

    private String nom;

    private String email;

    private String adresse;
    private String telephone;
    private String specialite;
    private String age;
    private String niveauEtude;
    private String experienceProfessionnelle;


    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void setNiveauEtude(String niveauEtude) {
        this.niveauEtude = niveauEtude;
    }

    public void setExperienceProfessionnelle(String experienceProfessionnelle) {
        this.experienceProfessionnelle = experienceProfessionnelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNiveauEtude() {
        return niveauEtude;
    }

    public String getExperienceProfessionnelle() {
        return experienceProfessionnelle;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public CVResponse(int id) {
        this.id = id;
    }

    public CVResponse() {
    }
}


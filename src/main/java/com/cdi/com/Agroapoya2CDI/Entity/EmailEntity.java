package com.cdi.com.Agroapoya2CDI.Entity;

public class EmailEntity {

    public String email;
    public String content;
    public String subject;
    public Integer TipoUsu;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getTipoUsu() {
        return TipoUsu;
    }

    public void setTipoUsu(Integer TipoUsu) {
        this.TipoUsu = TipoUsu;
    }

    @Override
    public String toString() {
        return "EmailBody [email=" + email + ", content=" + content + ", subject=" + subject + ", TipoUsu=" + TipoUsu + "]";
    }
}

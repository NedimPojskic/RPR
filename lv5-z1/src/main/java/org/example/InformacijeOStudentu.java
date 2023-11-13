package org.example;

public class InformacijeOStudentu extends LicneInformacije implements Interfejs {
    String godinaStudija, brojIndexa;

    public String getGodinaStudija() { return godinaStudija; }
    public String getBrojIndexa() { return brojIndexa; }

    public void setGodinaStudija(String x) { godinaStudija = x; }
    public void setBrojIndexa(String x) { brojIndexa = x; }

    @Override
    public String predstavi() {
        return ime + " " + prezime + ", godina studija: " + godinaStudija + ", broj indexa: " + brojIndexa;
    }
}

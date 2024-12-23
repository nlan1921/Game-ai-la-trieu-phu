/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AiLaTrieuPhu;

/**
 *
 * @author ADMIN PC
 */
public class CauHoi {

    private int maso;
    private String cauhoi;
    private String audio;
    private String dap1;
    private String dap2;
    private String dap3;
    private String dap4;
    private String ketqua;

    public CauHoi() {
    }

    public CauHoi(int maso, String cauhoi, String audio, String dap1, String dap2, String dap3, String dap4, String ketqua) {
        this.maso = maso;
        this.cauhoi = cauhoi;
        this.audio = audio;
        this.dap1 = dap1;
        this.dap2 = dap2;
        this.dap3 = dap3;
        this.dap4 = dap4;
        this.ketqua = ketqua;
    }

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public String getCauhoi() {
        return cauhoi;
    }

    public void setCauhoi(String cauhoi) {
        this.cauhoi = cauhoi;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getDap1() {
        return dap1;
    }

    public void setDap1(String dap1) {
        this.dap1 = dap1;
    }

    public String getDap2() {
        return dap2;
    }

    public void setDap2(String dap2) {
        this.dap2 = dap2;
    }

    public String getDap3() {
        return dap3;
    }

    public void setDap3(String dap3) {
        this.dap3 = dap3;
    }

    public String getDap4() {
        return dap4;
    }

    public void setDap4(String dap4) {
        this.dap4 = dap4;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }

    
    
}

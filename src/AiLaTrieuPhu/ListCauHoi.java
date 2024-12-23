/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AiLaTrieuPhu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author ADMIN PC
 */
public class ListCauHoi {
    ArrayList<CauHoi> listch=new ArrayList<>();
    
    public void KhoiTaoCauHoi()
    {
//        CauHoi c1=new CauHoi(1,"Loại cá nào bé hơn cả?", "src/AiLaTrieuPhu/AudioAiLaTrieuPhu/cau1.wav", "A : Voi","B : Bống ","C : Mập", "D : Heo", "dap2");
//        listch.add(c1);
//        CauHoi c2=new CauHoi(2,"Từ < chang chang > Thường miêu tã hiện tương gì?", "src/AiLaTrieuPhu/AudioAiLaTrieuPhu/cau2.wav", "A : Bão","B : Khói ","C : Lốc", "D : Nắng", "dap4");
//        listch.add(c2);
//        CauHoi c3=new CauHoi(3,"Brussel là thành phố thuộc đất nước nào?", "src/AiLaTrieuPhu/AudioAiLaTrieuPhu/cau3.wav", "A : Công -Go","B : Bỉ ","C : Ai Cập", "D : Iran", "dap2");
//        listch.add(c3);
//        CauHoi c4=new CauHoi(4,"Trên thế giới không có tên biển nào sau đây?", "src/AiLaTrieuPhu/AudioAiLaTrieuPhu/cau4.wav", "A : Biển chết","B : Biển đỏ ","C : Biển đen", "D :Biển xám", "dap4");
//        listch.add(c4);
//        CauHoi c5=new CauHoi(5,"Đâu là tên bài hát của nhạc sĩ Anh Quân - Dương Thụ?", "src/AiLaTrieuPhu/AudioAiLaTrieuPhu/cau5.wav", "A : Hương sầu riêng","B : Hương húng quế ","C : Hương bưởi", "D : Hương ngọc lan", "dap4");
//        listch.add(c5);
        try {
            FileReader fr=new FileReader("src/AiLaTrieuPhu/filecauhoi.txt");
            BufferedReader br=new BufferedReader(fr);
            String line="";
            while (true) {                
                line=br.readLine();
                if(line==null)
                {
                    break;
                }
                CauHoi ch=new CauHoi();
                String txt[]=line.split(",");
                ch.setMaso(Integer.parseInt(txt[0]));
                ch.setCauhoi(txt[1]);
                ch.setAudio(txt[2]);
                ch.setDap1(txt[3]);
                ch.setDap2(txt[4]);
                ch.setDap3(txt[5]);
                ch.setDap4(txt[6]);
                ch.setKetqua(txt[7]);
                listch.add(ch);
            }
        } catch (Exception e) {
        }
    }

    public ListCauHoi() {
    }

    public ArrayList<CauHoi> getListch() {
        return listch;
    }

    public void setListch(ArrayList<CauHoi> listch) {
        this.listch = listch;
    }
    
    
}

package com.example.samariddin.uzbcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.*;

 public class MainActivity extends AppCompatActivity {
  public TextView textView;// = (TextView)findViewById(R.id.ekran);
    public TextView textView1;// = (TextView)findViewById(R.id.ekran1);
    public Button btn1,btn2,btn3,btn4,btn5,btn6, btn7,btn8,btn9;
    public Button btn_nol,btn_nol2;
    public Button btn_plmn1,btn_kupp1,btn_bull,btn_ayrr1,btn_qushh1;
    public Button btn_fakk,btn_tozalash,btn_orqaga,btn_ildzz,btn_nuqta,btn_teng,btn_undr,btn_foiz,btn_taqsm;
    public String sonn = "",labelekaranga="";
    public String amal = "", amal1 = "", kup_a = "", bul_a = "", qush_a = "", amal2 = "";
    public Double a = 0.0, b = 0.0,son1=0.0,son2=0.0,son3=0.0,son4=0.0,son5=0.0;
    public String vaqtincha="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.ekran);
        textView1 = findViewById(R.id.ekran1);
        btn1= findViewById(R.id.bir);
        btn2= findViewById(R.id.ikki);
        btn3= findViewById(R.id.uch);
        btn4= findViewById(R.id.turt);
        btn5= findViewById(R.id.besh);
        btn6= findViewById(R.id.olti);
        btn7= findViewById(R.id.yetti);
        btn8= findViewById(R.id.sakkiz);
        btn9= findViewById(R.id.toqqiz);
        btn_nol= findViewById(R.id.nol);
        btn_nol2= findViewById(R.id.nol2);
        btn_nuqta= findViewById(R.id.nuqta);
        btn_undr= findViewById(R.id.undr);
        btn_teng= findViewById(R.id.teng);
        btn_fakk= findViewById(R.id.fakk);
        btn_foiz= findViewById(R.id.foiz);
        btn_qushh1= findViewById(R.id.qushh);
        btn_taqsm= findViewById(R.id.taqsm);
        btn_ayrr1= findViewById(R.id.ayrr);
        btn_ildzz= findViewById(R.id.ildzz);
        btn_tozalash= findViewById(R.id.tozlash);
        btn_orqaga= findViewById(R.id.orqaga);
        btn_bull= findViewById(R.id.bull);
        btn_kupp1= findViewById(R.id.kupp);
        btn_plmn1= findViewById(R.id.plmn);

        View.OnClickListener onClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.bir:
                    {sonlar("1");text_b(); }break;
                    case R.id.ikki:
                    {sonlar("2");text_b(); }break;
                    case R.id.uch:
                    {sonlar("3");text_b(); }break;
                    case R.id.turt:
                    {sonlar("4");text_b(); }break;
                    case R.id.besh:
                    {sonlar("5");text_b(); }break;
                    case R.id.olti:
                    {sonlar("6");text_b(); }break;
                    case R.id.yetti:
                    {sonlar("7");text_b(); }break;
                    case R.id.sakkiz:
                    {sonlar("8");text_b(); }break;
                    case R.id.toqqiz:
                    {sonlar("9");text_b(); }break;
                    case R.id.nol:
                    {sonlar("0");text_b(); }break;
                    case R.id.nol2:
                    {sonlar("00");text_b(); }break;
                    case R.id.nuqta:
                    {sonlar(".");text_b(); }break;
                    case R.id.qushh:
                    { amal_q();  text_b(); }break;
                    case R.id.ayrr:
                    { amal_a();  text_b(); }break;
                    case R.id.teng:
                    { natija_teng();  text_b(); }break;
                    case R.id.kupp:
                    { amal_k();  text_b(); }break;
                    case R.id.bull:
                    { amal_b();  text_b(); }break;
                    case R.id.taqsm:
                    { butun_btn();  text_b(); }break;
                    case R.id.ildzz:
                    { ildiz_btn();  text_b(); }break;
                    case R.id.plmn:
                    { ishora_btn();  text_b(); }break;
                    case R.id.tozlash:
                    { c_btn();  text_b(); }break;
                    case R.id.orqaga:
                    { ortga();  text_b(); }break;
                    case R.id.fakk:
                    { fak_btn();  text_b(); }break;
                    case R.id.undr:
                    { ten_btn();  text_b(); }break;
                }
            }
        };
        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);
        btn4.setOnClickListener(onClickListener);
        btn5.setOnClickListener(onClickListener);
        btn6.setOnClickListener(onClickListener);
        btn7.setOnClickListener(onClickListener);
        btn8.setOnClickListener(onClickListener);
        btn9.setOnClickListener(onClickListener);
        btn_nol.setOnClickListener(onClickListener);
        btn_nol2.setOnClickListener(onClickListener);
        btn_nuqta.setOnClickListener(onClickListener);
        btn_undr.setOnClickListener(onClickListener);
        btn_teng.setOnClickListener(onClickListener);
        btn_fakk.setOnClickListener(onClickListener);
        btn_foiz.setOnClickListener(onClickListener);
        btn_qushh1.setOnClickListener(onClickListener);
        btn_taqsm.setOnClickListener(onClickListener);
        btn_ayrr1.setOnClickListener(onClickListener);
        btn_ildzz.setOnClickListener(onClickListener);
        btn_tozalash.setOnClickListener(onClickListener);
        btn_orqaga.setOnClickListener(onClickListener);
        btn_kupp1.setOnClickListener(onClickListener);
        btn_bull.setOnClickListener(onClickListener);
        btn_plmn1.setOnClickListener(onClickListener);


    }
     public void sonlar( String belgi)
     {
         switch(amal)
         {
             case "+": quashing(); break;
             case "-": ayrish(); break;
             case "*": kupaytirtish(); break;
             case "/": bulish(); break;

         }
         switch(belgi)
         {
             case "1":{ sonn += "1"; labelekaranga += "1";} break;
             case "2":{ sonn += "2"; labelekaranga += "2";} break;
             case "3":{ sonn += "3"; labelekaranga += "3";} break;
             case "4":{ sonn += "4"; labelekaranga += "4";} break;
             case "5":{ sonn += "5"; labelekaranga += "5";} break;
             case "6": {sonn += "6"; labelekaranga += "6";} break;
             case "7": {sonn += "7"; labelekaranga += "7";} break;
             case "8":{ sonn += "8"; labelekaranga += "8"; }break;
             case "9": {sonn += "9"; labelekaranga += "9";} break;
             case "0":{ sonn += "0"; labelekaranga += "0";} break;
             case "00": {sonn += "00"; labelekaranga += "00";} break;

             case ".":{
                 int kk=0;
                 for(int i=0;i<sonn.length();i++)
                 {

                     if(sonn.substring(i,i+1).equals("."))
                     {
                         kk=1;break;
                     }
                 }
                 if(kk==0){sonn += "."; labelekaranga += ".";}
             } break;
         }

         // MessageBox.Show(sonn);
     }
     public void text_b()
     {
         // tb.Text = sonn;
         textView1.setText(sonn);
         //tb1.Text = labelekaranga;
         textView.setText(labelekaranga);
     }
     public void natija_teng()
     {
         // sonlar(amal1);
         // MessageBox.Show(amal2);
         // amal = amal1;
         switch (amal2)
         {
             case "+": { quashing(); labelekaranga =String.valueOf(son1); sonn =String.valueOf(son1); } break;
             case "-": { ayrish(); labelekaranga = String.valueOf(son1); sonn= String.valueOf(son1); } break;
             case "*": { kupaytirtish(); labelekaranga = String.valueOf(son2); sonn=String.valueOf(son2); } break;

             case "/": { bulish(); labelekaranga =String.valueOf(son4);  sonn = String.valueOf(son4); } break;


         }
         // MessageBox.Show(a.ToString());
         // labelekaranga = a.ToString();
         amal2 = "";
         // amal = "";
         // sonn = a.ToString();

     }
     public void amal_q()
     {
         if(labelekaranga.length()>0)
         { amal = "+";
         kup_marta_bosish();

         labelekaranga += "+";}
         else {
             toastga();
         }

     }
     public void amal_a()
     {

         if(labelekaranga.length()>0)
         { amal = "-";
             kup_marta_bosish();

             labelekaranga += "-";}
         else {
             toastga();
         }

     }
     public void amal_k()
     {
         if(labelekaranga.length()>0)
         { amal = "*";
             kup_marta_bosish();

             labelekaranga += "*";}
         else {
             toastga();
         }
     }
     public void amal_b()
     {

         if(labelekaranga.length()>0)
         { amal = "/";
             kup_marta_bosish();

             labelekaranga += "/";}
         else {
             toastga();
         }
     }
     public void kup_marta_bosish()
     {
         String amalga = labelekaranga.substring(labelekaranga.length() - 1, labelekaranga.length());

         if (amalga.equals("+")|| amalga.equals("-")|| amalga.equals("*")|| amalga.equals("/"))
         {
             labelekaranga = labelekaranga.substring(0, labelekaranga.length() - 1);

         }
     }
     public void ortga()
     {
         if(sonn.length()>0) {
             String amalga = labelekaranga.substring(labelekaranga.length() - 1, labelekaranga.length());
             //MessageBox.Show(amalga);
             if ((!amalga.equals("+") && !amalga.equals("-") && !amalga.equals("*") && !amalga.equals("/"))) {
                 labelekaranga = labelekaranga.substring(0, labelekaranga.length() - 1);
                 sonn = sonn.substring(0, sonn.length() - 1);
             }
         }
         else {
             toastga();
         }
     }
     public void c_btn()
     {
         amal1 = "";
         amal = "";
         sonn = "";
         labelekaranga = "";
         a = 0.0; b = 0.0;
         sonn = "";labelekaranga="";
         amal = ""; amal1 = "";kup_a= "";bul_a= "";qush_a= "";amal2="";
         a = 0.0; b = 0.0; son1 = 0.0; son2 = 0.0; son3 = 0.0; son4 = 0.0; son5 = 0.0;
         vaqtincha = "";
     }
     public void ishora_btn()
     {

        if(sonn.length()>0) {
            boolean kirgan = false;
            Double q=Double.parseDouble(sonn);//.doubleValue();
            for (int i = 1; i < labelekaranga.length(); i++)
            {
                if (labelekaranga.substring(i, i+1).equals("+")|| labelekaranga.substring(i, i+1).equals("-")|| labelekaranga.substring(i, i+1).equals("*") || labelekaranga.substring(i,i+1).equals("/"))
                {
                    //  MessageBox.Show(labelekaranga.Substring(i, 1),"jhg");
                    labelekaranga = labelekaranga.substring(0, i + 1);
                    if (q > 0)
                    {
                        labelekaranga += "(-" +String.valueOf(q) + ")";
                        q = q * (-1);

                    }
                    else
                    {
                        q = q * (-1);
                        labelekaranga += String.valueOf(q);
                    }
                    kirgan = true;
                    sonn = String.valueOf(q);
                    break;

                }
            }
            if(!kirgan)
            {
                q = q * (-1);
                labelekaranga = String.valueOf(q);
                sonn = String.valueOf(q);
            }

        }
        else
        {
           toastga();
        }


     }
     public void butun_btn()
     {
         if(sonn.length()>0) {
             boolean kirgan = false;
             Double q = Double.parseDouble(sonn);//.doubleValue();// Convert.ToDouble(sonn);

             for (int i = 1; i < labelekaranga.length(); i++) {
                 if (labelekaranga.substring(i, i + 1).equals("+") || labelekaranga.substring(i, i + 1).equals("-") || labelekaranga.substring(i, i + 1).equals("*") || labelekaranga.substring(i, i + 1).equals("/")) {

                     labelekaranga = labelekaranga.substring(0, i + 1);

                     q = 1 / q;
                     labelekaranga += String.valueOf(q);

                     kirgan = true;
                     sonn = String.valueOf(q);
                     break;

                 }
             }
             if (!kirgan) {
                 q = 1 / q;
                 labelekaranga = String.valueOf(q);
                 sonn = String.valueOf(q);
             }
         }
         else {
             toastga();
         }
         }
     public void ildiz_btn()
     {
         if(sonn.length()>0) {
             boolean kirgan = false;
             Double q = Double.parseDouble(sonn);// Convert.ToDouble(sonn);

             for (int i = 1; i < labelekaranga.length(); i++) {
                 if (labelekaranga.substring(i, i + 1).equals("+") || labelekaranga.substring(i, i + 1).equals("-") || labelekaranga.substring(i, i + 1).equals("*") || labelekaranga.substring(i, i + 1).equals("/")) {
                     //  MessageBox.Show(labelekaranga.Substring(i, 1),"jhg");
                     labelekaranga = labelekaranga.substring(0, i + 1);

                     q = Math.sqrt(q);
                     //q= FloatMath(q);
                     labelekaranga += String.valueOf(q);

                     kirgan = true;
                     sonn = String.valueOf(q);
                     break;

                 }
             }
             if (!kirgan) {
                 q = Math.sqrt(q);
                 labelekaranga = String.valueOf(q);
                 sonn = String.valueOf(q);
             }
         }
         else{
             toastga();
         }
     }
     public void fak_btn()
     {
        if(sonn.length()>0) {
            boolean kirgan = false;
            Double q;
            q = Double.parseDouble(sonn);

            for (int i = 1; i < labelekaranga.length(); i++) {
                if (labelekaranga.substring(i, i + 1).equals("+") || labelekaranga.substring(i, i + 1).equals("-") || labelekaranga.substring(i, i + 1).equals("*") || labelekaranga.substring(i, i + 1).equals("/")) {

                    labelekaranga = labelekaranga.substring(0, i + 1);
                    double fakk = 1;
                    for (int f = 1; f <= q; f++) {
                        fakk *= f;
                    }
                    q = fakk;
                    labelekaranga += String.valueOf(q);

                    kirgan = true;
                    sonn = String.valueOf(q);
                    break;

                }
            }
            if (!kirgan) {
                double fakk = 1;
                for (int f = 1; f <= q; f++) {
                    fakk *= f;
                }
                q = fakk;
                labelekaranga = String.valueOf(q);
                sonn = String.valueOf(q);
            }
        }
        else {
            toastga();
        }
     }
     public void ten_btn()
     {
         if(sonn.length()>0){
             boolean kirgan = false;
             Double q = Double.parseDouble(sonn);// Convert.ToDouble(sonn);

             for (int i = 1; i < labelekaranga.length(); i++) {
                 if (labelekaranga.substring(i, i + 1).equals("+") || labelekaranga.substring(i, i + 1).equals("-") || labelekaranga.substring(i, i + 1).equals("*") || labelekaranga.substring(i, i + 1).equals("/")) {
                     //  MessageBox.Show(labelekaranga.Substring(i, 1),"jhg");
                     labelekaranga = labelekaranga.substring(0, i + 1);

                     q = Math.pow(10, q);
                     labelekaranga += String.valueOf(q);// q.ToString();

                     kirgan = true;
                     sonn = String.valueOf(q);
                     break;

                 }
             }
             if (!kirgan) {
                 q = Math.pow(10, q);
                 labelekaranga = String.valueOf(q);
                 sonn = String.valueOf(q);
             }
         }
         else{
        toastga();
         }
     }

     public void quashing()
     {

         //b = Convert.ToDouble(sonn);
         b=Double.parseDouble(sonn);

         if (qush_a.equals("")) {
             if (kup_a.equals("*")) {
                 son2 *= b;
                 son1 = son2-son1;

             }
             else if (bul_a.equals("/")) {
                 son4 /= b;
                 son1 = son4-son1;

             }
             else {
                 son1 = b;
             }

         }

         switch (amal2) {
             case "*":
                 son3 = b;
                 son2 *= son3;
                 if (qush_a.equals("+")) {
                     son1 += son2;
                 } else if (qush_a.equals("-")) {
                     son1 -= son2;
                 }
                 kup_a = "";
                 break;
             case "/":
                 son5 = b;
                 son4 /= son5;
                 if (qush_a.equals("+")) {
                     son1 += son4;
                 } else if (qush_a.equals("-")) {
                     son1 -= son4;
                 }
                 bul_a = "";
                 break;
             case "+":
                 son1 += b;
                 break;
             case "-":
                 son1 -= b;
                 break;
         }
         amal2 = "+";
         qush_a = "+";

         amal = "";
         sonn = "";
         // vaqtincha = son1.toString() + amal2;
         vaqtincha=String.valueOf(son1)+amal2;
         labelekaranga = vaqtincha;
     }
     public void ayrish()

     {

         //b= Convert.ToDouble(sonn);
         b=Double.parseDouble(sonn);
         if (qush_a.equals("") ) {
             if (kup_a.equals("*")) {
                 son2 *= b;
                 son1 = son2-son1;

             }
             else if (bul_a.equals("/")) {
                 son4 /= b;
                 son1 = son4-son1;
             }
             else {
                 son1 = b;
             }

         }
         if (amal2.equals("*")) {
             son3 = b;
             son2 *= son3;
             if (qush_a.equals("+"))
             { son1 += son2; }
             else if (qush_a.equals("-")) {
                 son1 -= son2;
             }
             kup_a = "";
         }
         else if (bul_a.equals("/")) {
             son5 = b;
             son4 /= son5;
             if (qush_a.equals("+"))
             { son1 += son4; }
             else if (qush_a.equals("-")) {
                 son1 -= son4;
             }
             bul_a = "";
         }
         else if (amal2.equals("+")) {
             son1 += b;
         }
         else if (qush_a.equals("-")) {
             son1 -= b;
         }

         qush_a = "-";
         amal2 = "-";
         amal = "";
         sonn = "";
         // vaqtincha = son1.ToString() + amal2;
         vaqtincha=String.valueOf(son1)+amal2;
         labelekaranga = vaqtincha;

     }
     public void kupaytirtish()
     {
         // b = Convert.ToDouble(sonn);
         b=Double.parseDouble(sonn);
         if (kup_a.equals(""))
             if (bul_a.equals("/")) {
                 son4 /= b;
                 son2 = son4;
                 bul_a = "";
             } else {
                 son2 = b;
             }
         else
         {
             son3 = b;
         }
         kup_a = "*";
         if (amal2.equals("*"))
         {
             son2 = son3 * son2;
         }
         amal2 = "*";
         amal = "";
         sonn = "";
         //vaqtincha = son2.ToString() + kup_a;
         vaqtincha=String.valueOf(son2)+kup_a;
         boolean kirgan = false;
         for (int i = 1; i < labelekaranga.length();i++ )
         {
             if (labelekaranga.substring(i, i+1).equals("+") || labelekaranga.substring(i, i+1).equals("-"))
             {
                 labelekaranga = labelekaranga.substring(0, i + 1); kirgan = true; break;
             }
         }
         if (kirgan)
         {
             labelekaranga += vaqtincha;
         }
         else { labelekaranga = vaqtincha; }

     }
     public void bulish()
     {
         // b = Convert.ToDouble(sonn);
         b=Double.parseDouble(sonn);
         if (bul_a.equals(""))
         {

             if (kup_a.equals("*"))
             {
                 son2 *= b;
                 son4 = son2;
                 kup_a = "";
             }
             else
             {
                 son4 = b;
             }
         }
         else
         {
             son5 = b;
         }
         bul_a = "/";
         if (amal2.equals("/"))
         {
             son4 = son4 / son5;
         }
         amal2 = "/";
         amal = "";
         sonn = "";
         //vaqtincha = son4.ToString() + bul_a;
         vaqtincha=String.valueOf(son4)+bul_a;
         boolean kirgan = false;
         for (int i = 1; i < labelekaranga.length(); i++)
         {
             if (labelekaranga.substring(i, i+1).equals("+") || labelekaranga.substring(i, i+1).equals("-"))
             {
                 labelekaranga = labelekaranga.substring(0, i + 1); kirgan = true; break;
             }
         }
         if (kirgan)
         {
             labelekaranga += vaqtincha;
         }
         else { labelekaranga = vaqtincha; }
     }

     public  void toastga()
     {
         Toast toast=Toast.makeText(this," Oxirgi bajargan amalingizda hatolik bor!",Toast.LENGTH_SHORT);
         toast.setGravity(Gravity.CENTER,0,0);
         toast.show();
     }

 }
